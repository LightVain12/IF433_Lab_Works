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

    // Menggunakan copy() untuk upgrade
    val upgradedItem = starterWeapon.item.copy(damage = 25, name = "Pedang Kayu Tajam")

    // Simulasi Event Berurutan
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}