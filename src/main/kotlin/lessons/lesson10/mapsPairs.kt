package lessons.lesson10

fun main() {

    val pair = 1 to "a" // пара значений, может и разных типов

    val emptyMap: Map<String, Int> = mapOf()

    val cap: Map<String, String> = mapOf("Russia" to "Moscow")

    val map = mapOf<Int, String>(1 to "a", 2 to "b")

    val mutmap: MutableMap<String, String> = mutableMapOf<String, String>("Russia" to "Moscow")

    mutmap["Germany"] = "Berlin"

    mutmap.remove("Germany")

    val caprus = cap["Russia"]
    println(caprus)

    for ((country, caption) in cap) {
        println("$country: $caption")
    }

    if ("Russia" in cap) {
        println("Cap of Russia: ${cap["Russia"]}")
    }

    val mapmut = mutableMapOf<String?, Int>(null to 1)

    ///////////////////////////

    val a1 = mapOf<String, Int>("a" to 1, "b" to 2)
    val a2 = mutableMapOf<String, Int>("a" to 1, "b" to 2)
    a2["c"] = 3
    a2.remove("a")

    for ((bk, sch) in a2) {
        println("bk: $bk sch: $sch")
    }

    fun getKey(tekMap: Map<String, String>, key: String) {
        for ((k,v) in tekMap) {
            if (k == key) {
                println(v)
                return
            }
        }
        println("Key not found")
    }

    getKey(mapOf("a" to "1", "b" to "2"), "c")

    val raspis = mapOf<String, MutableList<String>>()
    val studyPlan = mapOf<String, MutableList<String>>()
    val contacts = mutableMapOf<String, MutableMap<String, String>>()
    contacts["Vovan"] = mutableMapOf("phone" to "Kz U-Ka")
    contacts["Vovan"]?.put("e-mail", "12@mail")



}