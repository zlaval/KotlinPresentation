package functional

data class Num(val num: Int) {

    infix fun add(other: Num): Num {
        return Num(num + other.num)
    }
}


fun main(args: Array<String>) {
    val two = Num(2)
    val three = Num(3)

    val five = two add three

    val otherFive = two.add(three)

    println(five)
    println(otherFive)

}
