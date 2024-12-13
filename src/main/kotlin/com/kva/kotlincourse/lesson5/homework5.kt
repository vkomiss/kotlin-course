package com.kva.com.kva.kotlincourse.lesson5

import kotlin.time.times

//fun main() {
//    val a1 = (3 + 2 < 6) && (4 * 2 == 8)
//
//    val a2 = (10 - 5 >= 5) || (2 * 3 != 6)
//
//    val a3 = (8 / 2 == 4) && (7 % 3 != 1)
//
//    val a4 = (9 - 3 >= 6) && (8 / 2 != 4)
//
//    val a5 = ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1)
//
//    val a6 = ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2)
//
//    val a7 = ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4)
//
//    println(a1)
//    println(a2)
//    println(a3)
//    println(a4)
//    println(a5)
//    println(a6)
//    println(a7)

//    (var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5))

//    val defaultName = "Unknown"
//    val name: String? = null
//    val result = name ?: "Unknown" // Если name = null тогда "Unknown" иначе null
//    val result2 = name ?: throw IllegalArgumentException("Не может быть null") // если null то выполнить ...

//}

////////////// Уровень громкости

//fun main() {
//    printVolume(userVolume = null)
//}
//fun printVolume(userVolume: Int?) {
//    val defaultVolume = 30
//    println(userVolume ?: defaultVolume)
//}

////////////// Товар со скидкой

//fun main() {
//    printPrice(123.3, null)
//    printPrice(45.0, 10)
//
//}
//
//fun printPrice(price: Double, s: Int?) {
//    val koef = (100 - (s?: 0)) / 100.0
//    println(price * koef)
//}

///////////////

//fun main() {
//    printSiteLan(null)
//    printSiteLan("Uz")
//
//}
//
//fun printSiteLan(lang: String?){
//    val defLan: String = "En"
//    println(lang ?: defLan)
//}

////////////////

//fun main() {
//    printBox("урма")
//    printBox(null)
//
//}
//
//fun printBox(stuff: String?){
//    println( stuff ?: throw Exception("Коробка пустая"))
//}

//////////////////
// ДОМАШНЯЯ РАБОТА

fun main() {
    printVolume(150.0,null)
    printVolume(150.0,187.5)

    printCost(null)
    printCost(112.0)

    printPress("760.3")
    printPress(null)
}

fun printVolume(intensity: Double, koef: Double?){
    val defKoef: Double = 0.5
    val res = intensity * (koef?: defKoef)
    println(res)
}

fun printCost(price: Double?){
    val defStah: Double =  0.5
    val defPrice: Double = 50.0
    val res = defStah * (price?: defPrice)
    println(res)
}

fun printPress(press: String?){
    println( press ?: throw Exception("Показания отсутствуют"))
}
