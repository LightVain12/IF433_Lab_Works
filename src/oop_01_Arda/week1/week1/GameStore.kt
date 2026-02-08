package oop_01_Arda.week1.week1

fun main() {
    val gameTitle = "GTA VI"
    val price = 750_000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 20) / 100 else (price * 10) / 100
