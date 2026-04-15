package oop_08_Arda.Week8.week8

fun main() {
    // Data API kotor yang mensimulasikan berbagai kondisi (Ada yang lengkap, kurang, salah tipe)
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24), // Valid
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"), // Valid
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Invalid Warranty (Fallback ke 12)
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID (Akan Crash/Ditangkap Catch)
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown Type (Diabaikan/Null)
    )

    val parser = ApiParser()

    println("=== E-COMMERCE CHECKOUT PIPELINE ===")

    for (raw in rawApiData) {
        try {
            // Coba parse datanya
            val product = parser.parseProduct(raw)

            // Jika tidak null (berhasil diparse), lakukan checkout
            product?.let {
                println("Parsing Sukses -> Model: $it")
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            // Menangkap error dari requireNotNull jika ID atau Name hilang
            println("ERROR Data Korup: ${e.message}")
        }
        println("----------------------------------------")
    }
}