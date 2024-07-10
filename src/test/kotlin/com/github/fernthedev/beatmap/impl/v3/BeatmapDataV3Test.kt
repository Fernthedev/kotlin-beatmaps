package com.github.fernthedev.beatmap.impl.v3

import com.github.fernthedev.beatmap.impl.assertEqualButNotSame
import kotlinx.serialization.json.JsonPrimitive
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class BeatmapDataV3Test {

    private lateinit var container: BeatmapDataV3

    @BeforeEach
    fun setUp() {
        container = BeatmapDataV3(
            customData = mapOf(
                "foo" to JsonPrimitive("x"),
                "foox" to JsonPrimitive("xe"),
            ),
            basicEventTypesWithKeywords = BasicEventTypesWithKeywordsV3(listOf()),
            useNormalEventsAsCompatibleEvents = true
        )
    }

    @Test
    fun testAddBasicEventDataV3() {
        val event = BasicEventDataV3()
        container.add(event)
        assertTrue(container.basicBeatmapEvents.contains(event))
        assertEquals(1, container.basicBeatmapEvents.size)
    }

    @Test
    fun testAddBpmChangeEventDataV3() {
        val event = BpmChangeEventDataV3()
        container.add(event)
        assertTrue(container.bpmEvents.contains(event))
        assertEquals(1, container.bpmEvents.size)
    }

    @Test
    fun testAddRotationEventDataV3() {
        val event = RotationEventDataV3()
        container.add(event)
        assertTrue(container.rotationEvents.contains(event))
        assertEquals(1, container.rotationEvents.size)
    }

    @Test
    fun testAddColorNoteDataV3() {
        val note = ColorNoteDataV3()
        container.add(note)
        assertTrue(container.colorNotes.contains(note))
        assertEquals(1, container.colorNotes.size)
    }

    @Test
    fun testAddBombNoteDataV3() {
        val note = BombNoteDataV3()
        container.add(note)
        assertTrue(container.bombNotes.contains(note))
        assertEquals(1, container.bombNotes.size)
    }

    @Test
    fun testAddObstacleDataV3() {
        val obstacle = ObstacleDataV3()
        container.add(obstacle)
        assertTrue(container.obstacles.contains(obstacle))
        assertEquals(1, container.obstacles.size)
    }

    @Test
    fun testAddWaypointDataV3() {
        val waypoint = WaypointDataV3()
        container.add(waypoint)
        assertTrue(container.waypoints.contains(waypoint))
        assertEquals(1, container.waypoints.size)
    }

    @Test
    fun testRemoveBasicEventDataV3() {
        val event = BasicEventDataV3()
        container.add(event)
        container.remove(event)
        assertFalse(container.basicBeatmapEvents.contains(event))
        assertEquals(0, container.basicBeatmapEvents.size)
    }

    @Test
    fun testRemoveBpmChangeEventDataV3() {
        val event = BpmChangeEventDataV3()
        container.add(event)
        container.remove(event)
        assertFalse(container.bpmEvents.contains(event))
        assertEquals(0, container.bpmEvents.size)
    }

    @Test
    fun testRemoveRotationEventDataV3() {
        val event = RotationEventDataV3()
        container.add(event)
        container.remove(event)
        assertFalse(container.rotationEvents.contains(event))
        assertEquals(0, container.rotationEvents.size)
    }

    @Test
    fun testRemoveColorNoteDataV3() {
        val note = ColorNoteDataV3()
        container.add(note)
        container.remove(note)
        assertFalse(container.colorNotes.contains(note))
        assertEquals(0, container.colorNotes.size)
    }

    @Test
    fun testRemoveBombNoteDataV3() {
        val note = BombNoteDataV3()
        container.add(note)
        container.remove(note)
        assertFalse(container.bombNotes.contains(note))
        assertEquals(0, container.bombNotes.size)
    }

    @Test
    fun testRemoveObstacleDataV3() {
        val obstacle = ObstacleDataV3()
        container.add(obstacle)
        container.remove(obstacle)
        assertFalse(container.obstacles.contains(obstacle))
        assertEquals(0, container.obstacles.size)
    }

    @Test
    fun testRemoveWaypointDataV3() {
        val waypoint = WaypointDataV3()
        container.add(waypoint)
        container.remove(waypoint)
        assertFalse(container.waypoints.contains(waypoint))
        assertEquals(0, container.waypoints.size)
    }

    @Test
    fun getCopy() {
        val copy = container.getCopy() as BeatmapDataV3

        assert(container !== copy)

        // version must be same
        assertEquals(container.version, copy.version)

        assert(container.customData !== copy.customData)
        assertEqualButNotSame(container.colorNotes, copy.colorNotes)
        assertEqualButNotSame(container.bombNotes, copy.bombNotes)
        assertEqualButNotSame(container.obstacles, copy.obstacles)
        assertEqualButNotSame(container.basicBeatmapEvents, copy.basicBeatmapEvents)
        assertEqualButNotSame(container.waypoints, copy.waypoints)
    }
}