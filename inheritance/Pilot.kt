package inheritance
	
	class Pilot : Karyawan() {
	
	    var maskapai : String = ""
	
	    fun bekerja(){
	        println("Saya berkerja di maskapai $maskapai")
	    }
	}
