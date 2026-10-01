package ua.edu.znu.geoquizcomposeedu

import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class ParameterizedRepositoryTest(private val capital: String) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<String> {
            return listOf("Київ", "Львів", "Запоріжжя", "Одеса")
        }
    }

    @Test
    fun testCapitalIsNotBlank() {
        assertTrue(capital.isNotBlank())
    }
}