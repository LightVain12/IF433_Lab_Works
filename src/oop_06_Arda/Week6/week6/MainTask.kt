package oop_06_Arda.Week6.week6

fun main() {
    val lamp = SmartLamp(id = "L01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "S01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "C01", name = "Ezviz Garasi")

    // --- TAMBAHAN UNTUK CHECKPOINT 20 ---
    val hub = SmartHomeHub()

    println("=== INISIALISASI HUB ===")
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // Testing Hub Automation
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}