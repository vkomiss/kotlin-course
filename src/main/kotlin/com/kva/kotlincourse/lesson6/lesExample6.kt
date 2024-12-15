package com.kva.com.kva.kotlincourse.lesson6

fun main() {
    println( checkPass("123456789") )
    println( getMark(77))
}

fun checkPass(pass: String): Boolean {
    val num = 0..9
    val length = pass.length

    if (length <= 8) { return false}
    if (checkSmb(pass)) {return false}

    return true
}

fun checkSmb(pass: String): Boolean {
    return false
}

fun getMark(mark: Int): String {

    return when(mark) {
        in 0..20 -> "e"
        in 21..40 -> "d"
        in 41..60 -> "c"
        in 61..80 -> "b"
        in 81..100 -> "a"
        else -> "invalid"
    }
}