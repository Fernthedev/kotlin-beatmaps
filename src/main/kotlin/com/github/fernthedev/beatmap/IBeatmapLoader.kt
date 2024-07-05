package com.github.fernthedev.beatmap

interface IBeatmapLoader {

    fun loadBeatmap(readable: String): IBeatmapData

}