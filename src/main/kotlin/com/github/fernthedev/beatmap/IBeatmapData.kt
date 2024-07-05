package com.github.fernthedev.beatmap

interface IReadonlyBeatmapData {

    val customData: CustomData

    fun getAllBeatmapItems(): Sequence<IBeatmapDataItem>

    fun <T: IBeatmapDataItem> getBeatmapItems(): Sequence<T>

    fun getCopy(): IBeatmapData

}

interface IBeatmapData : IReadonlyBeatmapData {

    fun add(item: IBeatmapDataItem)

    fun remove(item: IBeatmapDataItem)

}