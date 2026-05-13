package oop_12_Arda.Week12.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN 1 (PAGI) ===")
    try {
        dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Caught Domain Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Domain Error: ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: ${e.message}")
    }finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
    println("\n=== JADWAL MAKAN 2 (SORE) ===")
    val feedingResult = runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }
    feedingResult.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }
    feedingResult.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}