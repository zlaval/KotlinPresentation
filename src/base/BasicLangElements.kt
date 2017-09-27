package base

import java.util.*


fun main(args: Array<String>) {
    val multiLineStr = """In Kotlin
        |we can use
        |multiline strings
    """.trimMargin()
    println(multiLineStr)


    val number: Int = 4
    val num = 4
//num=5
    var integer = 5
    integer = 6

    for (i in 0..10)
        println(i)


    println(whenExpression(3))
    println(whenExpression("a"))
    println(whenExpression(1123))

    val a = Random().nextInt(20) - 10

    val positive = a > 0//if (a > 0) true else false

}

fun whenExpression(obj: Any): String =
        when (obj) {
            in 1..5 -> "One"
            "a" -> "A"
            else -> "what is this?"
        }


fun publicFun() {

}

private fun privateFun() {

}

internal fun internalFun() {
    //visible in same module
}

fun ifExpression(a: Int, b: Int): Int = if (a < b) a else b

abstract class A {
    protected fun sayHello() = print("hello")
}

class B private constructor(str: String) : A() {
    companion object Factory {
        fun instance() = B("hello")
    }

    fun say() = sayHello()
}