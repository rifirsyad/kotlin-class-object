fun main() {
    val manusia : Human = Human("Manusia")
    val andi : Human = Human("Andi")
    manusia.email = "humanity@human.com"
    manusia.address = "World, Universe"
    andi.email = "andi@mail.com"
    andi.address = "Indonesia"
    
    manusia.talk()
    andi.talk()
    manusia.intro()
    andi.intro()
    
    println(manusia.verify("lah@manusia.com"))
    println(Rahardi.name)
    
    val ardi : Rahardi = Rahardi
    
    println(ardi.nationality)
    println(manusia)
}
