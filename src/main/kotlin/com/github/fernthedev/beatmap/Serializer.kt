package com.github.fernthedev.beatmap

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

interface IntEnum {
    val value: Int

    interface Factory<T : IntEnum> {
        fun fromValue(value: Int): T
    }
}

object IntEnumSerializer : KSerializer<IntEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("IntEnum", PrimitiveKind.INT)

    override fun serialize(encoder: Encoder, value: IntEnum) {
        encoder.encodeInt(value.value)
    }

    override fun deserialize(decoder: Decoder): IntEnum {
        throw SerializationException("Cannot deserialize without a concrete type")
    }

    inline fun <reified T> create(factory: IntEnum.Factory<T>): KSerializer<T> where T : IntEnum {
        return object : KSerializer<T> {
            override val descriptor: SerialDescriptor =
                PrimitiveSerialDescriptor("IntEnum", PrimitiveKind.INT)

            override fun serialize(encoder: Encoder, value: T) {
                encoder.encodeInt(value.value)
            }

            override fun deserialize(decoder: Decoder): T {
                val value = decoder.decodeInt()
                return factory.fromValue(value)
            }
        }
    }
}