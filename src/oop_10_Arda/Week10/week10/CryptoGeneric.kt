package oop_10_Arda.Week10.week10

class ApiResponse<T>(val status: Int, val message: String, val data: T)

interface Repository<T> {
    fun add(item: T)
    fun getAll(): List<T>
}