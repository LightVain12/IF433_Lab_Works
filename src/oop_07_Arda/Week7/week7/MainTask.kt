package oop_07_Arda.Week7.week7

fun main() {
    println("=== TESTING GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TESTING FACTORY & ENUM ===")

    println("Drop Chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Durability: ${starterWeapon.durability}")

    println("\n=== TESTING DATA CLASS COPY & SEALED EVENT ===")