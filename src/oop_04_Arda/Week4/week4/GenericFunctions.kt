package oop_10_Arda.Week10.week10

fun <T> printList(items: List<T>) {
    for (item in items) {
        print("[$item] ")
    }
    println()
}