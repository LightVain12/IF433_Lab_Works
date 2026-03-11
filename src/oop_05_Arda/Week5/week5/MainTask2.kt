package oop_05_Arda.Week5.week5

fun main() {
    val eWallet = EWallet(accountName = "Arda EWallet", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Arda Credit Card", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("=== PROSES TRANSAKSI ===")

    for (payment in daftarPembayaran) {
        // Pemanggilan pertama
        payment.processPayment(75000.0)

        // --- TAMBAHAN UNTUK CHECKPOINT 11 ---
        // Jika metode pembayaran adalah EWallet, lakukan Top Up dan coba lagi
        if (payment is EWallet) {
            println("--> Mendeteksi tipe EWallet. Melakukan Top Up Otomatis...")
            payment.topUp(50000.0) // Smart Cast: fungsi topUp() langsung bisa dipanggil

            println("--> Mencoba transaksi kembali...")
            payment.processPayment(75000.0) // Coba transaksi lagi [cite: 364, 365]
        }
        println("----------------------------------------")
    }
}