package oop_10_Arda.Week10.week10

fun <T> printList(items: List<T>) {
    for (item in items) {
        print("[$item] ")
    }
    println()
    fun <T : Number> sum(a: T, b: T): Double {
        return a.toDouble() + b.toDouble()
}