package com.github.fernthedev.beatmap.enums

import com.github.fernthedev.beatmap.IntEnum
import com.github.fernthedev.beatmap.IntEnumSerializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = AxisSerializer::class)
enum class Axis(override val value: Int) : IntEnum {
    X(1),
    Y(2),
    Z(3);

    companion object : IntEnum.Factory<Axis> {
        override fun fromValue(value: Int): Axis = entries.first { it.value == value }
    }
}

object AxisSerializer : KSerializer<Axis> by IntEnumSerializer.create(Axis)