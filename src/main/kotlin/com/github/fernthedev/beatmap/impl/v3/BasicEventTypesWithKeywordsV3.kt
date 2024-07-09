package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.BeatmapEventType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BasicEventTypesWithKeywordsV3(
    @SerialName("d") val data: List<BasicEventTypesForKeyword>
)

@Serializable
data class BasicEventTypesForKeyword(
    @SerialName("k") val keyword: String,
    @SerialName("e") val eventTypes: List<BeatmapEventType>
)