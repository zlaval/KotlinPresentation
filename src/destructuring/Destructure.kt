package destructuring


data class Person(val name: String, val age: Int, val address: String)


fun main(args: Array<String>) {
    val person = Person("Joe", 30, "Noszlop")
    val (name, age) = person
    println("The person name is $name, and he/she is $age years old.")
}
