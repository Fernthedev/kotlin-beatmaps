package com.github.fernthedev.beatmap

enum class SliderMidAnchorMode {
    Straight,
    Clockwise,
    CounterClockwise
}


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
