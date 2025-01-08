package com.zukira.latihanwisatajepang.model

import com.zukira.latihanwisatajepang.R

data class ModelWisata(
    val gambar : Int,
    val nama : String,
    val tempat : String,
    val detail : String
)

object WisataList {
    fun getModel(): List<ModelWisata> {
        val itemModel1 = ModelWisata(
            R.drawable.fuji,
            "Mount Fuji",
            "Shizuoka",
            "Berdiri di ketinggian 3.765 meter, Mount Fuji menjadi gunung tertinggi Jepang! Gunung berapi ini merupakan salah satu situs ikonik dan menjadi favorit banyak orang. \n" +
                    "Selain itu, Gunung Fuji menyimpan berbagai banyak kisah menarik dan disembah sebagai gunung suci. Fuji Shibazakura Festival yang digelar di dasar gunung dari pertengahan April sampai Mei adalah salah satu alasan mengapa kamu tidak boleh melewatkan tempat ini. "
        )
        val itemModel2 = ModelWisata(
            R.drawable.senso,
            "Kuil Senso-ji",
            "Tokyo",
            "Salah satu landmark ikonik di Asakusa, Senso-ji Temple adalah kuil tertua di kota ini, berdiri di tahun 645. Juga dikenal sebagai Asakusa Kannon Temple, kuil Buddha yang berwarna-warni ini menghormati Kannon, dewi belas kasihan. Di sini, kamu bisa menemukan landmark terkenal lainnya di Asakusa, termasuk Asakusa Shrine dan Kaminari Gate. Jika kamu melewati Hozomon Gate, kamu bisa melihat aula utama kuil dan pagoda berlantai lima."
        )
        val itemModel3 = ModelWisata(
            R.drawable.fushimi,
            "Fushimi Inari Taisha",
            "Kyoto",
            "Fushimi Inari Taisha adalah Kuil Shinto yang berada di Fushimi-ku, Kyoto, Jepang. Kuil ini merupakan kuil pusat bagi sekitar 40.000 kuil Inari. Kuil utama terletak di kaki Gunung Inari dan tanah milik kuil mencakup gunung yang tingginya 233 meter. \n" +
                    "Berbeda dengan Kuil Shinto lainnya, Fushimi Inari memajang ‘kami’ atau apa yang disembah di kuil tersebut secara langsung, yakni sebuah cermin. Selain itu, kamu bisa menemukan banyak patung serigala (kitsune) di area kuil. Menurut kepercayaan, serigala dianggap sebagai pembawa pesan. "
        )
        val itemModel4 = ModelWisata(
            R.drawable.dotonbori,
            "Dotonbori",
            "Osaka",
            "Dotonbori ibarat Shibuya-nya Osaka. Pusat perbelanjaan yang begitu sibuk dan menjadi shopping destination favorit para turis. Di sini kamu dapat berbelanja atau sekadar berfoto di depan papan iklan yang konon sudah dipasang sejak 1935. \n" +
                    "Di kawasan ini pula kamu dapat menikmati berbagai jenis makanan khas dan hiburan malam khas Osaka. Selain itu, di sekitar Dotonbori terdapat beberapa destinasi yang sayang kamu lewatkan, termasuk Tombori River Cruise Osaka yang membuatmu dapat menyusuri Sungai Dotonbori. "
        )
        val itemModel5 = ModelWisata(
            R.drawable.gibli,
            "Ghibli Museum",
            "Tokyo",
            "Pengalaman magis ini hanya dapat kamu rasakan saat mengunjungi  yang terletak di sebelah barat Tokyo. Ghibli Museum adalah bentuk dedikasi para animator Studio Ghibli dan penghargaan untuk para penggemarnya yang tersebar di seluruh dunia. \n" +
                    "Selain menyuguhkan berbagai instalasi dari animasi-animasi Studio Ghibli, Ghibli Museum juga punya area pemutaran film yang menayangkan animasi pendek berdurasi sekitar 20 menit. Tonton karya-karya studio yang juga mendapat 15 penghargaan di Jepang dan 5 nominasi Piala Oscar dengan suasana berbeda. "
        )
        val itemModel6 = ModelWisata(
            R.drawable.akhibara,
            "Akihabara",
            "Tokyo",
            "Mengunjungi distrik perbelanjaan Akihabara menghadirkan keasyikan tersendiri bagi para pencinta game dan anime. Pasalnya, distrik ini dipenuhi dengan toko yang menjual berbagai merchandise anime, manga, game, dan gadget."
        )
        val itemModel7 = ModelWisata(
            R.drawable.shirakawa,
            "Shirakawa-go",
            "Gifu",
            "Shirakawa-go yang terletak di bagian tengah Jepang terkenal akan rumah-rumah tradisionalnya yang beratap curam dari jerami dan dikelilingi oleh alam yang subur. Pemandangan menakjubkan dan suasana damai yang menyertainya membuat Situs Warisan Dunia UNESCO ini memang sangat layak untuk dikunjungi!"
        )
        val itemModel8 = ModelWisata(
            R.drawable.biei,
            "Biei Blue Pond",
            "Hokkaido",
            "Biei Blue Pond adalah fenomena alam yang menarik di Hokkaido, dengan warna airnya yang unik, perpaduan menakjubkan antara biru dan hijau yang berubah sesuai dengan cuaca dan musim. Warna unik ini disebabkan oleh kandungan mineral dalam air kolam, dan semakin indah lagi karena kolamnya dikelilingi oleh hutan pinus yang membuat pemandangan di sini semakin indah."
        )

        val itemList: ArrayList<ModelWisata> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)

        return itemList
    }
}
