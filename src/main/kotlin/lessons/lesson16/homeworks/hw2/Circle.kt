package lessons.lesson16.homeworks.hw2

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.1415926 * radius * radius
    }
}