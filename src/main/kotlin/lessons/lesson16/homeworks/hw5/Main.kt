package lessons.lesson16.homeworks.hw5

fun main() {
    val log = Logger()

    // Пример 1: стандартный лог
    log.log("Приложение запущено")

    // Пример 2: указание уровня логирования
    log.log("WARNING", "Низкий заряд батареи")
    log.log("ERROR", "Ошибка подключения к серверу")
    log.log("DEBUG", "Проверка режима отладки")

    // Пример 3: список сообщений
    val messages = listOf("Пользователь вошел", "Пользователь вышел", "Сессия завершена")
    log.log(messages)

}