// Hands-on 3: Loops, Ranges & Null Safety

class ScoreBoard(private val skorMentah: List<Int?>) {
    // TODO: Buat property `skorValid` bertipe List<Int> berisi skorMentah
    // tanpa elemen null. Gunakan fungsi filterNotNull().
    // val skorValid: List<Int> = ???
    val skorValid: List<Int> = skorMentah.filterNotNull()

    fun skorKelulusan(batasLulus: Int): List<Int> {
        // TODO: Kembalikan skorValid yang >= batasLulus, diurutkan menurun.
        // Gunakan .filter { ... } dan .sortedDescending()
        return skorValid
            .filter { it >= batasLulus }
            .sortedDescending()
    }
}

fun cetakRentangGanjil(sampai: Int) {
    // TODO: Cetak semua bilangan GANJIL dari 1 sampai `sampai` (inklusif),
    // dipisah spasi, menggunakan for-loop dengan range ber-step:
    //   for (i in 1..sampai step 2) { ... }
    for (i in 1..sampai step 2) {
        print("$i ")
    }
}

fun main() {
    val papan = ScoreBoard(listOf(85, null, 72, 90, null, 55, 100))
    println("Skor lulus (>= 70): ${papan.skorKelulusan(70)}")

    cetakRentangGanjil(10)
}
