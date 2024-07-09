package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class BurstSliderDataV3(
    // common
    @SerialName(ConstantsV3.BEAT_KEY) override val time: Float,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY) override val customData: CustomData,
    @SerialName(ConstantsV3.LINE_INDEX) override val headLineIndex: Int,
    @SerialName(ConstantsV3.LINE_LAYER) override val headLineLayer: Int,
    @SerialName("c") override val colorType: ColorType,
    @SerialName("d") override val headCutDirection: NoteCutDirection,
    @SerialName("tb") override val tailTime: Float,
    @SerialName("tx") override val tailLineIndex: Int,
    @SerialName("ty") override val tailLineLayer: Int,
    // burst
    @SerialName("sc") val sliceCount: Int,
    @SerialName("s") val squishAmount: Float,
) : ISlider, Cloneable

@Serializable
data class SliderDataV3(
    // common
    @SerialName(ConstantsV3.BEAT_KEY) override val time: Float,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY) override val customData: CustomData,
    @SerialName(ConstantsV3.LINE_INDEX) override val headLineIndex: Int,
    @SerialName(ConstantsV3.LINE_LAYER) override val headLineLayer: Int,
    @SerialName("c") override val colorType: ColorType,
    @SerialName("d") override val headCutDirection: NoteCutDirection,
    @SerialName("tb") override val tailTime: Float,
    @SerialName("tx") override val tailLineIndex: Int,
    @SerialName("ty") override val tailLineLayer: Int,

    // slider
    @SerialName("mu") val headControlPointLengthMultiplier: Float,
    @SerialName("tmu") val tailControlPointLengthMultiplier: Float,
    @SerialName("tc") val tailCutDirection: NoteCutDirection,
    @SerialName("m") val sliderMidAnchorMode: SliderMidAnchorMode
) : ISlider, Cloneable