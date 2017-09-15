package functional


val add: (Int, Int) -> Int = { a, b -> a + b }
val mul: (Int, Int) -> Int = { a, b -> a * b }

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int) = println(operation(a, b))

fun addFun(a: Int, b: Int): Int = a + b

fun operate2(num: Int, op: (Int) -> Int): Int = op(num)

fun main(args: Array<String>) {
    operate(2, 3, add)
    operate(2, 3, mul)
    operate(5, 3, { a, b -> a - b })
    operate(6, 7, ::addFun)

    val double = operate2(2) {
        it * 2
    }
    println(double)

    val list = listOf("a", "bb", "ccc", "dddd")
    val filteredList = list
            .filter { str -> str.length < 4 }
            .map { it + it }
            .toList()
    println(filteredList)

    val map = mapOf(1 to "a", 2 to "b")
    map.forEach { _, value -> print(value) }

}

