package lessons.lesson15.homeworks.hw2

open class school(
    name: String,
    city: String,
    foundedYear: Int,
    val numberOfStudents: Int,
    val level: String // например: "начальная", "средняя", "старшая"
) : educationalInstitution(name, city, foundedYear) {

    override fun getInfo(): String {
        return "Школа: $name ($level), город: $city, учеников: $numberOfStudents, основана в $foundedYear году."
    }
}