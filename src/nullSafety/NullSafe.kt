package nullSafety


fun main(args: Array<String>) {
    var name = "Zalerix"
    //name = null  //compile error
    var address: String? = null

    println(length(address))

    listWithNull(listOf("a", null, "b", null, "c"))
}


fun length(str: String?): Int {
    //return str.length //compile error

    //return str!!.length //maybe nullpointer exception
    return str?.length ?: 0  //OK with safe call operator
}

//chain
fun liveIn(person: Person?): String {
    return person?.address?.city ?: ""
}

class Address(val city: String)
class Person(val name: String, val address: Address?)

//use element only if not null
fun listWithNull(list: List<String?>) {
    for (element in list)
        element.let(::print)

    //val assignListWithNullableToListWithoutNullable: List<String> = list //compile error

    val listWithoutNull: List<String> = list.filterNotNull()
    println(listWithoutNull)
}

