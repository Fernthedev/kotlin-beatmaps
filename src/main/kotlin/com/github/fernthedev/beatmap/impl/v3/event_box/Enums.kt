package com.github.fernthedev.beatmap.impl.v3.event_box

import com.github.fernthedev.beatmap.IntEnum
import com.github.fernthedev.beatmap.IntEnumSerializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = TransitionTypeSerializer::class)
enum class TransitionType(override val value: Int) : IntEnum {
    Instant(0),
    Interpolate(1),
    Extend(2);

    companion object : IntEnum.Factory<TransitionType> {
        override fun fromValue(value: Int): TransitionType {
            return entries.first { it.value == value }
        }
    }
}

@Serializable(with = IndexFilterTypeSerializer::class)
enum class IndexFilterType(override val value: Int) : IntEnum {
    StepAndOffset(0),
    Division(1);

    companion object : IntEnum.Factory<IndexFilterType> {
        override fun fromValue(value: Int): IndexFilterType {
            return entries.first { it.value == value }
        }
    }
}

@Serializable(with = IndexFilterLimitAlsoAffectsTypeSerializer::class)
enum class IndexFilterLimitAlsoAffectsType(override val value: Int) : IntEnum {
    None(0),
    Duration(1),
    Distribution(2);

    companion object : IntEnum.Factory<IndexFilterLimitAlsoAffectsType> {
        override fun fromValue(value: Int): IndexFilterLimitAlsoAffectsType {
            return entries.first { it.value == value }
        }
    }
}

@Serializable(with = DistributionParamTypeSerializer::class)
enum class DistributionParamType(override val value: Int) : IntEnum {
    Step(0),
    Wave(1);

    companion object : IntEnum.Factory<DistributionParamType> {
        override fun fromValue(value: Int): DistributionParamType {
            return entries.first { it.value == value }
        }
    }
}

@Serializable(with = IndexFilterRandomTypeSerializer::class)
enum class IndexFilterRandomType(override val value: Int) : IntEnum {
    NoRandom(0),
    KeepOrder(1),
    RandomElements(2);

    companion object : IntEnum.Factory<IndexFilterRandomType> {
        override fun fromValue(value: Int): IndexFilterRandomType {
            return entries.first { it.value == value }
        }
    }
}


object TransitionTypeSerializer : KSerializer<TransitionType> by IntEnumSerializer.create(TransitionType)

object IndexFilterTypeSerializer : KSerializer<IndexFilterType> by IntEnumSerializer.create(IndexFilterType)

object IndexFilterLimitAlsoAffectsTypeSerializer : KSerializer<IndexFilterLimitAlsoAffectsType> by IntEnumSerializer.create(IndexFilterLimitAlsoAffectsType)

object DistributionParamTypeSerializer : KSerializer<DistributionParamType> by IntEnumSerializer.create(DistributionParamType)

object IndexFilterRandomTypeSerializer : KSerializer<IndexFilterRandomType> by IntEnumSerializer.create(IndexFilterRandomType)