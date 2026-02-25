package oop_04_Arda.Week4.week4

fun main() {
    println("--- Testing Manager ---")
    val manager = Manager(name = "Andi", baseSalary = 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer(name = "Budi", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}") // Memanggil method bawaan parent
}