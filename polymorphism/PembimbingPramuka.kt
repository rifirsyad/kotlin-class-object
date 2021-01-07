package polymorphism

open class PembimbingPramuka :KaryawanSekolah() {
    var pelatih: String = ""

    fun melatih() {
        println("Saya adalah pelatih $pelatih di SMA maarif Yogyakarta")
    }
    
    override fun perkenalan() {
        println("Perkenalkan, nama saya $nama, alamat saya di $alamat, saya adalah pelatih $pelatih di SMA maarif Yogyakarta")
    }
}
