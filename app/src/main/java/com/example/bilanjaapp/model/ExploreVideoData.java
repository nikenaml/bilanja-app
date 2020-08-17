package com.example.bilanjaapp.model;

import java.util.ArrayList;

public class ExploreVideoData {
    private static String[][] data = new String [][]{
            {"Learn ASL: MONEY, BUY, and SHOP (One-Min Fix)",
                    "ASLMeredith" ,
                    "Learn to sign MONEY, BUY, and SHOP in American Sign Language!  Some students mix up these three signs, all related in handshape but with distinct movements. \n \n" +
                            "Watch to review!.\n\n" +
                            "Yuk, mulai belajar bahasa isyarat!",
                    "https://i.ytimg.com/vi/2ex65HcTLkU/maxresdefault.jpg"},

            {"Learn ASL in shopping!",
                    "ASLHawai",
                    "This video is the idea about going shopping if you are going to keep your deaf friend or family a company and this way you can learn basic signs to communicate with them! Have fun and enjoy!\n" +
                            "\n" +
                            "\n" +
                            "Yuk, mulai belajar bahasa isyarat!",
                    "https://1.bp.blogspot.com/-vJjoKt4zG4U/XgcdATzId0I/AAAAAAAATlU/G-Ze2kr_4WMvRbhFTK8a3I6p-TInZvG-QCLcBGAsYHQ/s1600/8.png"},

            {"Learn ASL: Communicate with Store or Restaurant Customers! (Basic beginner sign language phrases)",
                    "ASLMeredith",
                    "Learn how to sign in American Sign Language!  This is a basic, beginner-level introduction to a few signs and phrases that may be relevant to store and restaurant employees.  If you serve customers in your sales/service job, then these signs may help you communicate with your Deaf clientele!   :\n" +
                            "Below is a full list of signs in the above video, with the timestamp so you can skip ahead to your desired sign.  Any additional signs you'd like to learn? Feel free to comment and I'll add them to lists for future videos. ",
                    "https://i.ytimg.com/vi/lT6V7xx-ynY/hqdefault.jpg"},

            {"Using American Sign Language (ASL) While Shopping - For Dummies",
                    "fordummies",
                    "You can have all kinds of reactions to what you see when you're shopping for new clothes. \n" +
                            "\n" +
                            "This video shows examples in American Sign Language (ASL) of the types of clothes these two shoppers find and their reactions to them.",
                    "https://i.ytimg.com/vi/73tAXWrVOKY/hqdefault.jpg"},

            {"British Sign Language \"Shopping around\" (2016)",
                    "57davison",
                    "This may help you to sign about shopping signs, please beware your area regional signs may be different, ask your tutor or friends\n" +
                            "\n" +
                            "BISINDO yang telah digunakan sebagai keseharian oleh teman tuli mengandung kosa isyarat yang simbolis. Selama makna dari sebuah kata terwakili, maka kosa isyarat yang sederhana dari BISINDO sudah cukup. ",
                    "https://i.ytimg.com/vi/bTR_hdBMcc8/maxresdefault.jpg"},
//----------------------------------
            {"Belajar Bahasa Isyarat (Perkenalan Dasar Abjad & Jari)",
                    "HaiDokter" ,
                    "11 Januari diperingati sebagai Hari Tuli Nasional. haiDokter bekerja sama dengan GERKATIN (Gerakan untuk Kesejahteraan Tunarungu Indonesia) dan PUSBISINDO (Pusat Bahasa Isyarat Indonesia) ingin mengajak Healthy People untuk belajar bahasa isyarat. \n \n" +
                            "Tertarik belajar lebih jauh tentang bahasa Isyarat? Kirim Email kamu ke gerkatinpusat@gmail.com ya .\n\n" +
                            "Yuk, mulai belajar bahasa isyarat!",
                    "https://i0.wp.com/mitv.ui.ac.id/wp-content/uploads/2018/12/pernik-bahasa-isyarat-youtube-thumbnail.jpg?zoom=1.5&resize=750%2C500"},

            {"Belajar Bahasa Isyarat Part 2 (Angka, Hari, Hubungan Manusia & Keluarga)",
                    "HaiDokter",
                    "haiDokter bekerja sama dengan GERKATIN (Gerakan untuk Kesejahteraan Tunarungu Indonesia) dan PUSBISINDO (Pusat Bahasa Isyarat Indonesia) mempersembahkan video bahasa isyarat bagian kedua tentang angka, hari, hubungan manusia, dan keluarga.\n" +
                            "\n" +
                            "\n" +
                            "Yuk, mulai belajar bahasa isyarat!",
                    "https://i.ytimg.com/vi/mJvS1Geo6gc/maxresdefault.jpg"},

            {"Vlog Pertama. Ayo Belajar Bahasa Isyarat (BISINDO) | Sub indo",
                    "Kirana Salsabila",
                    "Keterangan :\n" +
                            "Untuk Indonesia, ada dua sistem bahasa isyarat yang berlaku, yaitu Bahasa Isyarat Indonesia (BISINDO) dan Sistem Isyarat Bahasa Indonesia (SIBI)",
                    "https://www.ypedulikasihabk.org/storage/2018/11/sign-language.jpg"},

            {"Social Experiment - Cara Ngobrol Sama Teman Tuli",
                    "Kitabisa com",
                    "Kami mengundang enam orang tanpa memberi tahu kalau mereka akan ngobrol dengan Teman Tuli. Bagaimana reaksi mereka ngobrol pertama kali dengan Teman Tuli? Cara apa yang mereka lakukan untuk bisa berkomunikasi?\n" +
                            "\n" +
                            "Kamu bisa ikut memperjuangkan hak-hak masyarakat Tuli di Indonesia. Mulai dengan cara ikut donasi untuk memberangkatkan Udana dan Yusi (dua anak Tuli hebat) mewakili Indonesia ke Children Camp - World Federation Deaf Youth Section (WFDYS) di Argentina. Udana dan Yusi akan jadi wakil Indonesia pertama sejak konferensi Tuli internasional tersebut digelar tahun 1987. ",
                    "https://i.ytimg.com/vi/s4W10a6OmCI/maxresdefault.jpg"},

            {"DAVLOG #11, Bahasa Isyarat Bisindo Sehari-hari..",
                    "Sign for Daily",
                    "BISINDO merupakan bahasa isyarat yang muncul secara alami dalam budaya Indonesia dan praktis untuk digunakan dalam kehidupan sehari-hari sehingga BISINDO memiliki beberapa variasi di tiap daerah. \n" +
                            "\n" +
                            "BISINDO yang telah digunakan sebagai keseharian oleh teman tuli mengandung kosa isyarat yang simbolis. Selama makna dari sebuah kata terwakili, maka kosa isyarat yang sederhana dari BISINDO sudah cukup. ",
                    "https://www.ypedulikasihabk.org/storage/2018/11/infografis-bhs-isyarat-4-768x768.jpg"},
    };

    public static ArrayList<ExploreVideo> getListData(){
        ArrayList<ExploreVideo> list = new ArrayList<>();
        for (String[] aData : data) {
            ExploreVideo exploreVideo = new ExploreVideo();
            exploreVideo.setNama(aData[0]);
            exploreVideo.setAsal(aData[1]);
            exploreVideo.setIsi(aData[2]);
            exploreVideo.setPhoto(aData[3]);
            list.add(exploreVideo);
        }
        return list;
    }
}
