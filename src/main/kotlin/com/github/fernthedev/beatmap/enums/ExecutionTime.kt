package com.github.fernthedev.beatmap.enums

import com.github.fernthedev.beatmap.IntEnum
import com.github.fernthedev.beatmap.IntEnumSerializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable

@Serializable(with = ExecutionTimeTypeSerializer::class)
enum class ExecutionTime(override val value: Int) : IntEnum {
    Early(0),
    Late(1);

    companion object : IntEnum.Factory<ExecutionTime> {
        override fun fromValue(value: Int): ExecutionTime {
            return entries.first { it.value == value }
        }
    }
}

object ExecutionTimeTypeSerializer : KSerializer<ExecutionTime> by IntEnumSerializer.create(ExecutionTime)
