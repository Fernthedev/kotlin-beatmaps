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
}