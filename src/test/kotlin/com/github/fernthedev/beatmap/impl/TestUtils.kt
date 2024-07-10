package com.github.fernthedev.beatmap.impl

import kotlin.test.assertEquals
import kotlin.test.assertNotSame

fun <T> assertEqualButNotSame(expected: T, value: T) {
    assertEquals(expected, value)
    assertNotSame(expected, value)
}