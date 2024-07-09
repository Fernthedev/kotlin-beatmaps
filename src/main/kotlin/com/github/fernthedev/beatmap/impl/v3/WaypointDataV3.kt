package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IWaypoint
import com.github.fernthedev.beatmap.OffsetDirection
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WaypointDataV3(
    @SerialName(ConstantsV3.BEAT_KEY) override val time: Float,
    @SerialName(ConstantsV3.CUSTOM_DATA_KEY) override val customData: CustomData,
    @SerialName(ConstantsV3.LINE_INDEX) override val lineIndex: Int,
    @SerialName(ConstantsV3.LINE_LAYER) override val noteLineLayer: Int,
    @SerialName("d") override val offsetDirection: OffsetDirection,
) : IWaypoint