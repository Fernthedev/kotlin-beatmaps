package com.github.fernthedev.beatmap

enum class ColorType(val value: Int) {
    ColorA(0),
    ColorB(1),
    Bomb(3)
}


enum class NoteCutDirection {
    Up,
    Down,
    Left,
    Right,
    UpLeft,
    UpRight,
    DownLeft,
    DownRight,
    Any,
    None

}

interface IColorNote : IBeatmapObject {

    val colorType: ColorType
    val cutDirection: NoteCutDirection
    val cutDirectionAngleOffset: Float

    fun copy(
        time: Float = this.time,
        customData: CustomData = this.customData,

        colorType: ColorType = this.colorType,
        cutDirection: NoteCutDirection = this.cutDirection,
        lineIndex: Int = this.lineIndex,
        noteLineLayer: Int = this.noteLineLayer,
        cutDirectionAngleOffset: Float = this.cutDirectionAngleOffset,
    ): IColorNote
}