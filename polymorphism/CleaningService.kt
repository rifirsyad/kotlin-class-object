package polymorphism

class CleaningService :  KaryawanSekolah(){
    var sma: String = ""

    fun membersihkan(){
        println("Saya yang bertanggung jawab atas kebersihan lingkungan sekolah $sma")
    }
    
    override fun perkenalan() {
        println("Perkenalkan, nama saya $nama, alamat saya di $alamat, saya yang bertanggung jawab atas kebersihan lingkungan sekolah $sma")
    }
}
