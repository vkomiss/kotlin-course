package lessons.lesson16.homeworks.hw2

class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val angle: Double
) : Shape() {
    override fun area(): Double {
        return 0.5 * sideA * sideB * angle
    }
}