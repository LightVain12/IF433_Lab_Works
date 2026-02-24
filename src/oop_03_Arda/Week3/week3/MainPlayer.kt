package oop_03_Arda.Week3.week3

fun main() {
    val p = Player("ProPlayer")

    // p.xp = 100 // Coba akses player.xp (harus error)

    p.addXp(50) // masih level 1
    p.addXp(60) // total 110, harus Level Up ke 2
}