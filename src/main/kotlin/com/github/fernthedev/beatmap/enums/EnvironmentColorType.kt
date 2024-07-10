package com.github.fernthedev.beatmap.enums

import com.github.fernthedev.beatmap.IntEnum
import com.github.fernthedev.beatmap.IntEnumSerializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = EnvironmentColorTypeSerializer::class)
enum class EnvironmentColorType(override val value: Int) : IntEnum {
    None(-1),
    Color0(0),
    Color1(1),
    ColorWhite(2);

    companion object : IntEnum.Factory<EnvironmentColorType> {
        override fun fromValue(value: Int): EnvironmentColorType = entries.first { it.value == value }
    }
}

object EnvironmentColorTypeSerializer : KSerializer<EnvironmentColorType> by IntEnumSerializer.create(EnvironmentColorType)
