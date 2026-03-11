package oop_06_Arda.Week6.week6

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV '$name' diaktifkan.")
        startRecord() // Dipanggil otomatis
    }

    override fun turnOff() {
        println("CCTV '$name' dinonaktifkan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam video keamanan.")
    }
}