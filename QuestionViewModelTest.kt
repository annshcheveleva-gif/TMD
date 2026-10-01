package ua.edu.znu.geoquizcomposeedu

import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import ua.edu.znu.geoquizcomposeedu.data.QuestionRepository

class QuestionViewModelTest {

    private lateinit var repository: QuestionRepository

    @Before
    fun setUp() {
        repository = mockk()
    }

    @Test
    fun testRepositoryMockBehavior() {
        every { repository.getQuestionBankSize() } returns 5

        val result = repository.getQuestionBankSize()

        assertEquals(5, result)

        verify { repository.getQuestionBankSize() }
    }

    @Test
    fun testRepositorySpyBehavior() {
        val spyRepository = spyk(repository)

        every { spyRepository.getQuestionBankSize() } returns 10

        val result = spyRepository.getQuestionBankSize()

        assertEquals(10, result)

        verify { spyRepository.getQuestionBankSize() }
    }
}