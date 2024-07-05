package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapData
import com.github.fernthedev.beatmap.IBeatmapDataItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BeatmapDataV2(
    @SerialName("_version") val version: String = "2.2.0",
    @SerialName("_events") val events: MutableList<BeatmapEventV2>,
    @SerialName("_notes") val notes: MutableList<BeatmapNoteV2>,
    @SerialName("_obstacles") val obstacles: MutableList<BeatmapObstacleV2>,
    @SerialName("_waypoints") val waypoints: MutableList<BeatmapWaypointV2>,
    @SerialName("_customData") override var customData: CustomData
) : IBeatmapData {


    override fun add(item: IBeatmapDataItem) {
        when (item) {
            is BeatmapEventV2 -> {
                events.add(item)
            }

            is BeatmapNoteV2 -> {
                notes.add(item)
            }

            is BeatmapObstacleV2 -> {
                obstacles.add(item)
            }

            is BeatmapWaypointV2 -> {
                waypoints.add(item)
            }
        }
    }

    override fun remove(item: IBeatmapDataItem) {
        when (item) {
            is BeatmapEventV2 -> {
                events.remove(item)
            }

            is BeatmapNoteV2 -> {
                notes.remove(item)
            }

            is BeatmapObstacleV2 -> {
                obstacles.remove(item)
            }

            is BeatmapWaypointV2 -> {
                waypoints.remove(item)
            }
        }
    }

    override fun getAllBeatmapItems(): Sequence<IBeatmapDataItem> {
        return sequenceOf(events, notes, obstacles, waypoints).flatten().sortedBy { it.time }
    }

    override fun <T : IBeatmapDataItem> getBeatmapItems(): Sequence<T> {
        return getAllBeatmapItems().mapNotNull { it as? T}
    }

    override fun getCopy(): IBeatmapData {
        return BeatmapDataV2(
            version = version,
            events = events.toMutableList(),
            notes = notes.toMutableList(),
            obstacles = obstacles.toMutableList(),
            waypoints = waypoints.toMutableList(),
            customData = customData.toMap()
        )
    }
}