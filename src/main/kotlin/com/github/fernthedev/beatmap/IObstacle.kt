package com.github.fernthedev.beatmap



interface IObstacle : IBeatmapObject {

    val duration: Float
    val width: Int
    val height: Int


    fun copy(
        time: Float = this.time,
        customData: CustomData = this.customData,
        lineIndex: Int = this.lineIndex,
        noteLineLayer: Int = this.noteLineLayer,
        duration: Float = this.duration,
        width: Int = this.width,
        height: Int = this.height,
    ): IObstacle
}