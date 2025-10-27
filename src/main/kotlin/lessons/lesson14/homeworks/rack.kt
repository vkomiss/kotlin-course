package lessons.lesson14.homeworks

class rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<shelf>()

    fun addShelf(pol: shelf): Boolean {
        if (shelves.size >= maxShelves || shelves.contains(pol)) {
            return false
        }
        shelves.add(pol)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index < 0 || index >= shelves.size) return emptyList()
        val removed = shelves.removeAt(index)
        return removed.getItems()
    }

    fun addItem(predm: String): Boolean {
        for (pol in shelves) {
            if (pol.addItem(predm)) return true
        }
        return false
    }

    fun removeItem(predm: String): Boolean {
        for (pol in shelves) {
            if (pol.removeItem(predm)) return true  // идя из разбора домашки
        }
        return false
    }

    fun containsItem(predm: String): Boolean {
        return shelves.any { it.containsItem(predm) }
    }

    fun getShelves(): List<shelf> {
        return shelves.toList()
    }

    fun printContents() {
        println("=== Содержимое стеллажа ===")
        shelves.forEachIndexed { i, pol ->
            println("Полка #$i → ${pol}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        // пока не сделал
    }
}