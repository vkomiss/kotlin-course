package lessons.lesson19.homeworks

// Создай класс StringValidator и имплементируй интерфейс Validator
// с типом String?. Реализуй проверку,
// что строка не является null,
// не пустая,
// и не состоит из одних пробелов.
class StringValidator : Validator<String?> {
    override fun isValid(el: String?): Boolean {
        return el != null && el.trim().isNotEmpty()
    }
}