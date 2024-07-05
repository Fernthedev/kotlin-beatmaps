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


) : ISlider {
    override val sliderType: ISlider.Type
        get() = TODO("Not yet implemented")
    override val headCutDirectionAngleOffset: Float
        get() = TODO("Not yet implemented")
    override val tailCutDirection: NoteCutDirection
        get() = TODO("Not yet implemented")
    override val tailCutDirectionAngleOffset: Float
        get() = TODO("Not yet implemented")
    override val sliderMidAnchorMode: SliderMidAnchorMode
        get() = TODO("Not yet implemented")

    override fun copy(
        customData: CustomData,
        headTime: Float,
        colorType: ColorType,
        sliderType: ISlider.Type,
        headLineIndex: Int,
        headLineLayer: Int,
        headCutDirection: NoteCutDirection,
        headCutDirectionAngleOffset: Float,
        tailTime: Float,
        tailLineIndex: Int,
        tailLineLayer: Int,
        tailCutDirection: NoteCutDirection,
        tailCutDirectionAngleOffset: Float,
        sliceCount: Int,
        sliderMidAnchorMode: SliderMidAnchorMode,
        squishAmount: Float
    ): ISlider {
        TODO("Not yet implemented")
    }

}