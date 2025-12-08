package lessons.lesson25

/*
Задание 1. Функция высшего порядка.

Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента
и измеряет время её выполнения. Функция timeTracker должна возвращать затраченное
время в миллисекундах. Для измерения времени используйте System.currentTimeMillis()
до и после выполнения переданной функции.

Для проверки результата можно выполнить в ней такой ресурсоёмкий код:

val myFunction = {
   val list = List(10000000) { (0..10000).random() }
   list.sorted()
}

Задания для работы со scope функциями.

Классы Person и Employee, которые будут использоваться для демонстрации работы
scope-функций с преобразованием объектов и инициализацией или обновлением полей.

*/

fun timeTracker(function: () -> Unit): Long {
    val start = System.currentTimeMillis()
    function()
    val end = System.currentTimeMillis()
    return end - start
}

val myFunction = {
    val list = List(10_000_000) { (0..10000).random() }
    list.sorted()
}

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}



/*
Задание 2: Использование apply для инициализации объекта Employee

Создайте объект Employee и используйте apply для инициализации его полей
email и department.
*/

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}


/*
=========================
КЛАССЫ ДЛЯ ВСЕХ ЗАДАНИЙ
=========================
*/

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

/*
ФУНКЦИЯ ДЛЯ ЗАДАНИЯ 3:
Принимает Person и выводит его данные красиво.
Использовать with.
*/
fun printPersonInfo(p: Person) {
    with(p) {
        println("Person info: $name | $age | $email")
    }
}


fun main() {

    // 1
    val time = timeTracker(myFunction)
    println("Время выполнения: $time мс")

    // 2
    val emp = Employee("John", 30, "Manager").apply {
        email = "john@mail.com"
        department = "Sales"
    }

    println("${emp.name} | ${emp.age} | ${emp.position} | ${emp.email} | ${emp.department}")

    // 3

    println("=== ЗАДАНИЕ 3 ===")
    val p3 = Person("Alex", 25).also {
        it.email = "alex@mail.com"
    }.also {
        printPersonInfo(it)
    }

    // 4

    println("\n=== ЗАДАНИЕ 4 ===")
    val p4 = Person("Mike", 28)
    val emp4 = with(p4) {
        Employee(name, age, "Developer").also {
            it.email = "mike@mail.com"
            it.department = "IT"
        }
    }
    println("Employee 4: ${emp4.name} | ${emp4.age} | ${emp4.position} | ${emp4.email} | ${emp4.department}")

    // 5

    println("\n=== ЗАДАНИЕ 5 ===")
    val p5 = Person("Linda", 31)
    val emp5 = p5.run {
        Employee(name, age, "Designer").also {
            it.email = "linda@mail.com"
            it.department = "Art"
        }
    }
    println("Employee 5: ${emp5.name} | ${emp5.age} | ${emp5.position} | ${emp5.email} | ${emp5.department}")

}
