package lessons.lesson15.homeworks.hw3

open class stol(
    name: String,
    material: String,
    weight: Double,
    val name: String,
    val nogi: Int
) : mebel fun Opisanie(): String {
        return "Стол: $name ($name), ножек: $nogi, материал: $material, вес: $weight кг."
    }
}