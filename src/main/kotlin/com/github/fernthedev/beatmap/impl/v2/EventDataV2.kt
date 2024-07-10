package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.BeatmapEventType
import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapEventData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EventDataV2(
    @SerialName("_time")
    override val time: Float = 0.0F,
    @SerialName("_type")
    override val beatmapEventType: BeatmapEventType = BeatmapEventType.Event0,
    @SerialName("_value")
    override val value: Int = 0,
    @SerialName("_floatValue")
    override val floatValue: Float = 0.0F,
    @SerialName("_customData")
    override val customData: CustomData = mapOf()
) : IBeatmapEventData {

}