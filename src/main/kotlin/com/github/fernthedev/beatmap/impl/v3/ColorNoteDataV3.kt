package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.ColorType
import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IColorNote
import com.github.fernthedev.beatmap.NoteCutDirection
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ColorNoteDataV3(
    @SerialName(ConstantsV3.BEAT_KEY) override val time: Float,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY) override val customData: CustomData,
    @SerialName(ConstantsV3.LINE_INDEX) override val lineIndex: Int,
    @SerialName(ConstantsV3.LINE_LAYER) override val noteLineLayer: Int,
    @SerialName("c") override val colorType: ColorType,
    @SerialName("d") override val cutDirection: NoteCutDirection,
    @SerialName("a") override val cutDirectionAngleOffset: Float

) : IColorNote