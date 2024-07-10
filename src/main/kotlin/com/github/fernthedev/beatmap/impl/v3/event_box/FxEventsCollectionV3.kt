package com.github.fernthedev.beatmap.impl.v3.event_box

import com.github.fernthedev.beatmap.enums.EaseType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FxEventsCollectionV3(
    @SerialName("_il") private val intEventsList: List<IntFxEventBaseData> = mutableListOf(),
    @SerialName("_fl") private val floatEventsList: List<FloatFxEventBaseData> = mutableListOf()
)

@Serializable
data class IntFxEventBaseData(
    val beat: Float,
    @SerialName("p") private val _usePreviousEventValue: Int = 0, // Renamed for serialization compatibility
    @SerialName("v") val value: Int
) {
    val usePreviousEventValue: Boolean
        get() = _usePreviousEventValue == 1
}


@Serializable
data class FloatFxEventBaseData(
    val beat: Float,
    @SerialName("p") private val _usePreviousEventValue: Int = 0, // Renamed for serialization compatibility
    @SerialName("v") val value: Float,
    @SerialName("i") val easeType: EaseType
) {
    val usePreviousEventValue: Boolean
        get() = _usePreviousEventValue == 1
}