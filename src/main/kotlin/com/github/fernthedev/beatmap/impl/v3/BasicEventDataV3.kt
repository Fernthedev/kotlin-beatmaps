package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.BasicBeatmapEventType
import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapEventData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BasicEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float,
    @SerialName("et")
    override val basicBeatmapEventType: BasicBeatmapEventType,
    @SerialName("i")
    override val value: Int,
    @SerialName("f")
    override val floatValue: Float,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY)
    override val customData: CustomData

) : IBeatmapEventData{
    override fun copy(
        time: Float,
        customData: CustomData,
        basicBeatmapEventType: BasicBeatmapEventType,
        floatValue: Float,
        value: Int
    ): IBeatmapEventData {
        return BasicEventDataV3(
            time = time,
            basicBeatmapEventType = basicBeatmapEventType,
            value = value,
            floatValue = floatValue,
            customData = customData
        )
    }
}