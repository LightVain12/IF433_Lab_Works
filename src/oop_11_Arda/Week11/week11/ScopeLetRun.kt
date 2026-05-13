package oop_11_Arda.Week11.week11

fun main() {
    // --- CHECKPOINT 4 ---
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }

    println("\n=== TEST RUN FUNCTION ===")

    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        this.length * 2
    }

    println("Hasil kalkulasi run: $result")
}