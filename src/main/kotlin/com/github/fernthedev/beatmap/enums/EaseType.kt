package com.github.fernthedev.beatmap.enums

import com.github.fernthedev.beatmap.IntEnum
import com.github.fernthedev.beatmap.IntEnumSerializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = EaseTypeSerializer::class)
enum class EaseType(override val value: Int) : IntEnum {
    None(-1),
    Linear(0),
    InQuad(1),
    OutQuad(2),
    InOutQuad(3),
    InSine(4),
    OutSine(5),
    InOutSine(6),
    InCubic(7),
    OutCubic(8),
    InOutCubic(9),
    InQuart(10),
    OutQuart(11),
    InOutQuart(12),
    InQuint(13),
    OutQuint(14),
    InOutQuint(15),
    InExpo(16),
    OutExpo(17),
    InOutExpo(18),
    InCirc(19),
    OutCirc(20),
    InOutCirc(21),
    InBack(22),
    OutBack(23),
    InOutBack(24),
    InElastic(25),
    OutElastic(26),
    InOutElastic(27),
    InBounce(28),
    OutBounce(29),
    InOutBounce(30),
    BeatSaberInOutBack(100),
    BeatSaberInOutElastic(101),
    BeatSaberInOutBounce(102);

    companion object : IntEnum.Factory<EaseType> {
        override fun fromValue(value: Int): EaseType = entries.first { it.value == value }
    }
}

object EaseTypeSerializer : KSerializer<EaseType> by IntEnumSerializer.create(EaseType)
