package oop_05_Arda.Week5.week5

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran EWallet Rp $amount BERHASIL. Sisa saldo: Rp $balance")
        } else {
            println("[$accountName] Pembayaran EWallet GAGAL: Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up EWallet Rp $amount BERHASIL. Saldo: Rp $balance")
    }
}