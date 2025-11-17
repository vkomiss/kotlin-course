package lessons.lesson19.homeworks

// Создай класс OddValidator и имплементируй интерфейс Validator,
// типизированный по Int.
// Реализуй проверку, что число чётное.
class OddValidator : Validator<Int> {
    override fun isValid(el: Int): Boolean {
        return el % 2 == 0
    }
}