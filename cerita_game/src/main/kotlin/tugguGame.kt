fun tunggu(namaKarakter: String, streghPlayer: Int, healthPlayer: Int, hungerBar: Int, mushroomRabbitStregh: Int) {

        var hungerBar = hungerBar //variable yang ngambil parameter

        print("$namaKarakter pasrah dan menunggu hari pertandingan. " +
                "Karena bosan menunggu $namaKarakter memutuskan untuk melakukan kegiatan.")
        readln()
        var ngulang = true
        while (ngulang && hungerBar >= 0) {
                println(
                        "\"JALAN-JALAN\" -> pergi jalan-jalan keliling kota\n" +
                                "atau\n" +
                                "\"MAIN ML\" -> main ml dan nolep dirumah\n" +
                                "atau\n" +
                                "\"MAKAN\" -> makan untuk menambah hunger bar\n" +
                                "atau\n" +
                                "\"KEMBALI\" -> balik"
                )
                var userKontrol = readln()
                if (userKontrol == "JALAN-JALAN" || userKontrol == "JALANJALAN" || userKontrol == "JALAN JALAN" || userKontrol == "jalan-jalan" || userKontrol == "jalanjalan" || userKontrol == "jalan jalan") {

                        println("Jalan-jalan🚶‍♂️")
                        jalanJalan(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
                } else if (userKontrol == "MAIN ML" || userKontrol == "MAINML" || userKontrol == "mainml" || userKontrol == "main ml") {

                        println("main ml🎮")
                        hungerBar -= 5 //ngerubah variable
                        println("karena bermain ML hungermu berkurang 5% ")
                        readln()
                        println("ngapain lagi ya?")
                        ngulang = true

                } else if (userKontrol == "MAKAN" || userKontrol == "makan") {

                        println("Makan🍕🍔🍟🌭🍿🥓🥚🍳🧇🥞🧀🥐🥨🥪🌮🥖🍖🍗🥩🍠🥟🥡🫔🥗🍙🍱")
                        hungerBar += 5
                        println("Hunger bar bertambah 5% 🤤")
                        readln()
                        println("ngapain lagi ya?")
                        ngulang = true
                }else if (userKontrol == "KEMBALI" || userKontrol == "kembali"){
                        pilihanUtama(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
                }
        }
}