package com.github.fernthedev.beatmap

enum class OffsetDirection(val value: Int)
{
    Up(0),
    Down(1),
    Left(2),
    Right(3),
    UpLeft(4),
    UpRight(5),
    DownLeft(6),
    DownRight(7),
    None(9)
}



interface IWaypoint : IBeatmapObject {
    val offsetDirection: OffsetDirection

    fun copy(
        time: Float = this.time,
        customData: CustomData = this.customData,

        lineIndex: Int = this.lineIndex,
        noteLineLayer: Int = this.noteLineLayer,
        offsetDirection: OffsetDirection = this.offsetDirection
    ): IWaypoint
}