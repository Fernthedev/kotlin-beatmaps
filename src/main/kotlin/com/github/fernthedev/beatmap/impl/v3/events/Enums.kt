package com.github.fernthedev.beatmap.impl.v3.events

enum class TransitionType {
    Instant,
    Interpolate,
    Extend
}

enum class IndexFilterType
{
    StepAndOffset,
    Division
}

enum class IndexFilterLimitAlsoAffectsType
{
    None,
    Duration,
    Distribution,
}

enum class DistributionParamType
{
    Step,
    Wave
}

enum class IndexFilterRandomType
{
    NoRandom,
    KeepOrder,
    RandomElements,
}
