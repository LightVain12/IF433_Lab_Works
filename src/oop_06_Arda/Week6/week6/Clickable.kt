package oop_06_Arda.Week6.week6

interface Clickable {
    val name: String
    fun click()
}

// Jika class Button ada di sini juga tidak apa-apa
class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}