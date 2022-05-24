package com.mixsteroids.tools.sdk.remote.serializer

import com.mixsteroids.tools.sdk.util.extension.tryLocalDate
import kotlinx.datetime.LocalDate
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class LocalDateSerializer : KSerializer<LocalDate?> {

    private val delegate = String.serializer().nullable

    override val descriptor: SerialDescriptor get() = delegate.descriptor
    override fun deserialize(decoder: Decoder): LocalDate? = delegate.deserialize(decoder)?.tryLocalDate()
    override fun serialize(encoder: Encoder, value: LocalDate?) = delegate.serialize(encoder, value?.toString())

}
