package com.github.fernthedev.beatmap

enum class EnvironmentColorType(val value: Int) {
    None(-1),
    Color0(0),
    Color1(1),
    ColorWhite(2);

    companion object {
        private val map = entries.associateBy(EnvironmentColorType::value)
        fun fromValue(value: Int) = map[value]
    }
}