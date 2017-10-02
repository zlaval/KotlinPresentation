package safeCast


fun main(args: Array<String>) {

}


fun safeCast(obj: Any) {
    if (obj is String) //after check no need to cast
        obj.length
}

