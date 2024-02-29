fun mulaiGame(namaKarakter: String, streghPlayer: Int, healthPlayer: Int, hungerBar: Int) {

    var mushroomRabbitStregh = 30

    println("$namaKarakter akan melawan moster Mushroom Rabbit🍄🐰 yang memiliki kekuatan $mushroomRabbitStregh \n" +
            "di turnament Monster Hunter, "+
            "sedangkan $namaKarakter baru memiliki kekuatan $streghPlayer.\n " +
            "pertandingan akan dimulai sebulan dari sekarang apa yang akan kamu lakukan?")

    pilihanUtama(namaKarakter, streghPlayer, healthPlayer, hungerBar, mushroomRabbitStregh)
}