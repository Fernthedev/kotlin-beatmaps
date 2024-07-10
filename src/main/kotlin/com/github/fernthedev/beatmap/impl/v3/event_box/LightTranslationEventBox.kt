package com.github.fernthedev.beatmap.impl.v3.event_box

import com.github.fernthedev.beatmap.Axis
import com.github.fernthedev.beatmap.EaseType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LightTranslationEventBox(
    // event box
    @SerialName("f")
    val indexFilter: IndexFilter,
    @SerialName("w")
    val beatDistributionParam: Float,
    @SerialName("d")
    val beatDistributionParamType: DistributionParamType,

    // translation
    @SerialName("s") val gapDistributionParam: Float,
    @SerialName("t") val gapDistributionParamType: DistributionParamType,
    @SerialName("a") val axis: Axis,
    @SerialName("r") val flipTranslation: Boolean,
    @SerialName("b") val gapDistributionShouldAffectFirstBaseEvent: Boolean,
    @SerialName("i") val gapDistributionEaseType: EaseType,
    @SerialName("l") val lightTranslationBaseDataList: List<LightTranslationBaseData>
)

@Serializable
data class LightTranslationBaseData(
    @SerialName("b") val beat: Float,
    @SerialName("p") val usePreviousEventTranslationValue: Boolean,
    @SerialName("e") val easeType: EaseType,
    @SerialName("t") val translation: Float
)

