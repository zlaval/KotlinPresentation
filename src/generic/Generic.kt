package generic

data class Bag<T : Number>(var value: T)

fun main(args: Array<String>) {
    val intBag = Bag(1)
    val doubleBag = Bag(3.2)
}
