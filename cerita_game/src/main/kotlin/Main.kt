fun main() {
    print("🕹️STORY GAME!!🕹️")
    readln()
    print("Hello, selamat datang di game cerita.\n"+
    "Di game ini visual hanya akan muncul di benakmu sendiri🧠🤯 \n"+
    "Kamu siap?\n")
    readln()
    var streghPlayer = 5
    var healthPlayer = 10
    var hungerBar = 100
    var namaKarakter = ""
    var nulisNama = true
    while (nulisNama) {
        print("Ketik nama karaktermu: ")
        namaKarakter = readln().toString()
        if (!namaKarakter.isBlank()){
            nulisNama = false
        }else {
            println("Masukan nama dulu!!")
        }
    }
    println("Selamat bermain🎉")
    var lanjut = true
    while (lanjut) {
        println(
            "Ketik \"DATA\" untuk melihat data karakter \n" +
                    "Atau\n" +
                    "Ketik \"MAIN\" untuk langsung memulai game \n"
        )

        var userKontrol = readln().toString()

        if (userKontrol == "DATA" || userKontrol == "data") {
            println("Nama 🦸‍♂️: $namaKarakter")
            println("Stregh 💪: $streghPlayer")
            println("Health 💖: $healthPlayer")
            println("Hunger 🍖: $hungerBar%")
            print("{Tekan ENTER untuk kembali}")
            readln()
            lanjut = true
        } else if (userKontrol == "MAIN" || userKontrol == "main") {
            print("MULAAAIIII🎮\n")
            println("")
            lanjut = false
            mulaiGame(namaKarakter, streghPlayer, healthPlayer, hungerBar)
        }
    }
}