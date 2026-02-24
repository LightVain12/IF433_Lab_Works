package oop_02_Arda.Week2.week2


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage Hero: ")
    val baseDamage = scanner.nextLine().toIntOrNull() ?: 10

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    println("\n=== BATTLE START ===")
    println("${hero.name} vs Enemy")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nHP ${hero.name}: ${hero.hp}")
        println("HP Enemy: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextLine()

        if (choice == "1") {
            hero.attack("Enemy")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("Enemy terkena ${hero.baseDamage} damage! Sisa HP Enemy: $enemyHp")

            // Enemy balas kalau masih hidup
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy membalas dengan $enemyDamage damage!")

                hero.takeDamage(enemyDamage)

                println("Sisa HP ${hero.name}: ${hero.hp}")
            }

        } else if (choice == "2") {
            println("${hero.name} kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid.")
        }
    }

    println("\n=== HASIL BATTLE ===")
    if (hero.hp > 0 && enemyHp == 0) {
        println("${hero.name} MENANG!")
    } else if (hero.hp == 0 && enemyHp > 0) {
        println("Enemy MENANG!")
    } else {
        println("Pertarungan berhenti.")
    }
}
