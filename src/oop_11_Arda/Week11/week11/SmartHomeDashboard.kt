package oop_11_Arda.Week11.week11

fun main() {
    println("=== STARTING SMART HOME PIPELINE ===")

    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(name = "Philips WiZ Living Room", category = "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    println("\n=== DEVICE SEARCH ===")
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("Ditemukan: ${it.diagnose()}")
    }

    println("\n=== DASHBOARD SUMMARY ===")
    with(homeDevices) {
        println("Total perangkat terdaftar: ${this.size}")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total penggunaan daya: ${totalPower}W")

    println("\n=== DEVICE DIAGNOSTICS ===")
    homeDevices.forEach {
        println(it.diagnose())
    }

}