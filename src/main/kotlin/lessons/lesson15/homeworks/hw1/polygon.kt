package lessons.lesson15.homeworks.hw1

open class polygon(
    name: String,
    val sides: Int
) : geometricFigure(name) {
    open fun perimeter(): Double {
        println("Периметр вычисляется по количеству сторон.")
        return 0.0
    }
}