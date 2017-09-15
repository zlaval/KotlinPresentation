package base

class Person(val name: String, val age: Int, val weight: Int)


fun main(args: Array<String>) {

    val joe = Person("Joe Doe", 33, 80)

    with(joe) {
        println(name)
        println(age)
        println(weight)
        println("My name is $name and I'm $age years old. My weight is $weight kg.")
    }

    val name = with(joe) { name }
    println(name)

}
