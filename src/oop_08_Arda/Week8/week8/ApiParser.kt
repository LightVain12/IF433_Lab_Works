package oop_08_Arda.Week8.week8

class ApiParser {
}package oop_08_Arda.Week8.week8

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Menggunakan requireNotNull untuk memastikan id dan name WAJIB ada
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Fallback dengan Elvis operator jika warranty tidak valid/kosong
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Fallback dengan Elvis operator jika size kosong
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null // Kembalikan null jika tipenya tidak dikenal
        }
    }
}