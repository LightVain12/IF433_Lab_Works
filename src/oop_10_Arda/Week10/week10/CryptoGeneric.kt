package oop_10_Arda.Week10.week10

class ApiResponse<T>(val status: Int, val message: String, val data: T)

interface Repository<T> {
    fun add(item: T)
    fun getAll(): List<T>
}

class WalletRepository<T> : Repository<T> {
    private val items = mutableListOf<T>()

    override fun add(item: T) {
        items.add(item)
    }

    override fun getAll(): List<T> = items
}