package com.github.fernthedev.beatmap.impl

import com.github.fernthedev.beatmap.IBeatmapData
import com.github.fernthedev.beatmap.IBeatmapLoader
import com.github.fernthedev.beatmap.impl.v2.BeatmapDataV2
import com.github.fernthedev.beatmap.impl.v3.BeatmapDataV3
import com.github.fernthedev.beatmap.impl.v4.BeatmapDataV4
import kotlinx.serialization.json.Json

class BeatmapLoader : IBeatmapLoader {
    private val jsonParser = Json {
        ignoreUnknownKeys = true
    }

    override fun loadBeatmap(readable: String): IBeatmapData {
        val versionData = jsonParser.decodeFromString<VersionData>(readable)
        val versionStr = versionData._version ?: versionData.version

        if (versionStr == null || versionStr.startsWith("2.")) {
            return jsonParser.decodeFromString<BeatmapDataV2>(readable)
        }

        if (versionStr.startsWith("3.")) {
            return jsonParser.decodeFromString<BeatmapDataV3>(readable)
        }

        if (versionStr.startsWith("4.")) {
            return jsonParser.decodeFromString<BeatmapDataV4>(readable)
        }

        throw IllegalArgumentException("Not a valid beatmap format: $versionStr")
    }
}