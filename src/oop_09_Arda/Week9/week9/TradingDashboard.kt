package oop_09_Arda.Week9.week9

fun main() {
    println("=== CRYPTO TRADING DASHBOARD ===")

    // --- CHECKPOINT 11: Populasi Data ---
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 2.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 20, -1.5, "CLOSED"),
        TradeLog("ADAUSDT", "LONG", 10, 8.0, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 15, 0.0, "OPEN")
    )

    }