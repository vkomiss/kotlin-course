package lessons.lesson08

fun main() {

    val str1 = "String 1"
    val per = 30
    println(str1 + ": $per")

    class person(val name: String, val age: Int)
    val pers = person("Ivanov", 34)
    println("My name ${pers.name} my age ${pers.age}")

    println("It's string: ${retstring()}")

    // подстрока
    val perstr = " abcd efgh ijkl "
    val sbstr1 = perstr.substring(7)
    val sbstr2 = perstr.substring(3, 6)

    val reprep = perstr.replace("н", "ш")

    val words = perstr.split(" ")
    println(words)

    println(perstr.uppercase())
    println(perstr.lowercase())

    println(perstr.trim())

    println(perstr.startsWith(" ab"))
    println(perstr.endsWith("L ", true))

    val perst3 = "Hello".contains("l")
    println(perst3)

    val empty = "".isNotEmpty()

    val empty2: String? = "   "
    val isn = empty2.isNullOrEmpty()  // false
    val isn2 = empty2.isNullOrBlank() // true

    val repeat = "ab".repeat(3) // ababab
    println(repeat)

    val letter = perstr[3]
    println(letter)

    println(perstr.get(3)) // не принято использовать, лучше []

    println(perstr.indexOf("c"))

    println("niltok".reversed()) // переворачивать строку

    val perst4 = """
         str1
      str2   
       str3
   """.trimIndent() // отрезает минимальное число пробелов слева
    println(perst4)

    val n1 = "Owshen"
    val f1 = "Ivanov"
    val a1 = 34
    val ad1 = "Street Lenin"
    val rat1 = 45.34
    val bal1 = 256420.54687
    val frnd1 = 11
    val txt1 = """
        Name: %s
        Name2: %s
        Age: %d
        Friends: %,d
        Rating: %.1f
        Balance: %,.2f
    """.trimIndent()

    println(txt1)
    println(txt1.format(n1,f1,a1, frnd1, rat1, bal1))
            

}

fun retstring(): String{
    return "My string"
}