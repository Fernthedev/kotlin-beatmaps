package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.ColorType
import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IColorNote
import com.github.fernthedev.beatmap.NoteCutDirection
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ColorNoteDataV3(
    @SerialName(ConstantsV3.BEAT_KEY) override val time: Float = 0F,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY) override val customData: CustomData = mapOf(),
    @SerialName(ConstantsV3.LINE_INDEX) override val lineIndex: Int = 0,
    @SerialName(ConstantsV3.LINE_LAYER) override val noteLineLayer: Int = 0,
    @SerialName("c") override val colorType: ColorType = ColorType.ColorA,
    @SerialName("d") override val cutDirection: NoteCutDirection = NoteCutDirection.None,
    @SerialName("a") override val cutDirectionAngleOffset: Float = 0F
) : IColorNote