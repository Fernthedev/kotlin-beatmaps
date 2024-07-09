package com.github.fernthedev.beatmap

enum class BeatmapEventType(val value: Int) {
    Event0(0),
    Event1(1),
    Event2(2),
    Event3(3),
    Event4(4),
    Event5(5),
    Event6(6),
    Event7(7),
    Event8(8),
    Event9(9),
    Event10(10),
    Event11(11),
    Event12(12),
    Event13(13),
    Event14(14),
    Event15(15),
    Event16(16),
    Event17(17),
    Event18(18),
    Event19(19),
    Event20(20),
    Event21(21),
    VoidEvent(-1),
    Special0(40),
    Special1(41),
    Special2(42),
    Special3(43),
    BpmChange(100)
}


interface IBeatmapEventData : ICustomBeatmapDataItem, Cloneable {
    val beatmapEventType: BeatmapEventType
    val value: Int
    val floatValue: Float
}