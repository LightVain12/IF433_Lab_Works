package `Week 6`

class Mahasiswa(override val namaOrg: String,
                override val budgetRapat: Int,
                override val jmlOrg: Int,
                override val namaMK: String,
                override val nilaiMK: Int
) : Organisasi, KelasMK {
    private val week: Any = "Week 6"

    override fun rapat() {
        println("sedang rapat di $namaOrg");
        println("Biaya konsum rapat: ${super.biayaKonsumsi}");
    }

    override fun penilaian() {
        println("Nilai $namaMK adaalah 88")
    }

    override fun keaktifan() {
        super<KelasMK>.keaktifan()
        super<Organisasi>.keaktifan()
    }
}
