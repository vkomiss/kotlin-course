package lessons.lesson19

// 1️⃣ Класс с одним дженериком <A>
class Container<A>(private val element: A) {

    fun getElement(): A {
        return element
    }
}

// 2️⃣ Класс с двумя дженериками <K, V>
class PairBox<K, V>(
    private val first: K,
    private val second: V
) {

    fun getMap(): Map<K, V> {
        return mapOf(first to second)
    }
}

// 3️⃣ Класс с ограничением по типу Number
class Multiplier<T : Number> {

    fun multiplyByTwo(value: T): Double {
        // Преобразуем в Double, чтобы можно было умножать любые числовые типы
        return value.toDouble() * 2
    }
}

// 4️⃣ Класс с nullable дженериком
class NullableBox<T> {

    fun checkNull(value: T?): Boolean {
        return if (value == null) {
            println("Передано значение: null")
            true
        } else {
            println("Передано значение: $value (не null)")
            false
        }
    }
}

///////////////////

// 1️⃣ Интерфейс хранения данных
interface Storage<T> {
    fun save(item: T)
    fun get(): T
}

// 2️⃣ Интерфейс преобразования данных
interface Transformer<T, R> {
    fun transform(input: T): R
}


interface PairProcessor<A, B> {
    fun process(first: A, second: B)
}


interface ConnectionDifferent<T, U, R> {
    fun connect(firstList: List<T>, secondList: List<U>): List<R>
}

//////////////////////////

// Функция swap с дженериком
fun <T> swap(list: MutableList<T>, index1: Int, index2: Int): List<T> {
    // Проверяем, чтобы индексы были допустимыми
    if (index1 !in list.indices || index2 !in list.indices) {
        throw IndexOutOfBoundsException("Неверные индексы: $index1, $index2")
    }

    // Меняем элементы местами
    val temp = list[index1]
    list[index1] = list[index2]
    list[index2] = temp

    // Возвращаем новый неизменяемый список
    return list.toList()
}

fun <T : Number> mergeLists(list1: List<T>, list2: List<T>): List<Double> {
    val maxSize = maxOf(list1.size, list2.size)
    val result = mutableListOf<Double>()

    for (i in 0 until maxSize) {
        val value1 = if (i < list1.size) list1[i].toDouble() else 0.0
        val value2 = if (i < list2.size) list2[i].toDouble() else 0.0
        result.add(value1 + value2)
    }

    return result
}

fun <K, V> toMap(keys: List<K>, values: List<V>?): Map<K, V?> {
    val result = mutableMapOf<K, V?>()

    for (i in keys.indices) {
        val value = values?.getOrNull(i)  // если values меньше, getOrNull вернёт null
        result[keys[i]] = value
    }

    return result
}


////////////////////////

// 🔹 Пример использования
fun main() {
    // Работа с одним элементом
    val cont1 = Container("Привет, Дженерики!")
    println("Элемент контейнера: ${cont1.getElement()}")

    // Работа с парой ключ-значение
    val pair1 = PairBox("Яблоко", 5)
    val resultMap = pair1.getMap()
    println("Словарь из PairBox: $resultMap")

    // Другой пример
    val pair2 = PairBox(101, "Учебная группа Kotlin")
    println("Словарь из PairBox: ${pair2.getMap()}")

    // --- Пример 3: Multiplier ---
    val intMult = Multiplier<Int>()
    println("2 * 5 = ${intMult.multiplyByTwo(5)}")

    val doubleMult = Multiplier<Double>()
    println("2 * 3.14 = ${doubleMult.multiplyByTwo(3.14)}")

    // --- Пример 4: NullableBox ---
    val box = NullableBox<String>()
    box.checkNull("Привет, Kotlin!")
    box.checkNull(null)

    val numBox = NullableBox<Int>()
    numBox.checkNull(10)
    numBox.checkNull(null)

}
