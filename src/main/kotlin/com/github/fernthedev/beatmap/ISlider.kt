package com.github.fernthedev.beatmap

import java.sql.Time

enum class SliderMidAnchorMode {
    Straight,
    Clockwise,
    CounterClockwise
}


interface ISlider : ICustomBeatmapDataItem {
    enum class Type {
        Normal,
        Burst
    }

    val headTime
        get() = this.time

    val colorType: ColorType
    val sliderType: ISlider.Type
    val headLineIndex: Int
    val headLineLayer: Int
    val headCutDirection: NoteCutDirection
    val headCutDirectionAngleOffset: Float

    val tailTime: Float
    val tailLineIndex: Int
    val tailLineLayer: Int
    val tailCutDirection: NoteCutDirection
    val tailCutDirectionAngleOffset: Float

    val sliceCount: Int
    val sliderMidAnchorMode: SliderMidAnchorMode
    val squishAmount: Float

    fun copy(
        customData: CustomData = this.customData,

        headTime: Float = this.headTime,
        colorType: ColorType = this.colorType,
        sliderType: ISlider.Type = this.sliderType,
        headLineIndex: Int = this.headLineIndex,
        headLineLayer: Int = this.headLineLayer,
        headCutDirection: NoteCutDirection = this.headCutDirection,
        headCutDirectionAngleOffset: Float = this.headCutDirectionAngleOffset,
        tailTime: Float = this.tailTime,
        tailLineIndex: Int = this.tailLineIndex,
        tailLineLayer: Int = this.tailLineLayer,
        tailCutDirection: NoteCutDirection = this.tailCutDirection,
        tailCutDirectionAngleOffset: Float = this.tailCutDirectionAngleOffset,
        sliceCount: Int = this.sliceCount,
        sliderMidAnchorMode: SliderMidAnchorMode = this.sliderMidAnchorMode,
        squishAmount: Float = this.squishAmount,
    ): ISlider
}
