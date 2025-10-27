package lessons.lesson15.homeworks

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }
    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

// 1. Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
class FirstContainer : Materials() {
    override fun addMaterial(material: String) {
        materials.add(0, material)
    }
}

// 2. Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными,
// которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
class SecondContainer : Materials() {
    override fun addMaterial(material: List<String>) {
        var i = 0
        for (item in material) {
            if (i > materials.size) {
                return
            }
            materials.add(i, item)
            i += 2
        }
    }

// 3. Третий класс при добавлении строки должен отсортировать весь список материалов в алфавитном порядке,
// включая добавляемый материал
class SortedContainer : Materials() {
    override fun addMaterial(material: List<String>) {
        materials.add(material)
        materials.sort()
    }
}


