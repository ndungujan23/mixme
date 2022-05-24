package com.mixsteroids.tools.sdk.util.extension

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.util.pipeline.*

typealias RequestInterceptor = suspend (HttpRequestBuilder) -> Unit
typealias ResponseInterceptor = suspend (HttpClientCall) -> Unit

fun HttpClient.interceptRequest(phase: PipelinePhase = HttpRequestPipeline.Render, interceptor: RequestInterceptor) =
    requestPipeline.intercept(phase) { interceptor(context) }

/**
 * Interceptor for throwing an exception must run before [HttpResponsePipeline.Transform] phase.
 */
fun HttpClient.interceptResponse(phase: PipelinePhase = HttpResponsePipeline.Parse, interceptor: ResponseInterceptor) =
    responsePipeline.intercept(phase) { interceptor(context) }

