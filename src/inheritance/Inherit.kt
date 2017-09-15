package inheritance


open class Vehicle(val type: String) {

    open fun wheelNumber(): Int {
        return 4
    }
}

class Bus(producer: String, type: String) : Vehicle(type) {
    override fun wheelNumber(): Int {
        return 6
    }
}

abstract class Animal {
    abstract fun getSize(): String
}

class Lion(name: String) : Animal() {
    override fun getSize(): String {
        return "Middle"
    }
}

interface Human {
    fun name(): String
    fun legNumber(): Int {
        return 2
    }
}

class Woman : Human {
    override fun name(): String {
        return "Laura"
    }
}

fun main(args: Array<String>) {
    val woman = Woman()
    println("Name is ${woman.name()}, she has ${woman.legNumber()} legs")

}
