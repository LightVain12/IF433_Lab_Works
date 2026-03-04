package oop_05_Arda.Week5.week5

fun main() {
    val math = MathHelper()

    println("=== HASIL PERHITUNGAN LUAS ===")
    println("Luas Persegi (sisi 4): ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang (panjang 5, lebar 2): ${math.hitungLuas(5, 2)}")
    println("Luas Lingkaran (jari-jari 7.0): ${math.hitungLuas(7.0)}")
}