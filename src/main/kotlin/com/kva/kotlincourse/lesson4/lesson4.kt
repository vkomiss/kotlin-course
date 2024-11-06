package com.kva.com.kva.kotlincourse.lesson4

val myInt: Int = Int.MAX_VALUE
val myFloat: Float = 0.25f
val myLong: Long = 13223213123123
val myShot: Short = 1257
val myByte: Byte = 127
val meDouble: Double = 2.21245645648454

val isBool: Boolean = true

val letter: Char = 'd'
val text: String = "Duyuy dehjhuedhu vdje pojjhas"

val number: Array<Int> = arrayOf(1, 2, 3)                           // изменяемая коллекция
val string: List<String> = listOf("1", "2", "3")                    // НЕ изменяемая коллекция
val doubles: Set<Double> = setOf(12.3, 56.3)                        // НЕ изменяемая коллекция
val stringMut: MutableList<String> = mutableListOf("1", "2", "3")   // изменяемая коллекция

// Словари

val keysToValues: Map<String, String> = mapOf(                      // НЕ изменяемая коллекция
    "Ключ 1" to "Значение 1"
    "Ключ 2" to "Значение 2"
)

val anyTh: Any = false          // Любой тип

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessage(message: String): Nothing {
    throw IllegalArgumentException(message)
}


// ДОМАШНЕЕ ЗАДАНИЕ

//Для каждого значения допиши подходящий тип данных



val my01: Byte = 42
val my02: Long = 98765432123456789L
val my03: Float = 23.45f
val my04: Double = 0.123456789
val my05: String = "Kotlin & Java"
val my06: Boolean = false
val my07: Char = 'c'
val my08: Short = 500
val my09: Long = 4294967296L
val my10: Float = 18.0f
val my11: Double = -0.001
val my12: String = "OpenAI"
val my13: String = “true”
val my14: Char = '9'
val my15: Short = 2048
val my16: Long = 10000000000L
val my17: Float = 5.75f
val my18: Double = 1.414
val my19: String = "Artificial Intelligence"
val my20: Boolean = false
val my21: Char = '@'
val my22: Short = 1024
val my23: Long = 1234567890123L
val my24: Float = 10.01f
val my25: Double = -273.15
val my26: String = "SpaceX"
val my27: Boolean = true
val my28: Char = “🤯”
val my29: String = ‘65535’
val my30: Long = 72057594037927935L
val my31: Float = 2.71828f
val my32: Double = 101.0101
val my33: String = "Quantum Computing"
val my34: Boolean = false
val my35: Char = 'x'
val my36: Short = 314
val my37: Long = 123456789123456789L
val my38: Float = 6.626f
val my39: Double = 0.007
val my40: String = "Android Studio"
