package oop_09_Arda.Week9.week9

fun main() {
    println("=== LATIHAN TERBIMBING 1: LIST & MUTABILITAS ===")

    // Immutable List (Read-Only)
    val readOnlyList = listOf("Bitcoin", "Ethereum", "Solana")
    println("Immutable List: $readOnlyList")
    // readOnlyList.add("Cardano") // ERROR: Tidak bisa ditambah

    // Mutable List (Dinamis)
    val dynamicList = mutableListOf("Bitcoin", "Ethereum", "Solana")
    dynamicList.add("Cardano") // BERHASIL
    dynamicList.remove("Ethereum")
    println("Mutable List: $dynamicList")
}