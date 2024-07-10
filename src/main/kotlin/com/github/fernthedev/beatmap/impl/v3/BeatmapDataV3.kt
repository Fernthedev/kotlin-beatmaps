package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapData
import com.github.fernthedev.beatmap.IBeatmapDataItem
import com.github.fernthedev.beatmap.impl.v3.event_box.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BeatmapDataV3(
    @SerialName("version")
    val version: String = "3.0.0",
    @SerialName("customData")
    override val customData: CustomData,

    @SerialName("bpmEvents")
    val bpmEvents: MutableList<BpmChangeEventDataV3> = mutableListOf(),
    @SerialName("rotationEvents")
    val rotationEvents: MutableList<RotationEventDataV3> = mutableListOf(),
    @SerialName("colorNotes")
    val colorNotes: MutableList<ColorNoteDataV3> = mutableListOf(),
    @SerialName("bombNotes")
    val bombNotes: MutableList<BombNoteDataV3> = mutableListOf(),
    @SerialName("obstacles")
    val obstacles: MutableList<ObstacleDataV3> = mutableListOf(),
    @SerialName("sliders")
    val sliders: MutableList<SliderDataV3> = mutableListOf(),
    @SerialName("burstSliders")
    val burstSliders: MutableList<BurstSliderDataV3> = mutableListOf(),
    @SerialName("waypoints")
    val waypoints: MutableList<WaypointDataV3> = mutableListOf(),
    @SerialName("basicBeatmapEvents")
    val basicBeatmapEvents: MutableList<BasicEventDataV3> = mutableListOf(),
    @SerialName("colorBoostBeatmapEvents")
    val colorBoostBeatmapEvents: MutableList<ColorBoostEventDataV3> = mutableListOf(),
    @SerialName("lightColorEventBoxGroups")
    val lightColorEventBoxGroups: MutableList<LightColorEventBoxGroupV3> = mutableListOf(),
    @SerialName("lightRotationEventBoxGroups")
    val lightRotationEventBoxGroups: MutableList<LightRotationEventBoxGroupV3> = mutableListOf(),
    @SerialName("lightTranslationEventBoxGroups")
    val lightTranslationEventBoxGroups: MutableList<LightTranslationEventBoxGroupV3> = mutableListOf(),
    @SerialName("vfxEventBoxGroups")
    val vfxEventBoxGroups: MutableList<FxEventBoxGroupV3> = mutableListOf(),
    @SerialName("_fxEventsCollection")
    val fxEventsCollection: FxEventsCollectionV3 = FxEventsCollectionV3(),
    @SerialName("basicEventTypesWithKeywords")
    val basicEventTypesWithKeywords: BasicEventTypesWithKeywordsV3,
    @SerialName("useNormalEventsAsCompatibleEvents")
    val useNormalEventsAsCompatibleEvents: Boolean,
) : IBeatmapData {

    override fun add(item: IBeatmapDataItem) {
        when (item) {
            is BasicEventDataV3 -> {
                basicBeatmapEvents.add(item)
            }
            is BpmChangeEventDataV3 -> {
                bpmEvents.add(item)
            }
            is RotationEventDataV3 -> {
                rotationEvents.add(item)
            }

            is ColorNoteDataV3 -> {
                colorNotes.add(item)
            }

            is BombNoteDataV3 -> {
                bombNotes.add(item)
            }
            is SliderDataV3 -> {
                sliders.add(item)
            }
            is BurstSliderDataV3 -> {
                burstSliders.add(item)
            }

            is ObstacleDataV3 -> {
                obstacles.add(item)
            }
            is ColorBoostEventDataV3 -> {
                colorBoostBeatmapEvents.add(item)
            }

            is WaypointDataV3 -> {
                waypoints.add(item)
            }
        }
    }

    override fun remove(item: IBeatmapDataItem) {
        when (item) {
            is BasicEventDataV3 -> {
                basicBeatmapEvents.remove(item)
            }   
            is BpmChangeEventDataV3 -> {
                bpmEvents.remove(item)
            }
            is RotationEventDataV3 -> {
                rotationEvents.remove(item)
            }

            is ColorNoteDataV3 -> {
                colorNotes.remove(item)
            }

            is BombNoteDataV3 -> {
                bombNotes.remove(item)
            }
            is SliderDataV3 -> {
                sliders.remove(item)
            }
            is BurstSliderDataV3 -> {
                burstSliders.remove(item)
            }

            is ObstacleDataV3 -> {
                obstacles.remove(item)
            }     
            is ColorBoostEventDataV3 -> {
                colorBoostBeatmapEvents.remove(item)
            }

            is WaypointDataV3 -> {
                waypoints.remove(item)
            }
        }
    }

    override fun getAllBeatmapItems(): Sequence<IBeatmapDataItem> {
        return sequenceOf(
            colorNotes,
            bombNotes,
            obstacles,
            sliders,
            burstSliders,
            bpmEvents,
            rotationEvents,
            basicBeatmapEvents,
            colorBoostBeatmapEvents,
            lightColorEventBoxGroups,
            lightRotationEventBoxGroups,
            lightTranslationEventBoxGroups,
            vfxEventBoxGroups,
        ).flatten().sortedBy { it.time }
    }



    override fun getCopy(): IBeatmapData {
        return BeatmapDataV3(
            version = version,
            customData = customData.toMap(),
            bpmEvents = bpmEvents.toMutableList(),
            rotationEvents = rotationEvents.toMutableList(),
            lightTranslationEventBoxGroups = lightTranslationEventBoxGroups.toMutableList(),
            lightRotationEventBoxGroups = lightRotationEventBoxGroups.toMutableList(),
            lightColorEventBoxGroups = lightColorEventBoxGroups.toMutableList(),
            vfxEventBoxGroups = vfxEventBoxGroups.toMutableList(),
            basicBeatmapEvents = basicBeatmapEvents.toMutableList(),
            useNormalEventsAsCompatibleEvents = useNormalEventsAsCompatibleEvents,
            sliders = sliders.toMutableList(),
            burstSliders = burstSliders.toMutableList(),
            obstacles = obstacles.toMutableList(),
            bombNotes = bombNotes.toMutableList(),
            waypoints = waypoints.toMutableList(),
            basicEventTypesWithKeywords = basicEventTypesWithKeywords.copy(),
            colorBoostBeatmapEvents = colorBoostBeatmapEvents.toMutableList(),
            colorNotes = colorNotes.toMutableList(),
            fxEventsCollection = fxEventsCollection.copy()
        )
    }
}