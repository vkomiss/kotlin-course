package com.kva.com.kva.kotlincourse.lesson7

fun main() {

    for (i in 1..5) {
        println(i.toString())
    }

    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i.toString())
        }
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i - 2)
    }

    for (i in 1..9 step 2) {
        println(i)
    }

    for (i in 1..20 step 3) {
        println(i)
    }

    for (i in 1 until 9) {
        println(i)
    }

    for (i in 3 until 15) {
        println(i)
    }

    var i1 = 5
    while (i1 > 0) {
        println(i1--)
    }

    var i2 = 5
    while (i2 <= 10) {
        println(i2++)
    }

    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }

    var i3 = 1
    while (true) {
        println(i3)
        if (i3++ == 10) {
            break
        }
    }

    for (i in 1..10) {
        for (j in 1..10) {
            print(j * i)
            print(" ")
        }
        println()
    }

    var i4 = 1
    while (i4 <= 10) {
        println(i4++)
    }

    var i5 = 2
    while (i5 < 20) {
        if (i5++ % 2 == 1) {
            println(i5)
        }
    }

    var i6 = 1
    var sum6 = 0
    while (i6 <= 50) {
        sum6 += i6++
    }
    println(sum6)

    var i7 = 10
    while (i7 >= 1) {
        println(i7--)
    }

    var i8 = 1
    var sum8 = 1
    while (i8 <= 5) {
        sum8 *= i8++
    }
    println(sum8)

    var i9 = 2
    var sum9 = 0
    while (i9 <= 100) {
        if (i9 % 2 == 0) {
            sum9 += i9++
        } else {i9++}
    }
    println(sum9)

    for (i in 1..10) {
        println("$i умножить на 3 равно ${i * 3}")
    }

    var str1 = "Kotlin."
    for (i in str1) {
        if (i == '.') {
            break
        }
        print(i)
    }
    println()

    var mas = listOf(5,12,7,22,9)
    var max = 0
    for (num in mas) {
        if (num > max) {
            max = num
        }
    }
    println(max)

    var gen = 0
    do {
        gen = (1..15).random()
        println(gen)
    } while (gen < 15)

    println("Ищем простые числа:") // у которых нет делителя, исключая 1 и само себя
    var i10 = 1
    while (i10 <= 20) {
        if (i10 == 1) {
            println("Простое число: $i10") // 1 - простое число
            i10++
            continue
        }
        var isBreak = false
        for (i in 2 until (i10 / 2).toInt()) { // здесь цикл до целого от половины значения i10
            if (i10 % i == 0) {
                isBreak = true
                break
            }
        }
        if (!isBreak) {
            println("Простое число: $i10")
        } else {
            isBreak = false
        }
        i10++
    }

    var mas11 = arrayOf(0,1,2,3,4,5,6,7,8,9)
    var i11 = mas11.count()
    while (i11-- > 0) {
        print(mas11[i11])
        print(" ")
    }
    println()

    var i12 = 1
    var sch12 = 0
    while (i12++ < 100) {
        sch12++
    }
    println(sch12)

    var i13 = 1
    while (i13++ <= 5) {
        var i14 = 1
        while (i14++ <= 3) {
            print("* ")
        }
        println()
    }

    var i15 = 1
    println("Обнаружено число Фибоначчи: 1")
    var pred15 = 1
    var predpred15 = 0
    while (i15 <= 50) {
        var sum15 = predpred15 + pred15
        if (i15 == sum15) {
            println("Обнаружено число Фибоначчи: $i15")
            predpred15 = pred15
            pred15 = i15++
        } else {
            i15++
        }
    }

    var i16 = 0
    var sum16 = 0
    while (i16 <= 30) {
        if ((i16++ + 1) % 5 == 0) {
            sum16 += 1
        }
    }
    println(sum16)

    var mas17 = listOf(4,8,15,16,23,42)
    var i17 = 1
    var sum17 = 0
    while (i17 < mas17.count()) {
        sum17 += mas17[i17++ - 1]
    }
    println(sum17/mas17.count())

    var i18 = 1
    do {
        var j18 = 1
        do {
            println("$i18 * $j18 = ${i18 * j18}")
        } while (j18++ <5)
    } while (i18++ <5)

    var i19 = 10
    var sum19 = 0
    while (i19 <= 30) {
        sum19 += i19++
    }
    println(sum19)

    var i20 = 10
    var sum20_1 = 0
    var sum20_2 = 0
    while (i20 <= 20) {
        if (i20 % 2 == 0) {
            sum20_2 += i20++
        } else {
            sum20_1 += i20++
        }
    }
    println(sum20_1)
    println(sum20_2)

}
