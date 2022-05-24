package com.mixsteroids.tools.sdk.remote

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.http.*

class HttpClientFactory(
    log_level: HttpLogLevel = HttpLogLevel.NONE,
    request_timeout_ms: Long = 60_000,
    connection_timeout_ms: Long = 60_000,
    socket_timeout_ms: Long = 60_000,
) {
    private val requestTimeoutMs = request_timeout_ms
    private val connectionTimeoutMs = connection_timeout_ms
    private val socketTimeoutMs = socket_timeout_ms

    private val logLevel: LogLevel = when (log_level) {
        HttpLogLevel.ALL -> LogLevel.ALL
        HttpLogLevel.HEADERS -> LogLevel.HEADERS
        HttpLogLevel.BODY -> LogLevel.BODY
        HttpLogLevel.INFO -> LogLevel.INFO
        HttpLogLevel.NONE -> LogLevel.NONE
    }

    fun build(): HttpClient = HttpClient(OkHttp) {

        install(Logging) {
            logger = Logger.DEFAULT
            level = logLevel
        }

        install(JsonFeature) {
            serializer = GsonSerializer {
                setLenient()
                setPrettyPrinting()
                serializeNulls()
                disableHtmlEscaping()
            }
            acceptContentTypes = acceptContentTypes + ContentType.Any
        }

        install(HttpTimeout) {
            requestTimeoutMillis = requestTimeoutMs
            connectTimeoutMillis = connectionTimeoutMs
            socketTimeoutMillis = socketTimeoutMs
        }
    }
}
