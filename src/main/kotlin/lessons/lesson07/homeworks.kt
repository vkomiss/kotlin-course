package lessons.lesson07

fun main() {

    zad1()

    println("-------")

    zad2()

}

fun zad1() {

    // 1. Напишите цикл for, который выводит числа от 1 до 5.
    println("\n--01--")
    for (i01 in 1..5) {
        println(i01)
    }

    // 2. Напишите цикл for, который выводит четные числа от 1 до 10
    println("\n--02--")
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    // 3. Создайте цикл for, который выводит числа от 5 до 1.
    println("\n--03--")
    for (i in 5 downTo 1) {
        println(i)
    }

    // 4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    println("\n--04--")
    for (i in 10 downTo 1) {
        println(i - 2)
    }

    // 5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9
    println("\n--05--")
    for (i in 1..9 step 2) {
        println(i)
    }

    // 6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20
    println("\n--06--")
    var sch6: Int = 0
    for (i in 1..20) {
        if (++sch6 == 3) {
            sch6 = 0
            println(i)
        }
    }

    // 7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size
    println("\n--07--")
    var size = 25
    for (i7 in 3 until size step 2) {
        println(i7)
    }

    // 8. Создайте цикл while, который выводит квадраты чисел от 1 до 5.

    println("\n--08--")
    var i8 = 0
    while (i8++ < 5) {
        println(i8 * i8)
    }

    // 9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    println("\n--09--")
    var per9 = 10
    while (per9 > 5) {
        --per9
    }
    println(per9)

    // 10. Используйте цикл do while, чтобы вывести числа от 5 до 1.
    println("\n--10--")
    var per10: Int = 5
    while (per10 >= 1) {
        println(per10--)
    }


    // 11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    println("\n--11--")
    var per11 = 5
    do {
        println(per11)
    } while ((per11++ +1) < 10)

    // 12. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    println("\n--12--")
    for (i12 in 1..10) {
        if (i12 == 6) {
            println("$i12. Break")
            break
        }
        println(i12)
    }

    // 13. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    println("\n--13--")
    var per13 = 1
    while (true) {
        println(per13)
        if (per13++ == 10) {
            break
        }
    }

    // 14. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    println("\n--14--")
    for (i14 in 1..10) {
        if (i14 % 2 == 0) {
            continue
        }
        println(i14)
    }

    // 15. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    println("\n--15--")
    var per15 = 1
    while (per15 <= 10) {
        if (per15 % 3 == 0) {
            per15++
            continue
        }
        println(per15)
        per15++
    }

}

fun zad2() {

    // 1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.
    println()
    println("- 1 -")
    var um1 = 0
    for (si in 1..10) {
        for (sper1 in 1..10) {
            um1 = si * sper1
            print("$um1 ")
        }
        println()
    }

    // 2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
    println()
    println("- 2 -")
    var arg02 = 50
    var sum02 = 0
    for (si02 in 1..arg02) {
        sum02+=si02
    }
    println("Until: $arg02. Sum: $sum02")


    // 3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
    println()
    println("- 3 -")
    var arg03 = 8
    var sum03: Long = 1
    for (si03 in 1..arg03) {
        sum03 = sum03 * si03
        println(sum03)
    }
    println("Fac until: $arg03. Sum: $sum03")

    // 4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
    println()
    println("- 4 -")
    var sum04 = 0
    var arg04 = 25
    var si04 = 2
    while (si04 <= arg04) {
        if (si04 % 2 == 0) {
            sum04 += si04
        }
        si04++
        //si04 += 2 // Можно сразу все четные перебирать, раз условия задачи знаем
    }
    println("Arg: $arg04. Sum: $sum04")

    // 5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.

    println()
    println("- 5 -")
    var i13 = 1
    while (i13++ <= 3) {
        var i14 = 1
        while (i14++ <= 5) {
            print("* ")
        }
        println()
    }


    // 6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.

    println()
    println("- 6 -")
    var sum061 = 0
    var sum062 = 0
    var arg06 = 25
    var si06 = 2
    while (si06 <= arg06) {
        if (si06 % 2 == 0) {
            sum062 += si06
        } else {
            sum061 += si06
        }
        si06++
    }
    println("Arg: $arg06. Sum 1: $sum061, Sum 2: $sum062")


}
