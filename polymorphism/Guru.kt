package polymorphism

class Guru : KaryawanSekolah() {
    var mapel: String = ""

    fun mengajar() {
        println("Saya mengajar mata pelajaran $mapel")
    }
    
	  override fun perkenalan() {
	      println("Perkenalkan, nama saya $nama, alamat saya di $alamat, saya sebagai guru yang mengajar mata pelajaran $mapel")
	  }
}
