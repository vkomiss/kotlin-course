package lessons.lesson15.homeworks.hw1

open class geometricFigure(
    val name: String
) {
    open fun area(): Double {
        println("Площадь неизвестна для общей фигуры.")
        return 0.0
    }
}