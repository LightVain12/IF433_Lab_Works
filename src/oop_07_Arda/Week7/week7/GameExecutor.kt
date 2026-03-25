package oop_07_Arda.Week7.week7

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Ada ${event.monsterName} menyerang!")
        is BattleState.LootDropped -> println("Hore! Mendapat loot: ${event.item.name} [${event.item.rarity}]")
        is BattleState.GameOver -> println("GAME OVER. Alasan: ${event.reason}")
        BattleState.SafeZone -> println("Memasuki Safe Zone. HP diregenerasi.")
    }
}