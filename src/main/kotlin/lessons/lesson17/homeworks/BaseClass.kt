package lessons.lesson17.homeworks

// Класс Почемучка
// Нужно скопировать код к себе и постараться ответить на все “почему” в комментариях и заданным образом
// доработать класс ChildrenClass (BaseClass доработке не подлежит)

// Родительский класс (его нельзя изменять)
abstract class BaseClass(
    // 1. аргумент доступен в main() для чтения из класса ChildrenClass,
    private val privateVal: String,

    // 2. это поле недоступно в main(),
    // потому что оно помечено как protected — оно видно только внутри класса и его наследников
    protected val protectedVal: String,

    // publicVal видно в main(), потому что оно public "по умолчанию"
    val publicVal: String
) {
    // публичное поле — видно и в main()
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    // 5. это protected поле — его можно изменить только из наследника
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"

    // 6. private — видно только внутри этого класса, поэтому нужно добавить публичный сеттер в наследнике
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. Объясни, почему эта функция не может быть публичной,
    // потому что она возвращает внутренний класс ProtectedClass, который доступен только внутри и наследникам.
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Распечатай getAll() и объясни, почему в поле "generate" показывает другой текст,
    // потому что метод generate() переопределён в дочернем классе.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. объясни, почему эта функция не может быть публичной или protected
    // потому что возвращает внутренний private класс PrivateClass,
    // который должен быть скрыт от других классов.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass
    private class PrivateClass
}


// Дочерний класс, который можно дорабатывать
class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. этот аргумент доступен в main(), потому что он объявлен как val —
    // значит, это становится полем экземпляра класса.
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 11. функция getAll() доступна в main(),
    // потому что она public в родительском классе и наследуется дочерним.
    // Нам не нужно её переопределять.

    // 12. при вызове printText() выводится "Печать из класса BaseClass",
    // потому что private методы не наследуются и не переопределяются.
    // Наш метод ниже — это отдельный метод с тем же именем, но он не заменяет родительский.
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}


fun main() {
    val det = ChildrenClass("Закрытое значение", "Защищённое значение", "Открытое значение")

    // Меняем publicField
    det.izmenitPublicField("Антонио Бандерас")

    // Меняем protectedField через метод
    det.izmenitProtectedField("Новое значение поля protected")

    // Меняем privateField через новый сеттер
    det.izmenitPrivateField("Новое приватное значение")

    println(det.getAll()) // 8. Здесь "generate" покажет текст из дочернего класса

    det.printText() // 12. Выводит "Печать из класса BaseClass"
}
