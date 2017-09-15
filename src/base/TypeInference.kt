package base


fun main(args: Array<String>) {
    val int = 4
    println(sqr(int))

    val list = listOf("abc", "defgh")
    list.forEach { str ->
        println("$str length is ${str.length} characters")
    }
}

fun sqr(num: Int): Int {
    return num * num
}

