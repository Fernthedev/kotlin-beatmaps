package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class BurstSliderDataV3(
    // common
    @SerialName(ConstantsV3.BEAT_KEY) override val time: Float = 0F,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY) override val customData: CustomData = mapOf(),
    @SerialName(ConstantsV3.LINE_INDEX) override val headLineIndex: Int = 0,
    @SerialName(ConstantsV3.LINE_LAYER) override val headLineLayer: Int = 0,
    @SerialName("c") override val colorType: ColorType = ColorType.ColorA,
    @SerialName("d") override val headCutDirection: NoteCutDirection = NoteCutDirection.None,
    @SerialName("tb") override val tailTime: Float = 0F,
    @SerialName("tx") override val tailLineIndex: Int = 0,
    @SerialName("ty") override val tailLineLayer: Int = 0,
    // burst
    @SerialName("sc") val sliceCount: Int = 0,
    @SerialName("s") val squishAmount: Float =0F,
) : ISlider, Cloneable

@Serializable
data class SliderDataV3(
    // common
    @SerialName(ConstantsV3.BEAT_KEY) override val time: Float = 0F,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY) override val customData: CustomData = mapOf(),
    @SerialName(ConstantsV3.LINE_INDEX) override val headLineIndex: Int = 0,
    @SerialName(ConstantsV3.LINE_LAYER) override val headLineLayer: Int = 0,
    @SerialName("c") override val colorType: ColorType = ColorType.ColorA,
    @SerialName("d") override val headCutDirection: NoteCutDirection = NoteCutDirection.None,
    @SerialName("tb") override val tailTime: Float = 0F,
    @SerialName("tx") override val tailLineIndex: Int = 0,
    @SerialName("ty") override val tailLineLayer: Int = 0,

    // slider
    @SerialName("mu") val headControlPointLengthMultiplier: Float = 0F,
    @SerialName("tmu") val tailControlPointLengthMultiplier: Float = 0F,
    @SerialName("tc") val tailCutDirection: NoteCutDirection = NoteCutDirection.None,
    @SerialName("m") val sliderMidAnchorMode: SliderMidAnchorMode = SliderMidAnchorMode.Straight,
) : ISlider, Cloneable