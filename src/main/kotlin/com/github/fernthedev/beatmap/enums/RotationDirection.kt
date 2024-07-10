package com.github.fernthedev.beatmap.enums

import com.github.fernthedev.beatmap.IntEnum
import com.github.fernthedev.beatmap.IntEnumSerializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = RotationDirectionTypeSerializer::class)
enum class RotationDirection(override val value: Int) : IntEnum {
    Automatic(0),
    Clockwise(1),
    Counterclockwise(2);

    companion object : IntEnum.Factory<RotationDirection> {
        override fun fromValue(value: Int): RotationDirection {
            return entries.first { it.value == value }
        }
    }
}

object RotationDirectionTypeSerializer : KSerializer<RotationDirection> by IntEnumSerializer.create(RotationDirection)
