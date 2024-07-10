package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class NoteDataV2(
    @SerialName("_time") override val time: Float = 0.0F,
    @SerialName("_type") override val colorType: ColorType = ColorType.ColorA,
    @SerialName("_cutDirection") override val cutDirection: NoteCutDirection = NoteCutDirection.Any,
    @SerialName("_lineIndex") override val lineIndex: Int = 0,
    @SerialName("_lineLayer") override val noteLineLayer: Int = 0,
    @SerialName("_customData") override val customData: CustomData = mapOf()
) : IColorNote, IBombNote, Cloneable {

    @Transient
    override val cutDirectionAngleOffset: Float = 0.0F


}