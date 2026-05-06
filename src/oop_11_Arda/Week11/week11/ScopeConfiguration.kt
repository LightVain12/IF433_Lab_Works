package oop_11_Arda.Week11.week11

data class User(var name: String = "", var age: Int = 0)
fun main() {
    // --- CHECKPOINT 7: apply ---
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)
}