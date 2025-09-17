package lessons.lesson05

fun main() {

    val rem1 = 10 % 6 // 4
    // операторы: + - * /
    val isEq = ("A" == "c") // сравнение на равенство
    // != не равно
    // операторы: > < >= <=
    // && и
    // || или
    // ! не
    // = присваивание
    // += увеличение на 1
    // -= /= *= %=

    // инкримент: с++ или ++с
    // декримент: с-- или --с

    println("C: $rem1")

    // приоритеты: скобки(), * - и затем + -
    // приоритеты !, затем &&, затем ||

    // оператор елвиса
    // ?: проверка на null
    val name: String? = null
    val result = name ?: "Это null"
    println(result)

    val user_vol: Int? = null
    val def_vol = 30
    println(user_vol ?: def_vol)



}