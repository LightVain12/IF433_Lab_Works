package Week7

class Mahasiswa(val kampus: String) {

    companion object {
        var nama: String = "unknown"

        fun set_nilai(uts: Int, uas: Int): Int {
            return (uts + uas) / 2
        }

        fun isi_nama_kampus(namaUniv: String) {
            Mahasiswa(kampus = namaUniv)
        }
    }

    // Bagian class biasa (Bukan Companion Object)
    init {
        // Variabel $kampus sekarang dikenali dari constructor
        println("nama kampus kamu $kampus")
    }
}