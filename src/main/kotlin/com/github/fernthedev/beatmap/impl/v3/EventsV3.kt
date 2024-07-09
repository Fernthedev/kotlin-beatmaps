package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable



@Serializable
data class BasicEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float,
    @SerialName("et")
    override val beatmapEventType: BeatmapEventType,
    @SerialName("i")
    override val value: Int,
    @SerialName("f")
    override val floatValue: Float,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY)
    override val customData: CustomData

) : IBeatmapEventData

@Serializable
data class BpmChangeEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float,
    @SerialName("m")
    val bpm: Float,
) : IBeatmapDataItem
@Serializable
data class ColorBoostEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float,
    @SerialName("o")
    val boost: Boolean,
) : IBeatmapDataItem

@Serializable
data class RotationEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float,
    @SerialName("e")
    val executionTime: ExecutionTime,
    @SerialName("r")
    val rotation: Float,
) : IBeatmapDataItem
