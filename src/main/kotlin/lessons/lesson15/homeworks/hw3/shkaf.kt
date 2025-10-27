package lessons.lesson15.homeworks.hw3

open class shkaf(
    name: String,
    material: String,
    weight: Double,
    val numberOfDver: Int,
    val hasMirror: Boolean
) : furniture(name, material, weight) {

    override fun Opisanie(): String {
        val mirror = if (hasMirror) "с зеркалом" else "без зеркала"
        return "Шкаф: $name, дверей: $numberOfDver, $mirror, материал: $material, вес: $weight кг."
    }
}