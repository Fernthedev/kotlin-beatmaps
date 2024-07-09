package com.github.fernthedev.beatmap.impl.v3.events

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class IndexFilter(
    @SerialName("f")
    val type: IndexFilterType,
    @SerialName("p")
    val param0: Int,
    @SerialName("t")
    val param1: Int,
    @SerialName("r")
    val reversed: Int,
    @SerialName("c")
    val chunks: Int,
    @SerialName("l")
    val limit: Int,
    @SerialName("d")
    val limitAlsoAffectsType: IndexFilterLimitAlsoAffectsType,
    @SerialName("n")
    val random: IndexFilterRandomType,
    @SerialName("s")
    val seed: Int
)