package com.github.fernthedev.beatmap

import kotlinx.serialization.json.JsonElement

interface IBeatmapDataItem : Comparable<IBeatmapDataItem>, Cloneable {

    val time: Float


    /**
     * Compares this object with the specified object for order. Returns zero if this object is equal
     * to the specified [other] object, a negative number if it's less than [other], or a positive number
     * if it's greater than [other].
     */
    override fun compareTo(other: IBeatmapDataItem): Int {
        return this.time.compareTo(other.time)
    }
}

typealias CustomData = Map<String, JsonElement?>

interface ICustomBeatmapDataItem : IBeatmapDataItem {
    val customData: CustomData
}