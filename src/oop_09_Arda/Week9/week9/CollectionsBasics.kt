package oop_09_Arda.Week9.week9

fun main() {
    // --- CHECKPOINT 1: LIST ---
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR!
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")