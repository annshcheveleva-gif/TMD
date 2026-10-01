package ua.edu.znu.geoquizcomposeedu

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RepositoryTest {

    private lateinit var quizData: List<String>

    @Before
    fun setUp() {
        quizData = listOf("Київ", "Львів", "Запоріжжя", "Одеса")
    }

    @Test
    fun testDataIsNotEmpty() {
        assertNotNull(quizData)
        assertTrue(quizData.isNotEmpty())
        assertEquals(4, quizData.size)
    }

    @Test
    fun testItemExists() {
        assertTrue(quizData.contains("Запоріжжя"))
    }
}