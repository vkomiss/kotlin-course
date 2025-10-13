package lessons.lesson11

fun main() {

    // 1 Не принимает аргументов и не возвращает значения.
    fun f1() { }


    // 2 Принимает два целых числа и возвращает их сумму.
    fun f2(a2: Int, b2: Int): Int = a2 + b2


    // 3 Принимает строку и ничего не возвращает.
    fun f3(s3: String) { }


    // 4 Принимает список целых чисел и возвращает среднее значение типа Double.
    fun f4(l4: List<Int>): Double = l4.average()


    // 5 Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
    private fun f5(s5: String?): Int? = s5?.length


    // 6 Не принимает аргументов и возвращает nullable вещественное число.
    fun f6(): Double? = null


    // 7 Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
    private fun f7(l7: List<Int>?) { }


    // 8 Принимает целое число и возвращает nullable строку.
    fun f8(n8: Int): String? {
        return n8.toString()
    }


    // 9 Не принимает аргументов и возвращает список nullable строк.
    fun f9(): List<String?> {
        return listOf("odin", null, "dva")
    }


    // 10 Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
    fun f10(s10: String?, n10: Int?): Boolean? {
        return if (s10 != null && n10 != null) {
            true
        } else {
            null}
    }


    // 11 Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его,
    // умноженное на 2.
    fun multiplyByTwo(n11: Int): Int = n11 * 2


    // 12 Создайте функцию isEven, которая принимает целое число и возвращает true,
    // если число чётное, и false в противном случае.
    fun isEven(n12: Int): Boolean = n12 % 2 == 0


    // 13 Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
    // Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
    fun printNumbersUntil(n13: Int) {
        if (n13 < 1) return
        for (i13 in 1..n13) println(i13)
    }


    // 14 Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
    // Если отрицательных чисел нет, функция должна вернуть null.
    fun findFirstNegative(l14: List<Int>): Int? {
        for (n14 in l14) if (n14 < 0) return n14
        return null
    }


    // 15 Напишите функцию processList, которая принимает список строк.
    // Функция должна проходить по списку и выводить каждую строку.
    // Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
    fun processList(l15: List<String?>) {
        for (s15 in l15) {
            if (s15 == null) return
            println(s15)
        }
    }


}