package oop_06_Arda.Week6.week6

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\nMematikan semua perangkat Switchable...")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff() // Smart Casting
            }
        }
    }
}