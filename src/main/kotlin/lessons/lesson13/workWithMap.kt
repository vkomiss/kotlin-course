package lessons.lesson13

fun main() {

    val m01 = mapOf("apple" to 2.99, "micr" to 3.15)

    for (entry in m01.entries) {
        println("{${entry.key}} -> {${entry.key}}")
    }

    for ((key1, value1) in  m01) {
        println("$key1 -> $value1")
    }

    val mapEn = m01.entries
    val mapKey = m01.keys
    val mapVal = m01.values

    ////////
    // МЕТОДЫ ПОЛУЧЕНИЯ ЗНАЧЕНИЙ

    val perm0101 = m01.getOrElse("apple") {1.00} //если не найдено, то 1.00
    val perm0102 = m01.getValue("apple")
    val perm0103 = m01.getOrDefault("apple", 0.00)

    val m02 = m01 - "micr" // удалить эемент
    val m03 = m01 - listOf("micr", "apple") // удалить список элементов
    val m04 = m01 + ("xiaom", 4.33) // добавить элемент

    val m05 = m01.toMutableMap() // создать ИЗМЕНЯЕМЫЙ словарь
    m05.putAll()
    m05.remove()
    m05.clear()

    val per01 = m01.containsKey()
    val per02 = m02.containsValue()
    val per03 = m01.isEmpty()
    val per04 = m01.isNotEmpty()
    val per05 = m01.all { it.value > 1.0 }
    val per06 = m01.none {it.value < 1}

    val per07 = m02.filter { it.value > 1.0 }
    val per08 = m01.filterKeys { it.startsWith("a") }
    val per09 = m01.filterValues { it <= 2.0 }
    val per10 = m01.filterNot { it.key == "apple" }
    val per11 = m01.count { it.value > 1.5}

    val per12: Map<String, String> = m01.mapValues { "${it.value * 1.1}" }
    val per13 = m01.mapKeys { it.key.uppercase() }
    val per14 = m01.map { "${it.key} cost ${it.value}" }

    val per15 = m05.toMap()
    val per16 = m01.toMutableMap()

    m01.forEach { (kk, vv) ->
        println("$kk -> $vv")
    }

    m01.forEach {
        println("${it.key} -> ${it.value}")
    }





}