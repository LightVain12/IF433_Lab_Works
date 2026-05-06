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
}