package oop_10_Arda.Week10.week10

class GenericBox<T>(private var content: T) {
    fun put(item: T) {
        content = item
    }
    fun get(): T = content
}