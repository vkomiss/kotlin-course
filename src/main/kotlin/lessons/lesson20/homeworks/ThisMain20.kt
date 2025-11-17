package lessons.lesson20.homeworks

import kotlin.math.absoluteValue

// Определите функцию-расширение для массива чисел, которая не принимает аргументов
// и возвращает пару из чисел — первое и последнее.
// Если массив был пуст, то вернуть пару из null значений.
fun <T : Number> Array<T>.getFirstLast(): Pair<T?, T?> {
    return if (this.isEmpty()) {
        Pair(null, null)
    } else {
        Pair(this.first(), this.last())
    }
}

// Создайте функцию-расширение для изменяемого списка элементов:
// с дженериком T, ограниченным интерфейсом Comparable<T>,
// которая принимает булево значение,
// возвращает этот же список только в виде неизменяемого,
// а сам изменяемый список при этом должен стать отсортированным:
// по возрастанию, если true,
// по убыванию, если false.
// (Используем функции sort() и sortDescending())
fun <T : Comparable<T>> MutableList<T>.sorted(flag: Boolean): List<T> {
    if (flag) this.sort() else this.sortDescending()
    return this.toList()
}

// Создайте функцию-расширение для nullable словаря с дженериком:
//
// Ключ — дженерик K
// Значение — список из дженериков V
//
// Функция принимает целое число,
// возвращает nullable словарь:
//
// Ключи — строка, полученная из исходного ключа через toString()
// Значения — nullable дженерик V:
// берём элемент списка исходного словаря по индексу,
// если индекс выходит за границы — значение null.
fun <K, V> Map<K, List<V>>?.pickByIndex(idx: Int): Map<String, V?>? {
    if (this == null) return null

    val res = mutableMapOf<String, V?>()

    for ((k, vList) in this) {
        val newVal = if (idx in vList.indices) {
            vList[idx]
        } else null
        res[k.toString()] = newVal
    }

    return res
}


// Реализуйте метод расширения within для класса Number,
// который проверяет, что текущее число отклоняется от эталонного
// не более допустимого значения.
// Метод принимает два параметра:
// other — число для сравнения,
// deviation — максимально допустимое отклонение.
// Возвращает true, если |this - other| <= deviation.
// Для получения отклонения используется absoluteValue.

fun Number.within(other: Number, deviation: Number): Boolean {
    val diff = this.toDouble() - other.toDouble()
    return diff.absoluteValue <= deviation.toDouble()
}


// Реализуйте для класса String два метода расширения: encrypt и decrypt.
// encrypt — сдвигает каждый символ строки вперёд на base позиций по Unicode.
// decrypt — сдвигает символы назад на base позиций.
// Оба метода принимают параметр base типа Int.
// Проверить, что encrypt().decrypt() возвращает исходную строку.

fun String.encrypt(base: Int): String {
    return this.map { ch -> (ch.code + base).toChar() }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return this.map { ch -> (ch.code - base).toChar() }.joinToString("")
}



fun main() {

    println("within")
    println(10.within(12, 3))   // true (разница 2)
    println(10.within(15, 3))   // false (разница 5)
    println(5.5.within(6.0, 0.6)) // true

    println("encrypt / decrypt")
    val txt = "Hello Kotlin"
    val enc = txt.encrypt(5)
    val dec = enc.decrypt(5)

    println("Исходная: $txt")
    println("Зашифрована: $enc")
    println("Расшифрована: $dec")
}
