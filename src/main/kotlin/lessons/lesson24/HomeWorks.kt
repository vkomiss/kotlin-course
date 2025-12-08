package lessons.lesson24

// 1.1 принимает булево значение
fun task1_1(flag: Boolean) { }

// 1.2 принимает функцию, принимающую строку и ничего не возвращающую
fun task1_2(action: (String) -> Unit) { }

// 1.3 возвращает целое число
fun task1_3(): Int = 0


// 2. ФУНКЦИИ-РАСШИРЕНИЯ INT

// 2.1 принимает функцию расширения целого числа,
//     принимающую строку и возвращающую список строк
fun Int.task2_1(transform: Int.(String) -> List<String>) { }

// 2.2 возвращает список строк
fun Int.task2_2(): List<String> = listOf()


// 3. ФУНКЦИИ С ДВУМЯ ДЖЕНЕРИКАМИ

// 3.1 принимает функцию, расширяющую первый дженерик,
//     ничего не принимающую и возвращающую второй дженерик
fun <T, R> T.task3_1(action: T.() -> R) { }

// 3.2 возвращает второй дженерик
fun <T, R> T.task3_2(): R {
    throw NotImplementedError()
}

// 4. ФУНКЦИИ

// 4.1 принимает строку
fun task4_1(text: String) { }

// 4.2 возвращает функцию, которая ничего не принимает и возвращает строку
fun task4_2(): () -> String {
    return { "" }
}

// 5. ФУНКЦИИ-РАСШИРЕНИЯ ДЖЕНЕРИКА

// 5.1 ничего не принимают
fun <T> T.task5_1() { }

// 5.2 возвращает функцию, принимающую строку и возвращающую дженерик
fun <T> T.task5_2(): (String) -> T {
    return { _ -> this }
}

///////////////////////////////
// 6.

// СДЕЛАН ИИ !!!

object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

fun String.colorize(color: String): String {
    return "$color$this${Colors.RESET}"
}

fun String.colorizeWords(rule: (String) -> String) {
    this.split(" ").forEach { word -> println(rule(word)) }
}

fun ruleStartsWithUpper(word: String): String {
    return when {
        word.firstOrNull()?.isUpperCase() == true -> word.colorize(Colors.RED)
        else -> word.colorize(Colors.WHITE)
    }
}

fun ruleShorterThan3(word: String): String {
    return if (word.length < 3) word.colorize(Colors.GREEN) else word.colorize(Colors.WHITE)
}

fun ruleLongerThan6(word: String): String {
    return if (word.length > 6) word.colorize(Colors.YELLOW) else word.colorize(Colors.WHITE)
}

fun ruleLengthEven(word: String): String {
    return if (word.length % 2 == 0) word.colorize(Colors.BLUE) else word.colorize(Colors.WHITE)
}

fun ruleDefault(word: String): String {
    return word.colorize(Colors.CYAN)
}

val colorList = listOf(
    Colors.RED,
    Colors.GREEN,
    Colors.YELLOW,
    Colors.BLUE,
    Colors.PURPLE,
    Colors.CYAN,
    Colors.WHITE
)

fun ruleRotateColors(word: String): String {
    val color = colorList[rotateIndex]
    rotateIndex = (rotateIndex + 1) % colorList.size
    return word.colorize(color)
}

var rotateIndex = 0

var colorCounter = 0
var counterFunction: () -> Unit = { colorCounter++ }

fun ruleSmartColorRotation(word: String): String {
    val color = colorList[colorCounter]
    counterFunction()
    if (colorCounter == colorList.size - 1) counterFunction = { colorCounter-- }
    if (colorCounter == 0) counterFunction = { colorCounter++ }
    return word.colorize(color)
}

fun LongText(): String = """
Создай свой тип исключения в отдельном файле наследуемый от RuntimeException 
и принимающий IndexOutOfBoundsException тип в качестве аргумента напиши код 
который спровоцирует выброс IndexOutOfBoundsException и перехвати его с 
помощью try-catch и в блоке catch выведи сообщение в консоль и сделай выброс 
своего типа исключения.
""".trimIndent()

fun main() {
    val text = LongText()

    println("\n=== Starts with Upper ===")
    text.colorizeWords(::ruleStartsWithUpper)

    println("\n=== Shorter than 3 ===")
    text.colorizeWords(::ruleShorterThan3)

    println("\n=== Longer than 6 ===")
    text.colorizeWords(::ruleLongerThan6)

    println("\n=== Length even ===")
    text.colorizeWords(::ruleLengthEven)

    println("\n=== Default rule ===")
    text.colorizeWords(::ruleDefault)

    println("\n=== Rotate colors ===")
    rotateIndex = 0
    text.colorizeWords(::ruleRotateColors)

    println("\n=== Smart rotate ===")
    colorCounter = 0
    counterFunction = { colorCounter++ }
    text.colorizeWords(::ruleSmartColorRotation)
}
