package com.github.fernthedev.beatmap

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = BeatmapEventTypeSerializer::class)
enum class BeatmapEventType(override val value: Int) : IntEnum {
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
    BpmChange(100);

    companion object : IntEnum.Factory<BeatmapEventType> {
        override fun fromValue(value: Int): BeatmapEventType {
            return entries.first { it.value == value }
        }
    }
}


object BeatmapEventTypeSerializer : KSerializer<BeatmapEventType> by IntEnumSerializer.create(BeatmapEventType)

interface IBeatmapEventData : ICustomBeatmapDataItem, Cloneable {
    val beatmapEventType: BeatmapEventType
    val value: Int
    val floatValue: Float
}