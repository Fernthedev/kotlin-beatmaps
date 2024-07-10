package com.github.fernthedev.beatmap.impl.v3.event_box

import com.github.fernthedev.beatmap.enums.EaseType
import com.github.fernthedev.beatmap.IBeatmapDataItem
import com.github.fernthedev.beatmap.impl.v3.ConstantsV3
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FxEventBoxGroupV3(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float,
    @SerialName("e")
    val eventBoxes: MutableList<FxEventBox>,
    @SerialName("t")
    val type: FxEventType
) : IBeatmapDataItem

@Serializable
data class FxEventBox(
    // event box
    @SerialName("f")
    val indexFilter: IndexFilter,
    @SerialName("w")
    val beatDistributionParam: Float,
    @SerialName("d")
    val beatDistributionParamType: DistributionParamType,
    // fx event
    @SerialName("s") val vfxDistributionParam: Float,
    @SerialName("t") val vfxDistributionParamType: DistributionParamType,
    @SerialName("i") val vfxDistributionEaseType: EaseType,
    @SerialName("b") val vfxDistributionShouldAffectFirstBaseEvent: Boolean,
    @SerialName("l") val vfxBaseDataList: List<Int>
)

enum class FxEventType {
    Int,
    Float,
    Bool
}
