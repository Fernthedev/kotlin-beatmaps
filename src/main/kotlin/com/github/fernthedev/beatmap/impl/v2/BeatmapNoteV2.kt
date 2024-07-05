package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class BeatmapNoteV2(
    @SerialName("_type") override val colorType: ColorType = ColorType.ColorA,
    @SerialName("_cutDirection") override val cutDirection: NoteCutDirection = NoteCutDirection.Any,
    @SerialName("_lineIndex") override val lineIndex: Int = 0,
    @SerialName("_lineLayer") override val noteLineLayer: Int = 0,
    @SerialName("_customData") override val customData: CustomData = mapOf(),
    @SerialName("_time") override val time: Float = 0.0F
) : IColorNote, IBombNote, Cloneable {

    @Transient
    override val cutDirectionAngleOffset: Float = 0.0F

    override fun copy(
        time: Float,
        customData: CustomData,
        colorType: ColorType,
        cutDirection: NoteCutDirection,
        lineIndex: Int,
        noteLineLayer: Int,
        cutDirectionAngleOffset: Float
    ): BeatmapNoteV2 {
        return BeatmapNoteV2(
            time = time,
            customData = customData,
            colorType = colorType,
            cutDirection = cutDirection,
            lineIndex = lineIndex,
            noteLineLayer = noteLineLayer,
        )
    }

    override fun copy(time: Float, customData: CustomData, lineIndex: Int, noteLineLayer: Int): BeatmapNoteV2 {
        return BeatmapNoteV2(
            time = time,
            customData = customData,
            colorType = colorType,
            cutDirection = cutDirection,
            lineIndex = lineIndex,
            noteLineLayer = noteLineLayer,
        )
    }
}