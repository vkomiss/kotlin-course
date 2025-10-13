package lessons.lesson10

fun main() {


// 1 Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val m1 = mapOf<Int, Int>()


// 2 Создайте словарь, инициализированный несколькими парами "ключ-значение",
// где ключи - float, а значения - double
    val m2 = mapOf(1.1f to 2.2, 3.3f to 4.4, 5.5f to 6.6)


// 3 Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val m3 = mutableMapOf<Int, String>()


// 4 Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    val m4 = mutableMapOf<Int, String>()
    m4[1] = "odin"
    m4[2] = "dva"
    m4[3] = "tri"


// 5 Используя словарь из предыдущего задания, извлеките значение, используя ключ.
// Попробуй получить значение с ключом, которого в словаре нет.
    val v5a = m4[2]
    val v5b = m4[9]


// 6 Удалите определенный элемент из изменяемого словаря по его ключу.
    m4.remove(2)


// 7 Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа
// на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val m7 = mapOf(2.0 to 1, 4.0 to 2, 6.0 to 0)
    for ((k7, v7) in m7) {
        if (v7 == 0) println("beskonechnost")
        else println(k7 / v7)
    }


// 8 Измените значение для существующего ключа в изменяемом словаре.
    m3[1] = "odin_izmenen"


// 9 Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val m9a = mapOf(1 to "a", 2 to "b")
    val m9b = mapOf(3 to "c", 4 to "d")
    val m9c = mutableMapOf<Int, String>()
    for ((k9a, v9a) in m9a) m9c[k9a] = v9a
    for ((k9b, v9b) in m9b) m9c[k9b] = v9b


// 10 Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
// Добавьте несколько элементов в этот словарь.
    val m10 = mutableMapOf<String, List<Int>>(
        "odin" to listOf(1, 2, 3),
        "dva" to listOf(4, 5, 6)
    )


// 11 Создай словарь, в котором ключи - это целые числа, а значения - изменяемые
// множества строк. Добавь данные в словарь. Получи значение по ключу (это должно
// быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val m11 = mutableMapOf<Int, MutableSet<String>>(
        1 to mutableSetOf("odin", "raz"),
        2 to mutableSetOf("dva", "dvoe")
    )
    val s11 = m11[1]
    s11?.add("plus")
    println(s11)


// 12 Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого
// пара будет содержать цифру 5 в качестве первого или второго значения.
    val m12 = mapOf(
        Pair(1, 2) to "a",
        Pair(5, 3) to "b",
        Pair(4, 5) to "c"
    )
    for ((k12, v12) in m12) {
        if (k12.first == 5 || k12.second == 5) println(v12)
    }


// 101 Словарь библиотека: Ключи - автор книги, значения - список книг
    val m101 = mapOf(
        "Pushkin" to listOf("Evgeniy Onegin", "Kapitan skazka"),
        "Tolstoy" to listOf("Vojna i mir", "Anna Karenina")
    )


// 102 Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val m102 = mapOf(
        "Cvety" to listOf("Roza", "Tyulpan"),
        "Derevya" to listOf("Dub", "Bereza")
    )


// 103 Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val m103 = mapOf(
        "Orly" to listOf("Ivan", "Oleg", "Petr"),
        "Medvedi" to listOf("Maks", "Nikita", "Sergey")
    )


// 104 Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val m104 = mapOf(
        "2025-10-10" to listOf("TabletkaA", "SiroopB"),
        "2025-10-11" to listOf("KapliC")
    )


// 105 Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val m105 = mapOf(
        "Russia" to mapOf(
            "Nsk" to listOf("Skver", "Fontan"),
            "Omsk" to listOf("Univerciti", "Aeroport")
        ),
        "Francia" to mapOf(
            "Paris" to listOf("Eiffel", "Louvre"),
            "Nica" to listOf("Promenade", "Staryj gorod")
        )
    )




}