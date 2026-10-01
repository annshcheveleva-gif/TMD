package ua.edu.znu.geoquizcomposeedu

import org.junit.Test
import org.junit.Assert.*

class NegativeRepositoryTest {

    @Test(expected = IllegalArgumentException::class)
    fun testExceptionIsThrown() {
        val index = -1
        if (index < 0) {
            throw IllegalArgumentException("Індекс не може бути від'ємним!")
        }
    }

    @Test(timeout = 1000)
    fun testExecutionTimeout() {
        Thread.sleep(100)
        assertTrue(true)
    }
}