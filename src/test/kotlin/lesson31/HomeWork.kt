package lesson31

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.util.stream.Stream

// очистка строки от мусора
// длина 10 и 11
// проверка первой цифры при длине 11
// корректная сборка формата
// выброс IllegalArgumentException
// параметризованные тесты с разными источниками

class PhoneNumberFormatterTest {

    private val formatter = PhoneNumberFormatter()

    // ---------- Валидные номера ----------

    @ParameterizedTest
    @CsvSource(
        "8 (922) 941-11-11, +7 (922) 941-11-11",
        "79229411111, +7 (922) 941-11-11",
        "+7 922 941 11 11, +7 (922) 941-11-11",
        "9229411111, +7 (922) 941-11-11",
        "abc +7 922 941 11 11, +7 (922) 941-11-11"
    )
    fun `valid phone numbers formatted correctly`(input: String, expected: String) {
        val result = formatter.formatPhoneNumber(input)
        assertEquals(expected, result)
    }

    // ---------- Невалидные номера (короткие и длинные) ----------

    @ParameterizedTest
    @ValueSource(strings = ["12345", "1234567890123"])
    fun `invalid length phone numbers throw exception`(input: String) {
        assertThrows(IllegalArgumentException::class.java) {
            formatter.formatPhoneNumber(input)
        }
    }

    // ---------- Невалидные коды стран ----------

    @ParameterizedTest
    @ValueSource(strings = ["+1 (922) 941-11-11", "999229411111"])
    fun `invalid country code throws exception`(input: String) {
        assertThrows(IllegalArgumentException::class.java) {
            formatter.formatPhoneNumber(input)
        }
    }

    // ---------- MethodSource пример ----------

    @ParameterizedTest
    @MethodSource("invalidPhones")
    fun `various invalid phones throw exception`(input: String) {
        assertThrows(IllegalArgumentException::class.java) {
            formatter.formatPhoneNumber(input)
        }
    }

    companion object {
        @JvmStatic
        fun invalidPhones(): Stream<String> =
            Stream.of(
                "",
                "abcdef",
                "+7",
                "7",
                "8123",
                "70000000000"
            )
    }
}
