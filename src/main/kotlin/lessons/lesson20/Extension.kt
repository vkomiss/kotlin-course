package lessons.lesson20

fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}
val result = removeSpaces("String with spaces")

fun String.removeSpaces(): String {
    return this.replace(" ", "")
}
val result = "Hello, World!".removeSpaces() // "Hello,World!"

/////////////////

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}
val list: List<Int?> = listOf(null, “”)
val isEmpty = list.isNullOrEmpty() // true