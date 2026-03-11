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
                device.turnOff()
            }
        }
    }

    // --- TAMBAHAN UNTUK CHECKPOINT 18 ---
    fun activateSecurityMode() {
        println("\n=== MENGAKTIFKAN MODE KEAMANAN ===")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord() // Smart Casting
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan") // Smart Casting
            }
        }
    }
}