package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapData
import com.github.fernthedev.beatmap.IBeatmapDataItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BeatmapDataV2(
    @SerialName("_version")
    val version: String = "2.2.0",
    @SerialName("_events")
    val events: MutableList<BeatmapEventV2>,
    @SerialName("_notes")
    val notes: MutableList<BeatmapNoteV2>,
    @SerialName("_obstacles")
    val obstacles: MutableList<BeatmapObstacleV2>,
    @SerialName("_waypoints")
    val waypoints: MutableList<BeatmapWaypointV2>,
    @SerialName("_customData")
    override var customData: CustomData
) : IBeatmapData {


    override fun add(item: IBeatmapDataItem) {

        when (item) {
            is BeatmapEventV2 -> {
                events.add(item)
            }

            is BeatmapNoteV2 -> {
                notes.add(item)
            }
        }
    }

    override fun remove(item: IBeatmapDataItem) {
        TODO("Not yet implemented")
    }

    override fun getAllBeatmapItems(): Sequence<IBeatmapDataItem> {
        TODO("Not yet implemented")
    }

    override fun <T : IBeatmapDataItem> getBeatmapItems(): Sequence<T> {
        TODO("Not yet implemented")
    }

    override fun getCopy(): IBeatmapData {
        TODO("Not yet implemented")
    }
}