package lessons.lesson14

fun main() {

    logger.log("123")

    Calculator()
    val c = Calculator.add(2, 4)

    val user1 = User(1, "Vova")
    val user2 = user1.copy(name = "Den")  // копируем данные из другого объекта датакласса



}

object logger {
    fun log(message: String) {
        println("Log:  $message")
    }
}

class Calculator {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a * b
        }
    }
}

data class User( val id: Int, val name: String)

