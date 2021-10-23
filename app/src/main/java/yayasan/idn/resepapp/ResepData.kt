package yayasan.idn.resepapp

object ResepData {
    private val resepNames = arrayOf("Rendang",
        "Sate",
        "Gado gado",
        "Bika ambon",
        "Pempek",
    "Nasi goreng",
    "Bakso",
    "Kerak telur",
    "Gudeg",
    "Sop buntut")

    private val resepDetails = arrayOf(
            """
                Dilihat dari gambarnya saja rendang sudah lezat, apalagi saat kamu mencicipinya.Kelezatan rendang sudah dikenal dunia. Bahan utama rendang adalah daging. Dimasak dengan aneka bumbu khas Indonesia, rasa rendang menjadi tiada duanya. Banyak orang yang langsung ketagihan pada saat pertama kali mereka mencicipi rendang",
                
                Bahan :
                
                - 1 kg daging sapi
                - 3 butir kelapa, diambil santan kental dan santan encernya
                - 4 lembar daun jeruk
                - 3 batang serai, memarkan
                - 4 butir asam kandis
                - 100ml minyak goreng
                - 5 gram garamBumbu rendang daging sapi 1 Kg:
                - 60 gram bawang merah
                - 50 gram bawangputih
                - 250 gram cabai merah besar
                - 100 gram lengkuas
                - 50 gram kemiri
                - 2 gram cengkeh

                Cara Membuat rendang sapi :
                
                1. Haluskan semua bahan Bumbu dengan diulek atau diblender.
                
                2. Tumis bumbu dengan sedikit minyak goreng hingga wangi.

                3. Masukkan batang serai, daun jeruk, asam kandis dan garam, aduk rata.

                4. Tuangi santan dan dididihkan, masukkan daging.

                5. Masak dengan api kecil selama beberapa jam sampai daging empuk dan bumbu kecoklatan sesuai selera.
                
            """.trimIndent(),
            """
                Sate, siapa yang tidak suka makan sate? Makanan yang menggunakan tusuk bambu dan menghasilkan bau harum saat dibakar ini adalah makanan kesukaan banyak orang Indonesia. Jenis sate ada bermacam-macam, seperti sate ayam, babi dan kambing. Gambar makanan sate di atas sudah membuatmu meneteskan air liur, kan?
                
                Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate.Daging yang dijadikan sate antara lain daging ayam, kambing, domba, sapi, babi, kelinci, kuda, dan lain-lain.
                
                Sate diketahui berasal dari Jawa, Indonesia, dan dapat ditemukan di mana saja di Indonesia dan telah dianggap sebagai salah satu masakan nasional Indonesia.
            """.trimIndent(),
            """
                Gado-gado adalah makanan khas Indonesia yang sehat. Kamu bisa lihat dari gambar makanan di atas, isinya adalah sayur-sayuran. Dicampur dengan bumbu kacang super lezat membuat gado-gado menjadi salah satu makanan berisi sayuran yang paling banyak disukai.
                
                Gado-gado adalah salah satu makanan khas yang berasal dari Jakarta, Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur dan pada umumnya banyak yang menambahkan kentang rebus yang sudah dihaluskan untuk dicampur bumbu kacang, kentang rebus dimasak bersama dengan bumbu kacang kemudian di atasnya ditaburi bawang goreng. Sedikit emping goreng atau kerupuk (ada juga yang memakai kerupuk udang) juga ditambahkan.
            """.trimIndent(),
            """
                Ada kue khas Indonesia yang rasanya disukai banyak orang. Nama kue tersebut adalah bika ambon. Bika ambon terbuat dari bahan-bahan utama pembuat kue, seperti telur, gula dan santan."
                
                Bika ambon adalah penganan khas Medan, Indonesia. Terbuat dari bahan-bahan seperti tepung tapioka, telur, gula, dan santan. Kini Bika Ambon dijual bukan saja rasa asli tetapi sudah ada varian rasa pandan, durian, keju, dan cokelat. Bika ambon yang dimasak selama 12 jam ini biasanya dapat bertahan dalam kondisi terbaik selama empat hari karena setelah itu kue tersebut mulai mengeras.
                
                Menurut penjelasan M Muhar Omtatok, seorang budayawan dan sejarawan, kue bika ambon terilhami dari Bika atau Bingka makanan khas melayu. Selanjutnya bingka tersebut dimodifikasi dengan bahan pengembang berupa nira/tuak enau hingga berongga dan berbeda dari kue Bika asalnya
            """.trimIndent(),
            """
               Apa jadinya jika ikan dan tepung diadon menjadi satu lalu digoreng? Pempek adalah sebutan untuk makanan ini. Pempek biasanya dimakan menggunakan bumbunya yang terbuat dari cuka yang dicampur dengan gula. Jika gambar makanan di atas sudah mampu membuatmu lapar, maka bayangkan betapa menggiurkan rasanya."
               
               Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam. Pempek biasanya disajikan dengan kuah cuka yang memiliki rasa asam, manis, dan pedas. Pempek sering disebut sebagai makanan khas Palembang, meskipun hampir semua daerah di Sumatera Selatan memproduksinya,Pempek dapat ditemukan dengan mudah di Kota Palembang; ada yang menjualnya di restoran, ada yang di pinggir jalan, dan pula yang dipikul
            """.trimIndent(),
            """
                Nasi goreng juga ada di negara-negara lain, namun bagaimanapun juga nasi goreng Indonesia terasa lebih enak di lidah karena memang dimasak menggunakan bumbu-bumbu khas Indonesia yang sangat kaya."
                
                Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.

                Nasi goreng juga dikenal sebagai masakan nasional Indonesia. Dari sekian banyak hidangan dalam khazanah Masakan Indonesia, hanya sedikit yang dapat dianggap sebagai makanan nasional sejati. Masakan nasional Indonesia ini tidak mengenal batasan kelas sosial. Nasi goreng dapat dinikmati secara sederhana
            """.trimIndent(),
            """
                Bakso, si makanan berbentuk bulat ini rasanya sungguh-sungguh lezat. Makan bakso setiap hari pun tidak masalah. Bakso yang umumnya dikonsumsi adalah bakso sapi dan bakso ikan. Tergantung selera masing-masing, namun menurut kami bakso sapi adalah yang ternikmat."
                
                Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur lalu ditaburi bawang goreng dan seledri. Bakso sangat populer dan dapat ditemukan di seluruh Indonesia; dari gerobak pedagang kaki lima hingga restoran besar. Berbagai jenis bakso sekarang banyak ditawarkan dalam bentuk makanan beku yang dijual di pasar swalayan ataupun mal-mal. Irisan bakso dapat juga dijadikan pelengkap jenis makanan lain seperti mi goreng, nasi goreng, atau capcai.
            """.trimIndent(),
            """
                Gambar makanan apa yang berada di nomor delapan? Ya, kerak telur, jajanan khas Indonesia, lebih tepatnya Betawi. Kerak telur adalah campuran antara beras ketan dan telur ayam atau telur bebek yang kemudian dicampur dengan bumbu-bumbu."
                
                Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir. Kerak telor dapat ditemukan pada hari biasa. Anda bisa menemukan kerak telor di sekitar Kota Tua, Jakarta Barat. Menurut sejarah, Kerak Telor sudah ada dari zaman kolonial Belanda, kerak telor diciptakan oleh masyarakat Betawi secara tak sengaja Pada tahun 1970-an.
            """.trimIndent(),
            """
                Makanan khas Indonesia yang bernama gudeg ini juga wajib kamu cicipi. Gudeg merupakan sayur nangka muda yang dimasak dengan gula merah dan santan. Agar lebih lezat, gudeg biasanya dimakan bersama telur rebus, ayam goreng dan beberapa lauk lainnya."
                
                Gudeg (bahasa Jawa: ꦒꦸꦝꦼꦒ꧀, translit. Gudheg) adalah makanan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.
                
                Ada sebuah cerita yang beredar di masyarakat yang mengisukan bahwa warna coklat pada gudeg dihasilkan dari darah ayam yang ditambahkan pada masakan. Mitos ini tidak benar, karena warna coklat dihasilkan dari daun kelor.
            """.trimIndent(),
            """
                Siapa sangka kalau buntut sapi ternyata enak jika dimasak dengan cinta dan bumbu yang tepat. Ya, memang seperti itulah kenyataannya. Kelezatan sop buntut terkenal bukan hanya di Indonesia, namun juga di luar negeri."
                
                Sup buntut dibuat dengan ekor sapi. Sedikitnya ada lima versi sup buntut yang populer di seluruh dunia: makanan tradisional Korea, makanan Tiongkok yang lebih mirip semur, ekor sapi goreng/panggang dicampur dengan berbagai variasi sup merupakan makanan populer di Indonesia, makanan etnis Amerika Serikat bagian Selatan yang sudah ada sejak periode sebelum perang revolusi, dan sup kuah tebal dan gurih yang populer di Britania Raya sejak abad ke-18. Sup buntut Kreol dibuat dari tomat dengan ekor sapi, kentang, kacang hijau, jagung, mirepoix, bawang putih, dan rempah-rempah.
            """.trimIndent()
    )

    private val resepImages = intArrayOf(
        R.drawable.rendang,
        R.drawable.sate,
        R.drawable.gado_gado,
        R.drawable.bika_ambon,
        R.drawable.pempek,
        R.drawable.nasgor,
        R.drawable.bakso,
        R.drawable.kerak_telur,
        R.drawable.guded,
        R.drawable.sop_buntut

    )

    val listData: ArrayList<Resep>
        get() {
            val list = arrayListOf<Resep>()
            for (position in resepNames.indices) {
                val resep = Resep()
                resep.name = resepNames[position]
                resep.detail = resepDetails[position]
                resep.photo = resepImages[position]
                list.add(resep)
            }
            return list
        }
}