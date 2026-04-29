package oop_10_Arda.Week10.week10

class KeyValuePair<K, V>(val key: K, val value: V) {
    fun display() {
        println("Key: $key, Value: $value")
    }
}