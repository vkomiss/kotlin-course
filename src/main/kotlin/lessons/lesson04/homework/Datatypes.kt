package lessons.lesson04.homework

val v1: Byte = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"
//val v6: Boolean = FALSE
val v7: Char = 'c'
val v8: Int = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
val v13: String = "true"
val v14: List<Byte> = listOf(3, 14)
val v15: Char = '9'
val v16: Int = 2048
val v17: Long = 10000000000L
val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f
val v20: String = "1.414"
val v21: String = "Artificial Intelligence"
val v22: Array<Any> = arrayOf('x', "A")
val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Int = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"
//val v30: Boolean = FALSE
val v31: Double = 0.007
val v32: String = "🤯"
val v33: Map<String, Byte> = mapOf("true" to 2, "false" to 34)
val v34: String = "65535"
val v35: Long = 72057594037927935L
val v36: Float = 2.71828f
val v37: Double = 101.0101
val v38: String = "Quantum Computing"
val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Int = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f
//val v44: Boolean = TRUE

// 1. Количество раз, сколько сосед включал перфоратор в воскресенье утром на протяжении года
var sundayDrillCount: Int = 0
// 2. Уровень чечевичного супа с фрикадельками в кастрюле (в долях сантиметра)
var lentilSoupLevel: Double = 0.0
// 3. Буква года, выбранная на ежегодной конференции важных букв
var letterOfTheYear: Char = 'A'
// 4. Энергия столкновения мухи с лбом академика при вылете из адронного коллайдера
var flyCollisionEnergy: Double = 0.0
// 5. Число прыжков лягушки через лужи во время одной прогулки
var frogJumpCount: Int = 0
// 6. Словарь «имя разработчика → причина, почему задача до сих пор не сделана»
//val devExcuses: Map<Any> = mapOf()
// 7. Признак, включен ли временный костыль трёхлетней давности на продакшене
var isLegacyHackEnabled: Boolean = false
// 8. Количество тапков, которые кот утащил за диван сегодня
var stolenSlippersCount: Byte = 0  // максимум 127 хватит с запасом :)
// 9. Общее количество крошек на диване после вечеринки студентов
var couchCrumbs: Long = 0  // студентов много, нужен запас по диапазону
// 10. Список зачислений на карту
val cardTransactions: MutableList<Double> = mutableListOf()
// 11. Список отговорок «почему тесты упали»
val testExcuses: MutableList<String> = mutableListOf()
// 12. Строка «будет сделано завтра» для автоматических ответов
const val autoReply: String = "будет сделано завтра"