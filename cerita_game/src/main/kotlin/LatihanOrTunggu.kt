fun pilihanUtama(namaKarakter: String, streghPlayer: Int, healthPlayer: Int, hungerBar: Int, mushroomRabbitStregh: Int) {
    println("\"TUNGGU\" -> pasrah dan menunggu hari pertandingan\n" +
            "atau\n" +
            "\"LATIHAN\" -> latihan untuk meningkatkan kekuatan dan keahlian" +
            "atau\n" +
            "\"SKIP\" -> pergi ke hari pertandingan")
    var userKontrol = readln().toString()

    if (userKontrol == "TUNGGU" || userKontrol == "tunggu"){
        println("Menunggu🛌")
        tunggu(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
    }else if (userKontrol == "LATIHAN" || userKontrol == "latihan"){

        println("Latihan🏋️‍♂️")

        print("$namaKarakter berniat untuk berlatih agar kekuatannya bertambah \n" +
                "dan bisa mengalahkan monster Mushroom Rabbit")
        readln()
        latihan(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
    }else if (userKontrol == "SKIP" || userKontrol == "skip"){
        tanding(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
    }
}