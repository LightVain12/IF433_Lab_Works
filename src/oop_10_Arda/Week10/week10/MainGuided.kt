package oop_10_Arda.Week10.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = GenericBox(100)
    val strBox = GenericBox("Kotlin Generics")
    println("Isi IntBox: ${intBox.get()}")
    println("Isi StrBox: ${strBox.get()}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val pair = KeyValuePair(1, "Bitcoin")
    pair.display()

    println("\n=== TEST GENERIC FUNCTION ===")
    printList(listOf("BTC", "ETH", "SOL"))
    printList(listOf(10, 20, 30))

    println("\n=== TEST TYPE CONSTRAINTS ===")
    println("Hasil Sum (Int): ${sum(10, 20)}")
    println("Hasil Sum (Double): ${sum(15.5, 4.5)}")
    // sum("A", "B") // Error! Karena String bukan Number
}