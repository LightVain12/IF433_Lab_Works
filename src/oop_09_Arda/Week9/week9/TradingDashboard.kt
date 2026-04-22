package oop_09_Arda.Week9.week9

fun main() {
    println("=== CRYPTO TRADING DASHBOARD ===")

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 2.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 20, -1.5, "CLOSED"),
        TradeLog("ADAUSDT", "LONG", 10, 8.0, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 15, 0.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe } // Diurutkan Ascending (dari minus terbesar ke terkecil)
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("\n[ Top Performers ]")
    topPerformersString.forEach { println(it) }

    println("\n[ Worst Performers ]")
    worstPerformersString.forEach { println(it) }

    println("\n[ Unique Pairs Traded ]")
    println(uniquePairs)

}