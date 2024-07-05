package com.github.fernthedev.beatmap



interface IBombNote : IBeatmapObject {
    fun copy(
        time: Float = this.time,
        customData: CustomData = this.customData,

        lineIndex: Int = this.lineIndex,
        noteLineLayer: Int = this.noteLineLayer,
    ): IBombNote
}