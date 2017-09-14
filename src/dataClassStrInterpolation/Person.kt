package dataClassStrInterpolation

data class Person(val idNumber: String, val name: String, val age: Int, val adult: Boolean = true)


fun main(args: Array<String>) {

    val joe = Person("549843KL", "Joe Doe", 38)
    val anotherJoe = Person("549843KL", "Joe Doe", 38)
    val joeJr = Person("435124ME", "Joe Doe Jr", 10, false)
    val john = Person(name = "John", idNumber = "981235GT", age = 54)

    println(john)
    println(joe)
    println("The person ${joe} and the person ${anotherJoe} is equals: ${joe.equals(anotherJoe)}")
    println("The person ${joe} and the person ${joeJr} is equals: ${joe.equals(joeJr)}")
}

