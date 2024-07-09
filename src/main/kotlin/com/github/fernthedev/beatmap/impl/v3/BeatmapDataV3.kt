package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapData
import com.github.fernthedev.beatmap.IBeatmapDataItem
import com.github.fernthedev.beatmap.impl.v3.events.*
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
    val burstSliders: MutableList<SliderDataV3> = mutableListOf(),
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
        TODO("Not yet implemented")
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