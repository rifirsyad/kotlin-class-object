package inheritance

fun main() {
    val afrig = Dosen()
    afrig.nama = "Afrig Aminuddin"
    afrig.alamat = "Condongcatur"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.mengajar()

    val andika = Mahasiswa()
    andika.nama = "Andika Maharani"
    andika.alamat = "Bantul"
    andika.perkenalan()
    andika.prodi = "Sistem Informasi"
    andika.belajar()

    val budi = Satpam()
    budi.nama = "Budi Satria"
    budi.alamat = "Wonosari"
    budi.perkenalan()
    budi.gaji = 500000
    budi.bekerja()
    budi.pos = "Barat"
    budi.menjaga()
    
    val adi = Pilot()
    adi.nama = "Adi Prasetyo"
    adi.alamat = "Sleman"
    adi.perkenalan()
    adi.gaji = 5000000
    adi.bekerja()
    adi.maskapai = "Lion Air"
    adi.bekerja()
    
    val nina = Perawat()
    nina.nama = "Nurlina Nina"
    nina.alamat = "Pati"
    nina.perkenalan()
    nina.gaji = 200000
    nina.bekerja()
    nina.klinik = "Sehat Sentosa"
    nina.bekerja()
    
    val mina = Pramugari()
    mina.nama = "Mina Lestari"
    mina.alamat = "Jepara"
    mina.perkenalan()
    mina.gaji = 3000000
    mina.bekerja()
    mina.maskapai = "Air Asia"
    mina.bekerja()
    
    val arka = Dokter()
    arka.nama = "Arkana Mahesa"
    arka.alamat = "Jakarta"
    arka.perkenalan()
    arka.gaji = 4000000
    arka.bekerja()
    arka.klinik = "Sehat Mulia"
    arka.bekerja()
    
    val dito = Chef()
    dito.nama = "Dito Nugroho"
    dito.alamat = "Palembang"
    dito.perkenalan()
    dito.gaji = 3500000
    dito.memasak()
    dito.restoran = "Kenyang Nikmat"
    dito.memasak()
    
    val arman = Polisi()
    arman.nama = "Arman Pradityo"
    arman.alamat = "Bali"
    arman.perkenalan()
    arman.gaji = 2500000
    arman.menjaga()
    arman.polsek = "Kuta"
    arman.menjaga()
    
    val dimas = Guru()
    dimas.nama = "dimas nugroho"
    dimas.alamat = "Bantul"
    dimas.perkenalan()
    dimas.gaji = 250000
    dimas.bekerja()
    dimas.mapel = "Sejarah"
    dimas.mengajar()
    
    val mukti = KaryawanSekolah()
    mukti.nama = "mukti farhan"
    mukti.alamat = "klaten"
    mukti.perkenalan()
    mukti.gaji = 1000000
    mukti.bekerja()
    
    val burhan = CleaningService()
    burhan.nama = "burhan"
    burhan.alamat = "seturan"
    burhan.sma = "SMA Maarif Yogyakarta"
    burhan.perkenalan()
    burhan.gaji = 700000
    burhan.membersihkan()
    
    val koko = PembimbingPramuka()
    koko.nama = "koko yoi"
    koko.alamat = "Wonosari"
    koko.perkenalan()
    koko.gaji = 4000000
    koko.pelatih = "Pramuka SMP"
}
