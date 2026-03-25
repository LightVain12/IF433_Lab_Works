package oop_07_Arda.Week7.week7

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Pedang Naga Emas", 150, ItemRarity.EPIC)
            return Weapon(epicItem, 500)
        }
    }
}