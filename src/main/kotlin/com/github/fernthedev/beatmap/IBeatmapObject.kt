package com.github.fernthedev.beatmap

interface IBeatmapObject : ICustomBeatmapDataItem {
    val lineIndex: Int
    val noteLineLayer: Int
}