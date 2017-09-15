package `object`

object Car {
    fun brand() = "Trabant"
}

fun main(args: Array<String>) {
    println(Car.brand())

    val outer = Outer.instance()
    val outerWithCompanion = CompanionWithInterface.instance()
}


class Outer {
    companion object Factory {
        fun instance(): Outer = Outer()
    }

}

interface Factory<T> {
    fun instance(): T
}

class CompanionWithInterface {

    companion object : Factory<CompanionWithInterface> {
        override fun instance(): CompanionWithInterface = CompanionWithInterface()
    }

}

