package oop_05_Arda.Week5.week5

fun main() {
    val eWallet = EWallet(accountName = "Arda EWallet", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Arda CreditCard", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("=== PROSES TRANSAKSI & SMART CASTING ===")
    for (payment in daftarPembayaran) {
        // Percobaan pembayaran pertama (EWallet dipastikan gagal karena saldo hanya 50k)
        payment.processPayment(75000.0)

        // --- CHECKPOINT 11: SMART CASTING CHALLENGE ---
        // Mendeteksi apakah 'payment' adalah instance dari 'EWallet'
        if (payment is EWallet) {
            println("--> [Sistem] Terdeteksi tipe EWallet. Melakukan recovery saldo...")

            // Smart Cast terjadi di sini! Kita bisa memanggil topUp() padahal tipe awalnya PaymentMethod
            payment.topUp(50000.0)

            println("--> [Sistem] Mengulang transaksi EWallet...")
            payment.processPayment(75000.0) // Transaksi kedua (seharusnya berhasil)
        }
        println("------------------------------------------------")
    }
}