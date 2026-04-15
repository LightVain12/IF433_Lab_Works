package oop_08_Arda.Week8.week8

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        // Smart Cast berdasarkan tipe Product
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Memanggil fungsi dari Java. Kita gunakan !! karena kita yakin sistem tidak akan mengembalikan null
        val result = JavaPaymentService.processPayment(id)
        println("Berhasil Checkout: ${result!!}")
    }
}