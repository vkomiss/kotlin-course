package lessons.lesson31

class PhoneNumberFormatter {

    fun formatPhoneNumber(input: String): String {
        val digits = input.replace("\\D".toRegex(), "")

        if (digits.length !in listOf(10, 11)) {
            throw IllegalArgumentException("Невалидный номер")
        }

        val normalized = if (digits.length == 11) {
            if (digits.startsWith("7") || digits.startsWith("8")) {
                digits.substring(1)
            } else {
                throw IllegalArgumentException("Невалидный номер")
            }
        } else {
            digits
        }

        val code = normalized.substring(0, 3)
        val part1 = normalized.substring(3, 6)
        val part2 = normalized.substring(6, 8)
        val part3 = normalized.substring(8, 10)

        return "+7 ($code) $part1-$part2-$part3"
    }
}
