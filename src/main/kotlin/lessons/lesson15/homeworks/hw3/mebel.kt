package lessons.lesson15.homeworks.hw3

open class mebel(
    val name: String,
    val material: String,
    val weight: Double
) {
    open fun Opisanie(): String {
        return "Мебель: $name, материал: $material, вес: $weight кг."
    }
}