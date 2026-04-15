package oop_08_Arda.Week8.week8

fun main() {
    // --- CHECKPOINT 4 ---
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
    // --- CHECKPOINT 5 ---
    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)
    // --- CHECKPOINT 6 ---
    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone", 1500000, UserProfile("Andi", null), "Laptop", 4500000.0
    )
    // --- CHECKPOINT 7 ---
    for (item in mixedData) {
        val text = item as? String // Hanya mengambil yang bertipe String
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    // --- CHECKPOINT 8 ---
    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast fallback: $safeString")

}