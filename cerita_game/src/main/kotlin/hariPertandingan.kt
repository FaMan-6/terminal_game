fun tanding(namaKarakter: String, streghPlayer: Int, healthPlayer: Int, hungerBar: Int, mushroomRabbitStregh: Int) {
    var healthPlayer = healthPlayer
    print("$namaKarakter pergi langsung ke hari pertandingan,\n" +
            "di sana $namaKarakter langsung dihadapkan dengan Mushroom Rabbit🍄🐰")
    readln()
    println("\"LAWAN\" -> mulai lawan Mushroom Rabbit🍄🐰\n" +
            "atau\n" +
            "\"BALIK\" -> balik lagi aja")

    var useKontrol = readln()

    if (useKontrol == "LAWAN" || useKontrol == "lawan"){
        println("$namaKarakter melawan Mushroom Rabbit🍄🐰")
        println("💥💥💥💥💥💥💥💥")
        println("👊👊👊👊👊👊👊")
        println("🤛🤛🤛🤛🤛")
        println("⚔️⚔️⚔️")

        if (streghPlayer > mushroomRabbitStregh){
            println("$namaKarakter menang🎉🎉🎉🎉🎉")

        }else{
            println("$namaKarakter kalah😵‍💫😵‍💫😵‍💫💀")
            healthPlayer--
            readln()
            if (healthPlayer > 0){
                println("sisa nyawamu: $healthPlayer")
                mulaiGame(namaKarakter, streghPlayer, healthPlayer, hungerBar)
            }else{
                println("GAME OVER💀")
            }
        }
    }
}