package com.github.fernthedev.beatmap

import kotlinx.serialization.Serializable


@Serializable
enum class RotationDirection {
    Automatic,
    Clockwise,
    Counterclockwise
}