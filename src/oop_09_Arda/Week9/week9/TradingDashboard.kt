package oop_09_Arda.Week9.week9

// Model Data Sementara (Asumsi berdasarkan instruksi Pipeline)
data class Trade(val pair: String, val status: String, val profitLoss: Double)

fun main() {
    val trades = listOf(
        Trade("BTC/USDT", "WIN", 150.0),
        Trade("ETH/USDT", "LOSS", -50.0),
        Trade("BNB/USDT", "OPEN", 0.0),
        Trade("SOL/USDT", "WIN", 200.0),
        Trade("ADA/USDT", "LOSS", -20.0),
        Trade("BTC/USDT", "OPEN", 0.0)
    )

    println("=== MENGAMBIL DATA TRADING ===")

    // Pipeline 1: Membuang status "OPEN"
    val closedTrades = trades.filter { it.status != "OPEN" }

    // Pipeline 2 & 3: Memisahkan WIN dan LOSS lalu diurutkan
    val topPerformers = closedTrades.filter { it.status == "WIN" }.sortedByDescending { it.profitLoss }
    val worstPerformers = closedTrades.filter { it.status == "LOSS" }.sortedBy { it.profitLoss }

    // Pipeline 4 & 5: Format String dan Unique Pairs
    val worstPerformersString = worstPerformers.map { "LOSS Ditemukan pada ${it.pair}: ${it.profitLoss} USD" }
    val uniquePairs = trades.map { it.pair }.toSet()

    println("\n=== TOP PERFORMERS ===")
    // CHECKPOINT 18
    topPerformers.forEach {
        println("${it.pair} menghasilkan profit sebesar +${it.profitLoss} USD")
    }

    println("\n=== WORST PERFORMERS ===")
    // CHECKPOINT 19
    worstPerformersString.forEach { println(it) }

    println("\n=== UNIQUE PAIRS TRANSACTED ===")
    println(uniquePairs)
}