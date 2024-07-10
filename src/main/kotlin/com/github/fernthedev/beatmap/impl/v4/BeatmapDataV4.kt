package com.github.fernthedev.beatmap.impl.v4

import com.github.fernthedev.beatmap.CustomData
import com.github.fernthedev.beatmap.IBeatmapData
import com.github.fernthedev.beatmap.IBeatmapDataItem
import kotlinx.serialization.Serializable

@Serializable
class BeatmapDataV4(override val customData: CustomData) : IBeatmapData {
    override fun add(item: IBeatmapDataItem) {
        TODO("Not yet implemented")
    }

    override fun remove(item: IBeatmapDataItem) {
        TODO("Not yet implemented")
    }

    override fun getAllBeatmapItems(): Sequence<IBeatmapDataItem> {
        TODO("Not yet implemented")
    }

    override fun getCopy(): IBeatmapData {
        TODO("Not yet implemented")
    }
}