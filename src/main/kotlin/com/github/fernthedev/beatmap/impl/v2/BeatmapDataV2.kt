package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapData
import com.github.fernthedev.beatmap.IBeatmapDataItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BeatmapDataV2(
    @SerialName("_version") val version: String = "2.2.0",
    @SerialName("_events") val events: MutableList<EventDataV2>,
    @SerialName("_notes") val notes: MutableList<NoteDataV2>,
    @SerialName("_obstacles") val obstacles: MutableList<ObstacleDataV2>,
    @SerialName("_waypoints") val waypoints: MutableList<BeatmapWaypointV2>,
    @SerialName("_customData") override var customData: CustomData
) : IBeatmapData {


    override fun add(item: IBeatmapDataItem) {
        when (item) {
            is EventDataV2 -> {
                events.add(item)
            }

            is NoteDataV2 -> {
                notes.add(item)
            }

            is ObstacleDataV2 -> {
                obstacles.add(item)
            }

            is BeatmapWaypointV2 -> {
                waypoints.add(item)
            }
        }
    }

    override fun remove(item: IBeatmapDataItem) {
        when (item) {
            is EventDataV2 -> {
                events.remove(item)
            }

            is NoteDataV2 -> {
                notes.remove(item)
            }

            is ObstacleDataV2 -> {
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