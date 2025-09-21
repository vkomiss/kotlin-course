package lessons.lesson06

fun main() {

    val number = 10
    if (number > 5) {
        println(true)
    } else {
        println(false)
    }
//    val x = 10
//    val intRange: 1 <= .. <= x
//    val downTo = 10 >= downTo >= 1
//
//    val score = 4
//    when {
//        score in 90 <=..<= 100 -> println("Отлично")
//        else -> println("Не очень")
//    }


    example1(8)

    example2(15, true)
    example2(15, false)

}

fun example1(arg: Int) {

    when (arg) {
        in 0..4 -> println("Nigth")
        in 5..11 -> println("Morning")
        in 12..17 -> println("Day")
        in 18..23 -> println("Evening")
        else -> println("Error")
    }

}

fun example2(arg1: Int, arg2: Boolean) {

    println("temp $arg1 whether $arg2")
    if (arg1 < 10 || arg1 > 30) {
        println("take a car")
    } else if (arg2) {
        println("take a bus")
    } else if (arg1 > 15) {
        println("take a walk")
    } else {
        println("take a byke")
    }

}