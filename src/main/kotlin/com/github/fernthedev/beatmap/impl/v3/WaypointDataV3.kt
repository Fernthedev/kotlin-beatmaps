package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IWaypoint
import com.github.fernthedev.beatmap.OffsetDirection
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WaypointDataV3(
    @SerialName(ConstantsV3.BEAT_KEY) override val time: Float = 0F,
    @SerialName(ConstantsV3.LINE_INDEX) override val lineIndex: Int = 0,
    @SerialName(ConstantsV3.LINE_LAYER) override val noteLineLayer: Int = 0,
    @SerialName("d") override val offsetDirection: OffsetDirection = OffsetDirection.None,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY) override val customData: CustomData = mapOf(),
) : IWaypoint