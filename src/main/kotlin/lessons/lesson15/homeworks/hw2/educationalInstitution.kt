package lessons.lesson15.homeworks.hw2

open class educationalInstitution(
    val name: String,
    val city: String,
    val osnovYear: Int
) {
    open fun getInfo(): String {
        return "Учебное заведение: $name, город: $city, основано в $osnovYear году."
    }
}