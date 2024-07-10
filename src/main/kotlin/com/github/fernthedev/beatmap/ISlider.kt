package com.github.fernthedev.beatmap

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = SliderMidAnchorModeSerializer::class)
enum class SliderMidAnchorMode(override val value: Int) : IntEnum {
    Straight(0),
    Clockwise(1),
    CounterClockwise(2);

    companion object : IntEnum.Factory<SliderMidAnchorMode> {
        override fun fromValue(value: Int): SliderMidAnchorMode {
            return entries.first { it.value == value }
        }
    }
}

object SliderMidAnchorModeSerializer : KSerializer<SliderMidAnchorMode> by IntEnumSerializer.create(SliderMidAnchorMode)


interface ISlider : ICustomBeatmapDataItem {
    val headTime
        get() = this.time

    val colorType: ColorType
    val headLineIndex: Int
    val headLineLayer: Int
    val headCutDirection: NoteCutDirection

    val tailTime: Float
    val tailLineIndex: Int
    val tailLineLayer: Int
}
