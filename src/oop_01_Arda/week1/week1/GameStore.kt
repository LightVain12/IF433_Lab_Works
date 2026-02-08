package oop_01_Arda.week1.week1

fun main() {
    val gameTitle = "GTA VI"
    val price = 750_000

    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        userNote = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 20) / 100 else (price * 10) / 100

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, userNote: String?) {
    println("Judul      : $title")
    println("Harga Asli : Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${userNote ?: "Tidak ada catatan"}")
}
