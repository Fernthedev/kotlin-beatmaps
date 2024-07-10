package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IObstacle
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class ObstacleDataV2(
    @SerialName("_time") override val time: Float = 0.0F,
    @SerialName("_duration") override val duration: Float = 0.0F,
    @SerialName("_with") override val width: Int = 0,
    @SerialName("_type") override val height: Int = 0,
    @SerialName("_lineIndex") override val lineIndex: Int = 0,
    @SerialName("_customData") override val customData: CustomData = mapOf()
) : IObstacle {
    @Transient
    override val noteLineLayer: Int = 0
}