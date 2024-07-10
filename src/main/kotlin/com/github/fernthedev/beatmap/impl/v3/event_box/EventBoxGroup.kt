package com.github.fernthedev.beatmap.impl.v3.event_box

import com.github.fernthedev.beatmap.IBeatmapDataItem
import com.github.fernthedev.beatmap.impl.v3.ConstantsV3
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
open class EventBoxGroup<T>(
    @SerialName(ConstantsV3.BEAT_KEY)
    override val time: Float,
    @SerialName("e")
    open val eventBoxes: MutableList<T>
) : IBeatmapDataItem

typealias LightColorEventBoxGroupV3 = EventBoxGroup<LightColorEventBox>
typealias LightRotationEventBoxGroupV3 = EventBoxGroup<LightRotationEventBox>
typealias LightTranslationEventBoxGroupV3 = EventBoxGroup<LightTranslationEventBox>


