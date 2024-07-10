package com.github.fernthedev.beatmap.impl.v2

import com.github.fernthedev.beatmap.impl.assertEqualButNotSame
import kotlinx.serialization.json.JsonPrimitive
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BeatmapDataV2Test {

    private lateinit var container: BeatmapDataV2

    @BeforeEach
    fun setUp() {
        // setup customData to avoid empty map identical
        container = BeatmapDataV2(
            customData = mapOf(
                "foo" to JsonPrimitive("x"),
                "foox" to JsonPrimitive("xe"),
            ),
        )
    }

    @Test
    fun testAddEventDataV2() {
        val event = EventDataV2()
        container.add(event)
        assertTrue(container.events.contains(event))
        assertEquals(1, container.events.size)
    }

    @Test
    fun testAddNoteDataV2() {
        val note = NoteDataV2()
        container.add(note)
        assertTrue(container.notes.contains(note))
        assertEquals(1, container.notes.size)
    }

    @Test
    fun testAddObstacleDataV2() {
        val obstacle = ObstacleDataV2()
        container.add(obstacle)
        assertTrue(container.obstacles.contains(obstacle))
        assertEquals(1, container.obstacles.size)
    }

    @Test
    fun testAddBeatmapWaypointV2() {
        val waypoint = BeatmapWaypointV2()
        container.add(waypoint)
        assertTrue(container.waypoints.contains(waypoint))
        assertEquals(1, container.waypoints.size)
    }

    @Test
    fun testRemoveEventDataV2() {
        val event = EventDataV2()
        container.add(event)
        container.remove(event)
        assertFalse(container.events.contains(event))
        assertEquals(0, container.events.size)
    }

    @Test
    fun testRemoveNoteDataV2() {
        val note = NoteDataV2()
        container.add(note)
        container.remove(note)
        assertFalse(container.notes.contains(note))
        assertEquals(0, container.notes.size)
    }

    @Test
    fun testRemoveObstacleDataV2() {
        val obstacle = ObstacleDataV2()
        container.add(obstacle)
        container.remove(obstacle)
        assertFalse(container.obstacles.contains(obstacle))
        assertEquals(0, container.obstacles.size)
    }

    @Test
    fun testRemoveBeatmapWaypointV2() {
        val waypoint = BeatmapWaypointV2()
        container.add(waypoint)
        container.remove(waypoint)
        assertFalse(container.waypoints.contains(waypoint))
        assertEquals(0, container.waypoints.size)
    }

    @Test
    fun getAllBeatmapItems() {
        // TODO:
    }

    @Test
    fun getBeatmapItems() {
        // TODO:
    }

    @Test
    fun getCopy() {
        val copy = container.getCopy()

        assert(container !== copy)

        // version must be same
        assertEquals(container.version, copy.version)

        assert(container.customData !== copy.customData)
        assertEqualButNotSame(container.notes, copy.notes)
        assertEqualButNotSame(container.obstacles, copy.obstacles)
        assertEqualButNotSame(container.events, copy.events)
        assertEqualButNotSame(container.waypoints, copy.waypoints)
    }
}