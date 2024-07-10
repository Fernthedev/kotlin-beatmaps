package com.github.fernthedev.beatmap.impl

import com.github.fernthedev.beatmap.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import kotlin.test.assertTrue

class BeatmapLoaderTest {

    @Throws(IOException::class)
    fun getResourceFiles(path: String): List<String> = getResourceAsStream(path).use {
        return@use if (it == null) emptyList()
        else BufferedReader(InputStreamReader(it)).readLines()
    }

    private fun getResourceAsStream(resource: String): InputStream? =
        Thread.currentThread().contextClassLoader.getResourceAsStream(resource)

    private fun loadResourceText(path: String): String? =
        Thread.currentThread().contextClassLoader.getResource(path)?.readText()

    private val beatmapLoader: IBeatmapLoader = BeatmapLoader()

    @Test
    fun loadBeatmapV2() {
        val files = getResourceFiles("v2")

        files.forEach { file ->

            println("Loading $file")
            val fileText =
                loadResourceText("v2/${file}") ?: throw IllegalArgumentException("File $file not found in resources!")

            val beatmap = assertDoesNotThrow {
                beatmapLoader.loadBeatmap(fileText)
            }

            assertTrue("beatmap has notes") {
                beatmap.getBeatmapItems<IColorNote>().any()
            }
            assertTrue("beatmap has bombs") {
                beatmap.getBeatmapItems<IBombNote>().any()
            }
            assertTrue("beatmap has obstacles") {
                beatmap.getBeatmapItems<IObstacle>().any()
            }
            assertTrue("beatmap has events") {
                beatmap.getBeatmapItems<IBeatmapEventData>().any()
            }
        }


    }

    @Test
    fun loadBeatmapV3() {
        val files = getResourceFiles("v3")

        files.forEach { file ->
            println("Loading $file")

            val fileText =
                loadResourceText("v3/${file}") ?: throw IllegalArgumentException("File $file not found in resources!")

            val beatmap = assertDoesNotThrow {
                beatmapLoader.loadBeatmap(fileText)
            }

            assertTrue("beatmap has notes") {
                beatmap.getBeatmapItems<IColorNote>().any()
            }
            assertTrue("beatmap has bombs") {
                beatmap.getBeatmapItems<IBombNote>().any()
            }
            assertTrue("beatmap has obstacles") {
                beatmap.getBeatmapItems<IObstacle>().any()
            }
            assertTrue("beatmap has events") {
                beatmap.getBeatmapItems<IBeatmapEventData>().any()
            }
        }
    }

    @Test
    fun loadBeatmapV4() {
    }
}