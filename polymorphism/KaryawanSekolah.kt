package polymorphism

open class KaryawanSekolah : Orang() {
    var nip: String = ""
    var gaji: Int = 0

    fun bekerja() {
        println("Saya bekerja dengan gaji $gaji")
    }
    
    override fun perkenalan() {
      println("Perkenalkan, nama saya $nama, alamat saya di $alamat, saya bekerja dengan gaji $gaji")
    }
}
