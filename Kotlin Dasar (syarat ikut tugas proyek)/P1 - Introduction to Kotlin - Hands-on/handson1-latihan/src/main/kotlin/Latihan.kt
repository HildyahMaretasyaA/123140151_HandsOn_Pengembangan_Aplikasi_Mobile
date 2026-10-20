// Hands-on 1: Variabel, Fungsi & String Template

fun describeProfile(nama: String, umur: Int?, kota: String = "Tidak diketahui"): String {
    // TODO 1: Buat val bernama umurText yang berisi:
    //   - "<umur> tahun" jika umur tidak null
    //   - "umur tidak diketahui" jika umur null
    //   Gunakan safe call (?.) dan elvis operator (?:)
    val umurText = umur?.let { "$it tahun" } ?: "umur tidak diketahui"

    // TODO 2: Kembalikan (return) satu String dengan format:
    //   "Nama: <nama>, Umur: <umurText>, Kota: <kota>"
    //   Gunakan string template ($nama, dst), bukan concatenation (+)
    return "Nama: $nama, Umur: $umurText, Kota: $kota"
}

fun main() {
    println(describeProfile("Andi", 20, "Bandar Lampung"))
    println(describeProfile("Budi", null))
    println(describeProfile(nama = "Citra", umur = 19))
}
