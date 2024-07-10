package com.github.fernthedev.beatmap.impl.v3.event_box

import com.github.fernthedev.beatmap.enums.EaseType
import com.github.fernthedev.beatmap.enums.EnvironmentColorType
import com.github.fernthedev.beatmap.impl.v3.ConstantsV3
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LightColorEventBox(
    // event box
    @SerialName("f")
    val indexFilter: IndexFilter,
    @SerialName("w")
    val beatDistributionParam: Float,
    @SerialName("d")
    val beatDistributionParamType: DistributionParamType,
    // light
    @SerialName("r")
    val brightnessDistributionParam: Float,
    @SerialName("t")
    val brightnessDistributionParamType: DistributionParamType,
    @SerialName("b")
    val brightnessDistributionShouldAffectFirstBaseEvent: Int,
    @SerialName("i")
    val brightnessDistributionEaseType: EaseType,
    @SerialName("e")
    val lightColorBaseDataList: MutableList<LightColorBaseData>,
)

@Serializable
data class LightColorBaseData(
    @SerialName(ConstantsV3.BEAT_KEY)
    val beat: Float,
    @SerialName("i")
    val transitionType: TransitionType,
    @SerialName("c")
    val colorType: EnvironmentColorType,
    @SerialName("s")
    val brightness: Float,
    @SerialName("sb")
    val strobeBrightness: Float,
    @SerialName("sf")
    val strobeFade: Int,
    @SerialName("f")
    val strobeBeatFrequency: Int,
)