package com.github.fernthedev.beatmap

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = ColorTypeSerializer::class)
enum class ColorType(override val value: Int) : IntEnum {
    ColorA(0),
    ColorB(1),
    Bomb(3);

    companion object : IntEnum.Factory<ColorType> {
        override fun fromValue(value: Int): ColorType {
            return entries.first { it.value == value }
        }
    }
}

@Serializable(with = NoteCutDirectionSerializer::class)
enum class NoteCutDirection(override val value: Int) : IntEnum {
    Up(0),
    Down(1),
    Left(2),
    Right(3),
    UpLeft(4),
    UpRight(5),
    DownLeft(6),
    DownRight(7),
    Any(8),
    None(9);

    companion object : IntEnum.Factory<NoteCutDirection> {
        override fun fromValue(value: Int): NoteCutDirection {
            return entries.first { it.value == value }
        }
    }
}


object ColorTypeSerializer : KSerializer<ColorType> by IntEnumSerializer.create(ColorType)
object NoteCutDirectionSerializer : KSerializer<NoteCutDirection> by IntEnumSerializer.create(NoteCutDirection)

interface IColorNote : IBeatmapObject {

    val colorType: ColorType
    val cutDirection: NoteCutDirection
    val cutDirectionAngleOffset: Float
}