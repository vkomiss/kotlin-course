package lessons.lesson16.homeworks.hw5

class Logger {

    fun log(message: String) {
        println("${prefix("INFO")} $message")
    }

    // принимает уровень логирования и сообщение
    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("${colorYellow(prefix("WARNING"))} $message")
            "ERROR" -> println("${colorWhiteOnRed(prefix("ERROR"))} $message")
            "DEBUG" -> println("${prefix("DEBUG")} $message")
            else -> println("${prefix("INFO")} $message")
        }
    }

    // принимает список сообщений (все как INFO)
    fun log(messages: List<String>) {
        for (msg in messages) {
            println("${prefix("INFO")} $msg")
        }
    }
}