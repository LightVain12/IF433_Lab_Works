package oop_03_Arda.Week3.week3

fun main() {
    val w = Weapon("Excalibur")

    w.damage = -50 // harus gagal
    w.damage = 9999 // harus jadi 1000

    println("Weapon: ${w.name}, Damage: ${w.damage}, Tier: ${w.tier}")
}