package oop_05_Arda.Week5.week5

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Credit Card sebesar Rp $amount BERHASIL. Sisa limit: Rp ${limit - usedAmount}")
        } else {
            println("[$accountName] Pembayaran Credit Card GAGAL: Melebihi limit transaksi.")
        }
    }
}