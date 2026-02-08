package oop_01_Arda.week1.week1

fun main() {
    val gameTitle = "GTA VI"
    val price = 750_000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 20) / 100 else (price * 10) / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul      : $title")
    println("Harga Akhir: Rp $finalPrice")
}
