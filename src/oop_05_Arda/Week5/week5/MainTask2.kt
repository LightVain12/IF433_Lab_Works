package oop_05_Arda.Week5.week5

fun main() {
    val eWallet = EWallet(accountName = "Arda EWallet", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Arda Credit Card", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)
    val transactionAmount = 75000.0

    println("=== PROSES TRANSAKSI ===")
    for (payment in daftarPembayaran) {
        // Coba proses pembayaran
        payment.processPayment(transactionAmount)

        // Smart Casting Challenge (Checkpoint 11)
        if (payment is EWallet) {
            // Karena EWallet saldo awalnya 50000, transaksi 75000 pasti gagal.
            // Kita deteksi menggunakan `is` lalu jalankan topUp untuk menutupi kekurangannya.
            println("--> Mendeteksi EWallet gagal. Melakukan Top Up Otomatis...")
            payment.topUp(50000.0)

            // Coba transaksi lagi setelah top up
            println("--> Mencoba transaksi kembali...")
            payment.processPayment(transactionAmount)
        }
        println()
    }
}