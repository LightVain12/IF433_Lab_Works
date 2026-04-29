package oop_10_Arda.Week10.week10

fun main() {
    println("=== CRYPTO EXCHANGE DASHBOARD ===")

    val coins = listOf(
        Coin("Bitcoin", "BTC", 65000.0),
        Coin("Ethereum", "ETH", 3500.0)
    )
    val response = ApiResponse(200, "Success", coins)

    println("Status: ${response.status} - ${response.message}")
    response.data.forEach {
        println("Coin: ${it.name} (${it.symbol}) - Price: $${it.price}")
    }

    println("\n=== TRANSACTION HISTORY ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.5, "BUY"))
    txRepo.add(Transaction("TX002", 1.2, "SELL"))

    txRepo.getAll().forEach {
        println("ID: ${it.txId} | Amount: ${it.amount} | Type: ${it.type}")
    }
}