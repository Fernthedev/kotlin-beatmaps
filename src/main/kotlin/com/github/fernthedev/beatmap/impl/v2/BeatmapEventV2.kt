package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.BasicBeatmapEventType
import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapEventData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BeatmapEventV2(
    @SerialName("_time")
    override val time: Float = 0.0F,
    @SerialName("_type")
    override val basicBeatmapEventType: BasicBeatmapEventType = BasicBeatmapEventType.Event0,
    @SerialName("_value")
    override val value: Int = 0,
    @SerialName("_floatValue")
    override val floatValue: Float = 0.0F,
    @SerialName("_customData")
    override val customData: CustomData = mapOf()
) : IBeatmapEventData {
    override fun copy(
        time: Float,
        customData: CustomData,
        basicBeatmapEventType: BasicBeatmapEventType,
        floatValue: Float,
        value: Int
    ): BeatmapEventV2 {
        return BeatmapEventV2(
            time = time,
            basicBeatmapEventType = basicBeatmapEventType,
            value = value,
            floatValue = floatValue,
            customData = customData,
        )
    }
}