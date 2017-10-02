package sealedClass

sealed class Shape

class Rectangle : Shape()
class Circle : Shape()

fun main(args: Array<String>) {
    printShapeName(Circle())
}

fun printShapeName(shape: Shape): Unit {
    when (shape) {
        is Rectangle -> print("Rectangle")
        is Circle -> print("Circle")
    //no need default cause
    }
}
