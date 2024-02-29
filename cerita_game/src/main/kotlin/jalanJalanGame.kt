fun jalanJalan(namaKarakter: String, streghPlayer: Int, healthPlayer: Int, hungerBar: Int, mushroomRabbitStregh: Int) {
    var hungerBar = hungerBar
    var streghPlayer = streghPlayer

    var liatTokoSenjata = true
    var maxBeliSenjata = 0
    hungerBar -= 20
    println(
        "$namaKarakter berpikir untuk jalan jalan keliling kota.\n " +
                "Di perjalanan $namaKarakter melihat ada banyak toko. Kemana $namaKarakter harus pergi?\n" +
                ""
    )
    var liatToko = true
    while (liatToko) {

        println(
            "\"ROTI\" -> $namaKarakter pergi ke toko roti dan membeli roti🥖🥖\n" +
                    "atau\n" +
                    "\"SENJATA\" -> $namaKarakter pergi ke toko senjata untuk membeli senjata⚔️\n" +
                    "atau\n" +
                    "\"WARNET\" -> $namaKarakter pergi ke warnet dan bermain game🎮🕹️" +
                    "atau\n" +
                    "\"KEMBALI\""
        )
        var userKontrol = readln()
        if (userKontrol == "ROTI" || userKontrol == "roti") {
            while (hungerBar < 100) {

                println("Roti apa yang harus dipilih $namaKarakter?")
                println(
                    "\"ROTI BAKAR\"\n" +
                            "\"ROTI PANGGANG\"\n" +
                            "\"ROTI COKLAT\"\n"
                )
                var pilihRoti = readln()
                if (pilihRoti == "ROTI BAKAR" || pilihRoti == "roti bakar" || pilihRoti == "ROTIBAKAR" || pilihRoti == "rotibakar") {
                    println("nyam nyam..🤤")
                    hungerBar += 5
                    println("hunger bar mu $hungerBar%")
                } else if (pilihRoti == "ROTI PANGGANG" || pilihRoti == "ROTIPANGGANG" || pilihRoti == "roti panggang" || pilihRoti == "rotipanggang") {
                    println("nyam nyam..🤤")
                    hungerBar += 10
                    println("hunger bar mu $hungerBar%")

                } else if (pilihRoti == "ROTI COKLAT" || pilihRoti == "ROTICOKLAT" || pilihRoti == "roti coklat" || pilihRoti == "roticoklat") {
                    println("nyam nyam..🤤")
                    hungerBar += 5
                    println("hunger bar mu $hungerBar%")
                }
            }
            println("$namaKarakter kenyang")
            liatToko = true
        } else if (userKontrol == "SENJATA" || userKontrol == "senjata"){
            if (maxBeliSenjata < 2) {
                println(
                    "$namaKarakter masuk ke toko senjata dan ingin membeli senjata\n"
                )

                while (liatTokoSenjata && maxBeliSenjata < 2) {
                    println("senjata apa yang harus $namaKarakter beli?")
                    println(
                        "\"PEDANG NAGA\"\n" +
                                "\"PEDANG KELINCI\"\n" +
                                "\"PEDANG MONYET\"\n"
                    )
                    var pilihPedang = readln()
                    if (pilihPedang == "PEDANG NAGA" || pilihPedang == "PEDANGNAGA" || pilihPedang == "pedang naga" || pilihPedang == "pedangnaga") {
                        println("kekuatan $namaKarakter bertambah⚔️🐉")
                        streghPlayer += 2
                        println("kekuatanmu sekarang $streghPlayer")
                        maxBeliSenjata++

                        println(
                            "\"BELI\" -> beli senjata lagi\n" +
                                    "atau\n" +
                                    "\"KELUAR\" -> keluar toko"
                        )
                        var pilihanUser = readln()
                        if (pilihanUser == "BELI" || pilihanUser == "beli") {
                            liatTokoSenjata = true
                        } else if (pilihanUser == "keluar" || pilihanUser == "KELUAR") {
                            liatToko = true
                        }
                    } else if (pilihPedang == "PEDANG KELINCI" || pilihPedang == "ROTIPANGGANG" || pilihPedang == "roti psnggang" || pilihPedang == "rotipanggang") {
                        println("kekuatan $namaKarakter bertambah⚔️🐰")
                        streghPlayer += 3
                        maxBeliSenjata++
                        println("kekuatanmu sekarang $streghPlayer")

                        println(
                            "\"BELI\" -> beli senjata lagi\n" +
                                    "atau\n" +
                                    "\"KELUAR\" -> keluar toko"
                        )
                        var pilihanUser = readln()
                        if (pilihanUser == "BELI" || pilihanUser == "beli") {
                            liatTokoSenjata = true
                        } else if (pilihanUser == "keluar" || pilihanUser == "KELUAR") {
                            liatToko = true
                        }
                    } else if (pilihPedang == "PEDANG MONYET" || pilihPedang == "PEDANGMONYET" || pilihPedang == "pedangmonyet" || pilihPedang == "pedang monyet") {
                        println("kekuatan $namaKarakter bertambah⚔️🐒")
                        streghPlayer += 4
                        maxBeliSenjata++
                        println("kekuatanmu sekarang $streghPlayer")

                        println(
                            "\"BELI\" -> beli senjata lagi\n" +
                                    "atau\n" +
                                    "\"KELUAR\" -> keluar toko"
                        )
                        var pilihanUser = readln()
                        if (pilihanUser == "BELI" || pilihanUser == "beli") {
                            liatTokoSenjata = true
                        } else if (pilihanUser == "keluar" || pilihanUser == "KELUAR") {
                            liatToko = true
                        }
                    }
                }
            }
            println("$namaKarakter sudah mencapai maksimal membawa senjata")
            liatToko = true

        } else if (userKontrol == "WARNET" || userKontrol == "warnet") {
            print("$namaKarakter bermain game🎮🕹️")
            hungerBar -= 20
            readln()
            liatToko = true
        } else if (userKontrol == "KEMBALI" || userKontrol == "kembali") {
            tunggu(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
        }
    }
}