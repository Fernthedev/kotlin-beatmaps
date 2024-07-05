package com.github.fernthedev.beatmap.impl

import kotlinx.serialization.SerialName

data class VersionData(
    @SerialName("version")
    val version: String?,

    @SerialName("_version")
    val _version: String?
)