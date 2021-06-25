package com.example.siwikode.data

import com.example.siwikode.model.Travel

object TravelData {
    private val travelTitles = arrayOf(
        "Gunung Panjang",
        "Masjid Kubah Emas",
        "Taman Mekarsari",
        "Museum Layang-Layang",
        "Taman Pasir Putih",
        "Pondok Zidane",
        "Kebun Binatang Ragunan",
        "Setu Babakan",
        "Trans Studio Cibubur",
        "Vihara Budha Dharma"
    )

    private val travelRates = arrayOf(
        "4.0",
        "4.7",
        "4.3",
        "4.5",
        "4.2",
        "4.2",
        "4.5",
        "4.4",
        "4.3",
        "4.6"
    )

    private val travelTypes = arrayOf(
        "Alam",
        "Tempat Ibadah",
        "Taman Bermain",
        "Meseum",
        "Taman Bermain",
        "Taman Bermain",
        "Kebun Binatang",
        "Alam",
        "Taman Bermain",
        "Tempat Ibadah"
    )

    private val travelDesc = arrayOf(
        "Gunung Panjang merupakan jenis wisata alam dan kesehatan. Gunung panjang ini sudah dibuka sejak tahun 1991, tempatnya berupa bukit kapur yang disusun berundak dan memiliki sumber air panas alami di bagian puncaknya",
        "Masjid Kubah Emas di Depok, Jawa Barat, disebut-sebut sebagai masjid termegah se-Asia Tenggara. Sejarah pembangunan masjid ini dimulai sejak tahun 2001. Pendiri Masjid Kubah Emas adalah pasangan suami-istri yakni Maimun Al Rasyid dan Dian Al Mahri.",
        "Mekarsari Taman Buah merupakan salah satu pusat pelestarian keanekaragaman hayati buah- buahan tropika terbesar di dunia, khususnya jenis buah-buahan unggul yang dikumpulkan dari   seluruh   daerah   di   Indonesia,   sekaligus   merupakan   tempat   penelitian   budidaya (agronomi), pemuliaan (breeding) dan perbanyakan bibit unggul untuk kemudian disebarluaskan kepada petani dan masyarakat umum.",
        "The Kites Museum of Indonesia adalah sebuah museum di Pondok Labu, Jakarta Selatan. Ini adalah museum layang-layang pertama di Indonesia. Koleksinya mencakup lebih dari 600 layang-layang",
        "Taman Wisata Pasir Putih Depok memiliki berbagai wahana dan fasilitas yang seru. Dari wahana permainan air dan outbond untuk anak-anak, hingga bungalow, karaoke, kolam pemancingan, dan lapangan futsal untuk remaja dan orang dewasa bisa dijadikan untuk seru-seruan.",
        "Pondok Zidane adalah pusat aktivitas luar ruang berkonsep alam asri di Depok, Jawa Barat. Tempat wisata ini dilengkapi dengan waterpark, aneka wahana, sarana outbound, dan penginapan. Taman rekreasi ini menggabungkan wisata alam dengan sarana edukasi anak-anak dalam kemasan yang menarik.",
        "Kebun Binatang Ragunan adalah sebuah kebun binatang yang terletak di daerah Ragunan, Pasar Minggu, Jakarta Selatan, Indonesia. Kebun binatang seluas 140 hektare ini didirikan pada tahun 1864. Di dalamnya, terdapat berbagai koleksi yang terdiri dari 295 spesies dan 4040 spesimen.",
        "Setu Babakan atau Danau Babakan terletak di Srengseng Sawah, kecamatan Jagakarsa, Kotamadya Jakarta Selatan, Indonesia dekat Depok yang berfungsi sebagai pusat Perkampungan Budaya Betawi, suatu area yang diperuntukkan untuk pelestarian warisan budaya Jakarta, yaitu budaya asli Betawi.",
        "Trans Studio Cibubur adalah sebuah taman bermain dalam ruangan (indoor theme park) di Depok, Jawa Barat. Trans Studio dibangun di lahan seluas 4.1 hektar. Trans Studio Cibubur memiliki beberapa bagian, sebuah mal yang disebut Trans Studio Mall (biasanya disebut sebagai TSM), sebuah taman hiburan bernama Trans Studio, Trans Park (tiga gedung apartemen) dan sebuah hotel mewah yang disebut Trans Studio Hotel.",
        "Vihara ini dibangun selama 2 tahun dan selesai pada 28 April 2012. Rupang Buddha Tidur ini adalah yang terbesar kedua di Indonesia setelah patung sejenis di Maha Vihara Majapahit di Mojokerto, Jawa Timur. Kalau mau melihat patung Buddha Tidur, kini tidak usah pergi ke Bangkok, Thailand."
    )

    private val travelOpens = arrayOf(
        "00:00 - 24:00",
        "10:00 - 20:00",
        "08:00 - 16:00",
        "09:00 - 16:00",
        "09:00 - 17:00",
        "09:00 - 15:00",
        "07:00 - 14:00",
        "06:00 - 18:00",
        "11:00 - 18:00",
        "-"
    )

    private val travelAddress = arrayOf(
        "Cogreg, Parung, Bogor, jawa barat 16330",
        "Jl. Raya Meruyung, Meruyung, Kec. Limo, kota, Jawa Barat 16515",
        "Jalan Raya Cileungsi -Jonggol KM.3",
        "Jl. H. Kamang No.38, RT.8/RW.10, Pd. Labu, Kec. Cilandak",
        "Jalan Raja No.1, RT.1/RW.7, Pasir Putih, Kec. Sawangan",
        "Jalan Kekupu Blok, Blok Porek 1, Bedahan, Kec. Sawangan",
        "Jl. Harsono RM No.1, Ragunan, Kec. Ps. Minggu",
        "Kahfi II RT 009 / RW 008, Kel. Srengseng Sawah, Kec. Jagakarsa",
        "l. Alternatif Cibubur No.230, Harjamukti, Cimanggis",
        "Jalan PWRI Kampung Jati, Jalan Raya Parung RT. 02 / RW. 06, Tajur Halang"
    )

    private val travelPhones = arrayOf(
        "0859-4620-3170",
        "-",
        "(021) 8231811",
        "(021) 7658075",
        "(021) 29434479",
        "0813-1463-1400",
        "(021) 78847114",
        "-",
        "021 397 10101",
        "(021) 8802388"
    )

    private val travelImageUrls1 = arrayOf(
        "https://2.bp.blogspot.com/-veu-lwDk3NU/Wv57VKUqmVI/AAAAAAAACiY/JRiY3dWFwE4Ev-jN2uKyoSVlOkHpPd4nwCLcBGAs/s1600/IMG-20180502-WA0007.jpg",
        "https://traverse.id/wp-content/uploads/2018/02/Masjid-Kubah-Emas-Dian-Al-Mahri-Depok-Taj-Mahal-Indonesia-dengan-Kubah-Berkilauan.jpg",
        "https://sentul.city/wp-content/uploads/2021/02/Taman-Wisata-Mekarsari.jpg",
        "https://www.hargatiket.net/wp-content/uploads/2020/01/Museum-Layang-Layang.jpg",
        "https://cdn1-production-images-kly.akamaized.net/OSDyRxVeKXaqEDkYZt41DCb8itM=/640x480/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2856472/original/058854000_1563421251-20190718-Munsu-Waterpark-1.jpg",
        "https://www.javatravel.net/wp-content/uploads/2020/03/Kegiatan-Menarik-yang-Bisa-Dilakukan-di-Pondok-Zidane.jpg",
        "data:image/webp;base64,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",
        "https://beritalima.com/wp-content/uploads/2019/12/Liburan.jpg",
        "https://travelspromo.com/wp-content/uploads/2019/12/Adventure-Zone-Trans-Studio-Cibubur-Agung-Susprihadi.jpg",
        "https://seputarkota.com/wp-content/uploads/2018/03/DSC02070-1024x682.jpg",
    )

    private val travelImageUrls2 = arrayOf(
        "https://statik.tempo.co/data/2019/07/11/id_854573/854573_720.jpg",
        "https://assets.pikiran-rakyat.com/crop/0x0:0x0/750x500/photo/2019/11/23/209155018.jpg",
        "https://asset.kompas.com/crops/hDEpHzM5m59ecG5-IPta1OKT-Ug=/59x0:635x384/750x500/data/photo/2020/08/30/5f4b7b1f39a72.png",
        "https://www.hargatiket.net/wp-content/uploads/2020/01/museum-layang-layang-indonesia.jpg",
        "https://cdn.idntimes.com/content-images/post/20201203/38679555-1065575293609914-4443264639760859136-n-55152da8de122b427aee1d75ce39fad4_600x400.jpg",
        "https://travelspromo.com/wp-content/uploads/2019/06/Melintasi-Jembatan-Keseimbangan-di-Pondok-Zidane-Depok-pondokzidan-e1561611698338-640x400.jpg",
        "https://cdn0-production-images-kly.akamaized.net/FhFPwzTAsiGvZJGdHXhlc8R7FIs=/0x0/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1575494/original/022381800_1493019926-Libur-Isra-Mi_raj-di-Ragunan1.jpg",
        "https://cdn-2.tstatic.net/wartakota/foto/bank/images/setu-babakan-perahu-bebek12810.jpg",
        "https://travelspromo.com/wp-content/uploads/2019/12/5-Beach-Walk-eko-sudarwadi-1024x768.jpg",
        "https://static.republika.co.id/uploads/images/inpicture_slide/vihara-buddha-dharma-8-posat-bogor-jawa-barat-_151217102650-881.jpg",
    )

    private val travelImageUrls3 = arrayOf(
        "https://1.bp.blogspot.com/-xtHw-0uBe5c/XzihWTRLUoI/AAAAAAAAJ-w/Z_cxe3nzICcmfZm5YN6ZEzhHmnGKVHP7wCLcBGAsYHQ/s1080/lokasi-dan-tiket-masuk-pemandian-air-panas-gunung-panjang-bogor.jpg",
        "https://asset.kompas.com/crop/159x99:959x499/780x390/data/photo/2017/06/05/283140902.jpg",
        "https://mekarsari.com/web/wp-content/themes/accesspress-ray/images/demo/featuredimage-1.jpg",
        "https://obs.line-scdn.net/0hIcdeHLscFkxZHD-TsihpG2NKFSNqcAVPPSpHUglySHgjf1hOYn1beXUUGytzfFESNy1eKnUcDX0me1UbMH5b/w644",
        "https://travelspromo.com/wp-content/uploads/2019/02/Taman-Wisata-Pasir-Putih-Depok-ghoza-affan.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRR5Zm-dz3NMZvgkvSY7NM3SckkuFd3Ibxw9ZRWT0UMopGG96I9DtnkIT5TMqoXghwZSouI3h8ZHwIe-A&usqp=CAU",
        "https://images.bisnis-cdn.com/posts/2020/06/12/1251886/raguan1sah.jpg",
        "https://s3.bukalapak.com/uploads/content_attachment/34064fdf10e8d762ba2b53c5/w-744/5-Fakta-Menarik-Setu-Babakan-Jakarta.jpg",
        "https://cdn-2.tstatic.net/tribunnews/foto/bank/images/trans-studio-bandung-untuk-liburan.jpg",
        "https://asset.kompas.com/data/photo/2015/02/09/1549580IMG-4702780x390.JPG",
    )

    private val travelMaps = arrayOf(
        "https://goo.gl/maps/bLrBLJsCVaT5LG1V9",
        "https://goo.gl/maps/zA8QFXBgbHturVw36",
        "https://goo.gl/maps/oLDS7ESbn9BGnXsg8",
        "https://goo.gl/maps/G9LvAPQqHzcSmF8b8",
        "https://goo.gl/maps/uq9FWiL9emkitHLYA",
        "https://goo.gl/maps/4vUjaMseKemu4sJZ8",
        "https://goo.gl/maps/qoJYCuMkzNu2MKMm9",
        "https://goo.gl/maps/agWkbKmYsUfQwgby9",
        "https://goo.gl/maps/WgTeh6Urw1LTqPuf7",
        "https://goo.gl/maps/WLTSbAwZye2YMbxGA",
    )

    val listData: ArrayList<Travel>
        get() {
            val list = arrayListOf<Travel>()
            for(position in travelTitles.indices){
                val travel = Travel()
                travel.travelTitle = travelTitles[position]
                travel.travelRate = travelRates[position]
                travel.travelType = travelTypes[position]
                travel.travelDesc = travelDesc[position]
                travel.travelOpens = travelOpens[position]
                travel.travelAddress = travelAddress[position]
                travel.travelPhones = travelPhones[position]
                travel.imgUrls1 = travelImageUrls1[position]
                travel.imgUrls2 = travelImageUrls2[position]
                travel.imgUrls3 = travelImageUrls3[position]
                travel.travelMaps = travelMaps[position]
                list.add(travel)
            }
            return list
        }
}
