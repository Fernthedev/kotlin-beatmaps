package com.github.fernthedev.beatmap

interface IReadonlyBeatmapData {

    val customData: CustomData

    fun getAllBeatmapItems(): Sequence<IBeatmapDataItem>

    fun <T : IBeatmapDataItem> getBeatmapItems(clazz: Class<T>): Sequence<T> {
        return getAllBeatmapItems().filter { clazz.isAssignableFrom(it.javaClass) }.mapNotNull { it as? T }
    }

    fun getCopy(): IBeatmapData

}

interface IBeatmapData : IReadonlyBeatmapData {

    fun add(item: IBeatmapDataItem)

    fun remove(item: IBeatmapDataItem)

}

inline fun <reified T : IBeatmapDataItem> IReadonlyBeatmapData.getBeatmapItems(): Sequence<T> {
    return getBeatmapItems(T::class.java)
}