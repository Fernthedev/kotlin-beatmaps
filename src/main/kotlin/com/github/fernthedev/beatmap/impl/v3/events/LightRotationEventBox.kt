package com.github.fernthedev.beatmap.impl.v3.events

import com.github.fernthedev.beatmap.Axis
import com.github.fernthedev.beatmap.EaseType
import com.github.fernthedev.beatmap.RotationDirection
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LightRotationEventBox(
    // event box
    @SerialName("f")
    val indexFilter: IndexFilter,
    @SerialName("w")
    val beatDistributionParam: Float,
    @SerialName("d")
    val beatDistributionParamType: DistributionParamType,
    // rotation
    @SerialName("s")
    val rotationDistributionParam: Float,
    @SerialName("t")
    val rotationDistributionParamType: DistributionParamType,
    @SerialName("a")
    val axis: Axis,
    @SerialName("r")
    val flipRotation: Boolean,
    @SerialName("b")
    val rotationDistributionShouldAffectFirstBaseEvent: Boolean,
    @SerialName("i")
    val rotationDistributionEaseType: EaseType,
    @SerialName("l")
    val lightRotationBaseDataList: List<LightRotationBaseData>,
)

@Serializable
data class LightRotationBaseData(
    @SerialName("b")
    val beat: Float,
    @SerialName("p")
    val usePreviousEventRotationValue: Boolean,
    @SerialName("e")
    val easeType: EaseType,
    @SerialName("l")
    val loopsCount: Int,
    @SerialName("r")
    val rotation: Float,
    @SerialName("o")
    val rotationDirection: RotationDirection
)