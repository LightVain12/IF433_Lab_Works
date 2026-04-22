package oop_09_Arda.Week9.week9

// CP 8: Data Class
data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )
    println("=== HONOR STUDENTS PIPELINE ===")
}