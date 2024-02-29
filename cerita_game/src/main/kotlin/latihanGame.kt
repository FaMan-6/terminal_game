fun latihan(namaKarakter: String, streghPlayer: Int, healthPlayer: Int, hungerBar: Int, mushroomRabbitStregh: Int) {

    var streghPlayer = streghPlayer
    var latihan = true

    while (latihan) {


        println("pilih latihan🏋️‍♂️")
        println(
            "\"KEKUATAN\" -> untuk melatih kekuatan $namaKarakter 💪\n" +
                    "atau\n" +
                    "\"KECEPATAN\" -> untuk melatih kecepatan $namaKarakter 🏃‍♂️\n"
        )

        var userKontrol = readln()

        if (userKontrol == "KEKUATAN" || userKontrol == "kekuatan") {
            streghPlayer += 10
            println("karena $namaKarakter latihan kekuatan💪💪, kekuatannya bertambah 10")
            print("kekuatan $namaKarakter sekarang: $streghPlayer")
            readln()
            println(
                "\"LATIHAN\" -> latihan lagi\n" +
                        "atau\n" +
                        "\"UDAHAN\" -> udahan latihannya"
            )
            var userKontrol = readln()
            if (userKontrol == "LATIHAN" || userKontrol == "latihan") {
                latihan = true
            } else if (userKontrol == "UDAHAN" || userKontrol == "udahan") {
                latihan = false
                pilihanUtama(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
            }

        } else if (userKontrol == "KECEPATAN" || userKontrol == "kecepatan") {
            streghPlayer += 10
            println("karena $namaKarakter latihan kecepatan🏃‍♂️🏃‍♂️, kekuatannya bertambah 5")
            print("kekuatan $namaKarakter sekarang: $streghPlayer")
            readln()
            println(
                "\"LATIHAN\" -> latihan lagi\n" +
                        "atau\n" +
                        "\"UDAHAN\" -> udahan latihannya"
            )
            var userKontrol = readln()
            if (userKontrol == "LATIHAN" || userKontrol == "latihan") {
                latihan = true
            } else if (userKontrol == "UDAHAN" || userKontrol == "udahan") {
                latihan = false
                pilihanUtama(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
            }
        }
    }
}