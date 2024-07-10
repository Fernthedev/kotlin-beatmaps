package com.github.fernthedev.beatmap.impl

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionData(
    @SerialName("version")
    val version: String? = null,

    @SerialName("_version")
    val _version: String? = null
)