package functional

fun main(args: Array<String>) {
    test()
}

fun test() {
    printStr {
        "hello"
    }
}

inline fun printStr(f: () -> String) = print(f())


//public static final void test() {
//    int printStr = "hello";
//    System.out.print(printStr);
//}
