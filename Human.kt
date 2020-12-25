class Human(val name: String) {
    // property / atribut / field
    var email: String = ""
    var address: String = ""
    
    //method
    fun talk() {
        println("Alamat email saya adalah $email")
    }
    
    fun verify(email: String): Boolean {
        return email == this.email
    }
    
    fun intro () {
        println("Perkenalkan, nama say adalah $name")
    }
}
