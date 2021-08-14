package com.example.UAS_AKB_IF9_10118355;

// 08 Agustus 2021 - 10118355 - Siti Alawiah - IF 9

import java.util.ArrayList;

public class WisataData {
    private static String[] wisataNames = {
            "Lereng Anteng",
            "Lembang Wonderland",
            "Karang Setra",
            "Kebun Binatang",
            "Farm House",
            "Taman Hutan Ir H Djuanda",

    };
    private static String[] wisataDescription = {
            "Tempat wisata di Bandung ini menawarkan pemandangan lembang pegunungan. Wisatawan bisa memanjakan diri dengan melihat pepohonan dan perbukitan hijau yang masih asri. Sambil menikmati keindahan alam, pengunjung juga bisa menikmati berbagai macam kuliner khas di sana dan beberapa pilihan tempat makan. Lereng Anteng juga menyediakan spot-spot Instagramable bagi pengunjung untuk berfoto.",
            "Tempat wisata ini menawarkan sejumlah spot Instagramable. Misalnya area Snow Village yang didekorasi semirip Kutub Utara. Baca juga: 4 Tempat Wisata di Bandung yang Wajib Dikunjungi, ke Mana Saja? Pengunjung bisa menikmati salju dan melihat-lihat beberapa bangunan transparan berukuran kecil menyerupai iglo. Fasilitas lainnya adalah Magic Forest yang menawarkan beberapa rumah pohon dengan tema dan desain unik. \n" +
                    "\n" +
                    "Beberapa di antaranya adalah tarzan dan buah-buahan.",
            "Awalnya, lokasi ini hanya dijadikan untuk latiha renang atlet. Seiring perkembangan zaman, Karang Setra pun menjadi tempat hiburan keluarga dengan tambahan nama Waterland. Sejumlah fasilitas yang tersedia di Karang Setra Waterland, di antaranya, Kolam Renang Area Anak, Sepeda Udara dan Balon Air, Mini Cinema dan Banteng Ngamuk, Gazebo, Air Terjun, Kolam Pantai, Kolam Prestasi, Kolam Arus, Ember Tumpah, Aqua Water, Dewaruci Miniatur, Pelang Slider dan Water Boom.",
            "Kebun Binatang Bandung memiliki luas lahan 14 hektar dan berada di jantung Kota Bandung. Dilansir dari laman bandung-zoo.com, Kebun binatang ini memiliki 800 satwa dengan tempat yang asri. Ada koleksi satwa yang bisa menjadi spot Instagramable di area tertentu. Pengunjung juga bisa menunggangi satwa di Wahana Unta Tunggang, Gajah Tunggang dan Kuda Tunggang.",
            "Farm House merupakan objek wisata alam dengan desain mirip peternakan di Belanda. Sambil berjalan-jalan, pengunjung bisa memakai kostum khas Belanda. Sejumlah spot Instagramable tersedia di Farm House, seperti lapangan yang berlatar belakang rumah gaya Eropa klasik hingga area My Secret yang memiliki bangunan tua dan dikelilingi berbagai macam bunga serta pagar pembatas berbahan batang pohon.",
            "Taman ini memiliki luas 526,98 hektar dan merupakan kawasan konservasi terpadu antara alam sekunder dengan hutan tanaman jenis pinus. Dilansir dari website resminya, https://tahuradjuanda.jabarprov.go.id, Taman Hutan Ir H Djuanda merupakan bagian dari daerah cekungan Bandung. Daerah ini memiliki latar belakang sejarang yang eat dengan zaman purba. Selain menjadi wisata sejarah, Taman Hutan Ir H Djuanda juga menawarkan pemandangan alam yang indah, sejuk dan asri, sehingga cocok dijadikan tempat refreshing dan juga berfoto."
    };


    private static String[] wisataAddress = {
            "Kampung Pagermaneuh, RT. 03/07, Pagerwangi, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Raya Lembang No.177, Jayagiri, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jalan Sirnagalih KM.4,5 No.15, Gegerkalong, Kec. Sukasari, Kota Bandung, Jawa Barat 40112",
            "Jl. Kebun Binatang No.6, Lb. Siliwangi, Kecamatan Coblong, Kota Bandung, Jawa Barat 40132",
            "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Taman Hutan Ir Djuanda berada di Kompleks Tahura, Jl. Ir. Juanda No 99, Ciburial, Kecamatan Cimenyan, Bandung"
    };

    private static String[] wisataMap = {
            "https://www.google.com/maps/place/LERENG+ANTENG+Panoramic+Coffee/@-6.842622,107.6205059,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e0d59c18d795:0x32c5e4a6a21426a2!8m2!3d-6.842535!4d107.622698?hl=id",
            "https://www.google.com/maps/place/Lembang+Wonderland/@-6.8170263,107.6106345,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e12960dfc0a3:0xa8f4f56d908395c1!8m2!3d-6.8170316!4d107.6128232?hl=id",
            "https://www.google.com/maps/place/Karang+Setra,+Jl.+Sirnagalih+No.15,+Gegerkalong,+Kec.+Sukasari,+Kota+Bandung,+Jawa+Barat+40162/@-6.8790323,107.5925288,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e68d9e58b16d:0xfd74e36de50272aa!8m2!3d-6.8781157!4d107.5947136?hl=id",
            "https://www.google.com/maps/place/Kebun+Binatang+Bandung/@-6.8897124,107.6055395,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e6584da0750d:0x773058ca7734127f!8m2!3d-6.8897177!4d107.6077282?hl=id",
            "https://www.google.com/maps/place/Farmhouse+Susu+Lembang/@-6.8329637,107.6034296,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e13bbef5ad89:0x356bebed022b2371!8m2!3d-6.832969!4d107.6056183",
            "https://www.google.com/maps/place/Taman+Hutan+Raya+Ir.+H.+Djuanda/@-6.8585788,107.6284202,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e0b82dc93d87:0xf664c059175258b1!8m2!3d-6.8585841!4d107.6306089?hl=id",
    };

    private static int[] wisataPhoto = {
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar6,

    };
    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setName(wisataNames[position]);
            wisata.setDescription(wisataDescription[position]);
            wisata.setAddress(wisataAddress[position]);
            wisata.setPhoto(wisataPhoto[position]);
            wisata.setMap(wisataMap[position]);
            list.add(wisata);
        }
        return list;
    }
}
