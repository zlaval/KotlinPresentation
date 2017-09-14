package operatorOveloadingExtensionFn

data class Point(val x: Int, val y: Int) {
    operator fun plus(p: Point): Point = Point(x + p.x, y + p.y)
    operator fun minus(p: Point): Point = Point(x - p.x, y - p.y)
}

fun Point.addNumToCoordinates(num: Int): Point = Point(x + num, y + num)

fun main(args: Array<String>) {
    val a = Point(3, 5)
    val b = Point(12, 7)
    val sum = a + b
    println(sum)

    val pointPlusTwo = a.addNumToCoordinates(2)
    println(pointPlusTwo)
}

