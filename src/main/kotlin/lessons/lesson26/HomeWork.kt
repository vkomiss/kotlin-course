package lessons.lesson26

import java.io.File

// 1 Создайте текстовый файл workspace/task1/example.txt.
//Запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.
//Реши задачу с использованием scope функции без создания переменной.

fun task1() {
    File("workspace/task1/example.txt").apply {
        parentFile.mkdirs()
        writeText("Hello, Kotlin!")
    }.also {
        println(it.exists())
    }
}

// 2 Создайте директорию workspace/task2/testDir.
//Проверьте, является ли она директорией, и выведите её абсолютный путь.

fun task2() {
    val dir = File("workspace/task2/testDir")
    dir.mkdirs()
    println(dir.isDirectory)
    println(dir.absolutePath)
}

// 3 Создайте директорию workspace/task3/structure.
//Внутри директории structure создайте папку myDir с двумя вложенными
//поддиректориями subDir1 и subDir2.
//Проверьте, что myDir действительно содержит эти поддиректории.
//Используй scope функции и метод resolve.

fun task3() {
    File("workspace/task3/structure").apply {
        mkdirs()
        resolve("myDir").apply {
            mkdirs()
            resolve("subDir1").mkdirs()
            resolve("subDir2").mkdirs()
        }.also {
            val names = it.list()?.toList() ?: emptyList()
            println("subDir1" in names)
            println("subDir2" in names)
        }
    }
}

// 4 Создайте директорию workspace/task4/temp.
//Внутри директории temp создайте несколько вложенных файлов и директорий.
//Удалите директорию workspace/task4 со всем содержимым.

fun task4() {
    val root = File("workspace/task4/temp")
    root.resolve("a.txt").apply {
        parentFile.mkdirs()
        writeText("data")
    }
    root.resolve("dir1/dir2").mkdirs()
    File("workspace/task4").deleteRecursively()
}

// 5 Создайте файл workspace/task5/config/config.txt.
//Запишите в него список параметров (в формате ключ=значение),
//а затем прочитайте файл и выведите только значения.

fun task5() {
    val file = File("workspace/task5/config/config.txt")
    file.parentFile.mkdirs()
    file.writeText(
        """
        host=localhost
        port=8080
        mode=dev
        """.trimIndent()
    )
    file.readLines()
        .map { it.substringAfter("=") }
        .forEach { println(it) }
}

// 6 Пройди по всем вложенным директориям workspace
//и выведи в консоль сначала пути директорий,
//а потом пути файлов.

fun task6() {
    val root = File("workspace")
    root.walk().filter { it.isDirectory }.forEach { println(it.path) }
    root.walk().filter { it.isFile }.forEach { println(it.path) }
}

// 7 Создайте директорию workspace/task7/docs.
//Проверь, есть ли файл с именем readme.md.
//Если файла нет, создайте его и запишите текст
//"This is a README file.".
//Проверьте текст в файле.

fun task7() {
    val dir = File("workspace/task7/docs")
    dir.mkdirs()
    val file = dir.resolve("readme.md")
    if (!file.exists()) {
        file.writeText("This is a README file.")
    }
    println(file.readText())
}

// 8 Создайте файлы
//workspace/task8/data/1/4/prod/data14.mysql
//workspace/task8/data/2/3/prod/data23.mysql
//workspace/task8/data/5/2/prod/data52.mysql
//
//Создайте директорию workspace/task8/backup и скопируйте туда файлы из workspace/task8/data,
//сохраняя структуру директорий.
//
//Для копирования используй метод copyTo.
//Для получения относительного пути начиная от data используй relativeTo,
//передавая в него путь до базовой директории (data).
//Полученный относительный путь присоедини к пути backup через resolve.

fun task8() {
    val dataRoot = File("workspace/task8/data")
    val backupRoot = File("workspace/task8/backup")

    listOf(
        dataRoot.resolve("1/4/prod/data14.mysql"),
        dataRoot.resolve("2/3/prod/data23.mysql"),
        dataRoot.resolve("5/2/prod/data52.mysql")
    ).forEach {
        it.parentFile.mkdirs()
        it.writeText("test")
    }

    backupRoot.mkdirs()

    dataRoot.walk()
        .filter { it.isFile }
        .forEach { file ->
            val relative = file.relativeTo(dataRoot)
            val target = backupRoot.resolve(relative)
            target.parentFile.mkdirs()
            file.copyTo(target, overwrite = true)
        }
}


fun main() {
    task1()
    task2()
    task3()
    task4()
    task5()
    task6()
    task7()
    task8()
}
