package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable



@Serializable
data class BasicEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float = 0F,
    @SerialName("et")
    override val beatmapEventType: BeatmapEventType = BeatmapEventType.Event0,
    @SerialName("i")
    override val value: Int = 0,
    @SerialName("f")
    override val floatValue: Float = 0F,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY)
    override val customData: CustomData = mapOf()

) : IBeatmapEventData

@Serializable
data class BpmChangeEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float = 0F,
    @SerialName("m")
    val bpm: Float = 0F,
) : IBeatmapDataItem

@Serializable
data class ColorBoostEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float = 0F,
    @SerialName("o")
    val boost: Boolean = false,
) : IBeatmapDataItem

@Serializable
data class RotationEventDataV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float = 0F,
    @SerialName("e")
    val executionTime: ExecutionTime = ExecutionTime.Late,
    @SerialName("r")
    val rotation: Float = 0F,
) : IBeatmapDataItem
