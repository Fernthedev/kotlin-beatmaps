package com.github.fernthedev.beatmap.impl

import com.github.fernthedev.beatmap.IBeatmapData
import com.github.fernthedev.beatmap.IBeatmapLoader
import com.github.fernthedev.beatmap.impl.v2.BeatmapDataV2
import com.github.fernthedev.beatmap.impl.v3.BeatmapDataV3
import com.github.fernthedev.beatmap.impl.v3.BeatmapDataV4
import kotlinx.serialization.json.Json

class BeatmapLoader : IBeatmapLoader {
    override fun loadBeatmap(readable: String): IBeatmapData {
        val versionData = Json.decodeFromString<VersionData>(readable)
        val versionStr = versionData._version ?: versionData.version

        if (versionStr == null || versionStr.startsWith("2.")) {
            return Json.decodeFromString<BeatmapDataV2>(readable)
        }

        if (versionStr.startsWith("3.")) {
            return Json.decodeFromString<BeatmapDataV3>(readable)
        }

        if (versionStr.startsWith("4.")) {
            return Json.decodeFromString<BeatmapDataV4>(readable)
        }

        throw IllegalArgumentException("Not a valid beatmap format: $versionStr")
    }
}