package oop_05_Arda.Week5.week5

fun main() {
    // 1. Buat objek EWallet dan CreditCard
    val eWallet = EWallet(accountName = "Arda EWallet", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Arda CreditCard", limit = 100000.0)

    // 2. Masukkan ke dalam list bertipe Parent (PaymentMethod)
    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("=== PROSES TRANSAKSI AWAL ===")
    // 3. Lakukan perulangan
    for (payment in daftarPembayaran) {
        payment.processPayment(75000.0)
    }
}