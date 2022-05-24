package com.mixsteroids.tools.sdk.remote.serializer

import com.mixsteroids.tools.sdk.util.extension.tryLocalDateTime
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class LocalDateTimeSerializer : KSerializer<LocalDateTime?> {

    private val delegate = String.serializer().nullable

    override val descriptor: SerialDescriptor get() = delegate.descriptor
    override fun deserialize(decoder: Decoder): LocalDateTime? = delegate.deserialize(decoder)?.tryLocalDateTime()
    override fun serialize(encoder: Encoder, value: LocalDateTime?) = delegate.serialize(encoder, value?.toString())

}
