package polymorphism
	
	class Pilot : Karyawan() {
	
	    var maskapai : String = ""
      var nama : String = ""
	
	    fun bekerja(){
	        println("Saya berkerja di maskapai $maskapai")
	    }
      override fun perkenalan() {
          println("Perkenalkan, nama saya $nama,Saya berkerja di maskapai $maskapai")
      }
	}
