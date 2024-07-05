package com.github.fernthedev.beatmap



interface IObstacle : IBeatmapObject {
    val duration: Float
    val width: Int
    val height: Int
}