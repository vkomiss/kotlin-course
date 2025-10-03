package lessons.lesson08


fun main() {

    var per: String
    var fnd: String
    var res: String
    var mas: List<String>

//    Если фраза содержит слово "невозможно":
//    Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".

    per = "It's impossible to walk"
    fnd = "impossible"
    if (per.contains(fnd)) {
        per = per.replace(fnd, "it's definitely possible, it just takes time.")
    }
    println(per)

//    Если фраза начинается с "Я не уверен":
//    Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".

    per = "I'm not sure about you"
    fnd = "I'm not sure"
    if (per.startsWith(fnd)) {
        per+= ", but my intuition says otherwise"
    }
    println(per)

//    Если фраза содержит слово "катастрофа":
//    Преобразование: Замените "катастрофа" на "интересное событие".

    per = "It's catastrophe for me"
    fnd = "catastrophe"
    if (per.contains(fnd)) {
        per = per.replace(fnd, "interesting event")
    }
    println(per)


//    Если фраза заканчивается на "без проблем":
//    Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".

    per = "I'll do my homework without any problems"
    fnd = "without any problems"
    if (per.endsWith(fnd)) {
        per = per.replace(fnd, "with a couple of interesting challenges along the way")
    }
    println(per)


//    Если фраза содержит только одно слово:
//    Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

    per = " Rain "
    mas = per.split(" ")
    if (mas.size == 1) {
        per = "Sometimes " + per.lowercase().trim() + ", but not always"
    }


    // Извлечение даты из строки лога
    per = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    mas = per.split(" ")
    var kol = mas.size
    println(mas[kol-2])
    println(mas[kol-1])

    // Маскирование личных данных
    per = "4539 1488 0343 6467"
    var res = ""
    kol = per.length
    if (kol > 4) {
        res = "*".repeat(kol-4)
        res += per.substring(kol-1, 4)
        per = res
    }
    println(per)

    // Форматирование адреса электронной почты
    per = "username@example.com"
    per = per.replace("@", "[at]")
    per = per.replace(".", "[dot]")
    println(per)

    // Извлечение имени файла из пути
    per = "D:/Dropbox/KMV-KVA/report.txt"
    mas = per.split("/")
    println(mas[kol])

    // Создание аббревиатуры из фразы
    per = "Kotlin is the best programming language"
    mas = per.split(" ")
    res = ""
    for (ch in 1..mas.size) {
        res += mas[ch-1][0].uppercase()
    }
    println(res)


    // Все слова с большой буквы
    per = "Kotlin is the best programming language"
    var mas = per.split(" ")
    res = ""
    for (ch in 1..mas.size) {
        res += mas[ch-1][0].uppercase() + mas[ch-1].substring(1) + " "
    }
    println(res)


    // Таблица умножения
    val row = 10
    val col = 11
    var width = 0
    var pref = 0
    if (col > 0) {
        width = (row * col).toString().length
    }
    print(" ".repeat(width))
    for (ch in 1..col) {
        pref = width - ch.toString().length+1
        if (pref > 0) {
            print(" ".repeat(pref))
        }
        print(ch)
    }
    println()

    for (chr in 1..row) {
        pref = width - chr.toString().length
        if (pref > 0) {
            print(" ".repeat(pref))
        }
        print(chr)

        for (ch in 1..col) {
            val resstr = chr * ch
            pref = width - resstr.toString().length+1
            if (pref > 0) {
                print(" ".repeat(pref))
            }
            print(resstr)
        }
        println()

    }

}