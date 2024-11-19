fun printLength(str: String?) {
    str?.let {
        println("Length of the string: ${it.length}")
    } ?: println("The string is null.")
}

data class Person(
    val name: String,
    val age: Int?
)

fun printAge(person: Person) {
    person.age?.let {
        println("Age: $it")
    } ?: println("Age is not provided.")
}

fun main() {

    val str1: String? = "Hello, Kotlin!"
    val str2: String? = null
    printLength(str1)
    printLength(str2)

    val person1 = Person("Alice", 25)
    val person2 = Person("Bob", null)
    printAge(person1)
    printAge(person2)

    val nullablePerson: Person? = null
    println("Name: ${nullablePerson?.name ?: "Unknown"}")
}
