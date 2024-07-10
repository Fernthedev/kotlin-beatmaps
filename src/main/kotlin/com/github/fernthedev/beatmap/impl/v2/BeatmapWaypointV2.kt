package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IWaypoint
import com.github.fernthedev.beatmap.OffsetDirection
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BeatmapWaypointV2(
    @SerialName("_time")
    override val time: Float = 0F,
    @SerialName("_offsetDirection")
    override val offsetDirection: OffsetDirection = OffsetDirection.None,
    @SerialName("_lineIndex")
    override val lineIndex: Int = 0,
    @SerialName("_lineLayer")
    override val noteLineLayer: Int = 0,
    @SerialName("_customData")
    override val customData: CustomData = mapOf()
) : IWaypoint