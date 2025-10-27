package lessons.lesson15.homeworks.hw1

class chetyreh(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
    val sideD: Double
) : polygon("Четырёхугольник", 4) {

    override fun area(): Double {
        println("Для четырёхугольника требуется дополнительная информация (углы, диагонали).")
        return 0.0
    }
}