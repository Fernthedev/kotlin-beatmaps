package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IObstacle
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class BeatmapObstacleV2(
    @SerialName("_time") override val time: Float = 0.0F,
    @SerialName("_duration") override val duration: Float = 0.0F,
    @SerialName("_with") override val width: Int = 0,
    @SerialName("_type") override val height: Int = 0,
    @SerialName("_lineIndex") override val lineIndex: Int = 0,
    @SerialName("_customData") override val customData: CustomData = mapOf()
) : IObstacle {
    override fun copy(
        time: Float,
        customData: CustomData,
        lineIndex: Int,
        noteLineLayer: Int,
        duration: Float,
        width: Int,
        height: Int
    ): BeatmapObstacleV2 {
        return BeatmapObstacleV2(
            time = time,
            duration = duration,
            width = width,
            height = height,
            lineIndex = lineIndex,
            customData = customData,
        )
    }

    @Transient
    override val noteLineLayer: Int = 0
}