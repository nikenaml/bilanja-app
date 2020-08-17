package com.example.bilanjaapp.model;

import java.util.ArrayList;

public class ExploreGambarData {
    private static String[][] data = new String [][]{
            {"Kami Menyukai Pisang",
                    "popdhh.ca-British Columbia" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Kami Menyukai Pisang. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-KRCmZvXiFPs/Xgcc1MLHMyI/AAAAAAAATjo/nf2LGWa_5qceWQETz1-JmYDzbqWBGXNUQCLcBGAsYHQ/s1600/1.png"},

            {"Kami Menyukai Apel",
                    "popdhh.ca-British Columbia" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Kami Menyukai Apel. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-4jnjmLXDtgk/Xgcc4yFr9vI/AAAAAAAATkY/-ZUFqkU-f2o8OGb4fv-MlYe38Ub13lAPACLcBGAsYHQ/s1600/2.png"},

            {"Kami Menyukai Jeruk",
                    "popdhh.ca-British Columbia" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Kami Menyukai Jeruk. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-0MgIxP72O30/Xgcc86a9SrI/AAAAAAAATlA/E3CymSSxJHIb7ZuDWQ7eKBoO0a9l6BXGgCLcBGAsYHQ/s1600/3.png"},

            {"Kami Menyukai Telor",
                    "popdhh.ca-British Columbia" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Kami Menyukai Telor. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-U98u12seOK4/Xgcc-CV4CyI/AAAAAAAATlI/U27crkJCI18yxMbyEY-rn5afCad3IflJwCLcBGAsYHQ/s1600/5.png"},

            {"Bahasa Isyarat untuk pakaian Dress",
                    "ASLhi.com" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Baju Dress. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-vJjoKt4zG4U/XgcdATzId0I/AAAAAAAATlU/G-Ze2kr_4WMvRbhFTK8a3I6p-TInZvG-QCLcBGAsYHQ/s1600/8.png"},

            {"Saya ingin membeli Jaket",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Saya ingin membeli Jaket. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-f9Mo-t49W9Q/Xgcc2Rg3meI/AAAAAAAATj0/yu3BYVdIbXslPfgBLXwfH1fE47oMpotugCLcBGAsYHQ/s1600/14.png"},

            {"Berapa banyak???",
                    "BSL Centre Preston",
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti menanyakan sebuah jumlah atau kuantiti yaitu Berapa Banyak. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-fsm7UVD8oI8/Xgcc3cI6L5I/AAAAAAAATkA/3InD4bm1VLEWnlHsyf_6L46yId8p6RC4QCLcBGAsYHQ/s1600/17.png"},

            {"Credit/Debit Card",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Kartu Credit. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-VhCmzzR-2aY/Xgcc3gAnsBI/AAAAAAAATkE/dl7dGcOj4ioD99XKwQcOKmUvJmdmLBNpACLcBGAsYHQ/s1600/18.png"},

            {"Baju",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Baju. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-_gO7Q1Lx1hc/Xgcc6FMl5vI/AAAAAAAATkg/UNgPERmyuy0W6KlhIIeDyjXI_tjKlzcUACLcBGAsYHQ/s1600/23.png"},

            {"Cashier",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Kasir. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-csQ2C2ELq2c/Xgcc7F8Ys_I/AAAAAAAATks/PhwRuzfBStcobFDKbQCoSvlL89VE2QsKwCLcBGAsYHQ/s1600/26.png"},
///------------------
            {"Department Store",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Gedung Pertokoan. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-vUYCMIUkWa4/Xgcc5aGx4hI/AAAAAAAATkc/1pYSYvZoquwyzgavuJXAVQapD3Jwus-DgCLcBGAsYHQ/s1600/22.png"},

            {"Expensive",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Mahal. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-kMO5rp7DC8c/Xgcc8K-xRyI/AAAAAAAATk4/HBeT4VFglfcDXo3TtB_N-E7hO_JeUKDrgCLcBGAsYHQ/s1600/29.png"},

            {"Cheap",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Murah. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-0MgIxP72O30/Xgcc86a9SrI/AAAAAAAATlA/E3CymSSxJHIb7ZuDWQ7eKBoO0a9l6BXGgCLcBGAsYHQ/s1600/30.png"},

            {"Antrian",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Antrian dalam melakukan pembayaran dalam sebuah perbelanjaan. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-8y4q8Tqrvto/Xgcc6upRnBI/AAAAAAAATkk/IRgbuqYX4vI1jbiO68j8L47R_ZlwnsfQgCLcBGAsYHQ/s1600/24.png"},

            {"Bisakah anda memperlihatkan beberapa topi???",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti untuk menanyakan suatu barang seperti topi kepada pelayan dengan cara barang tersebut ditunjukkan. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-pZd8q9U6Hao/Xgcc0jOlnkI/AAAAAAAATjk/85JbNkiER3UFEsDDZL_7btXmnN2iKIrqgCLcBGAsYHQ/s1600/12.png"},

            {"Anting",
                    "ASLhi.com" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti perhiasan (Anting). \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-Lw2qldcWa28/Xgcc1okj65I/AAAAAAAATjw/EktuKHl8pBc3yofAahbNaP6Wo9cZD2LWACLcBGAsYHQ/s1600/10.png"},

            {"Label Harga",
                    "BSL Centre Preston",
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti label harga yang berisi harga harga dari barang tersebut. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-7OyA03hUdwU/Xgcc798q5XI/AAAAAAAATk0/aytjEAKunPA5onMlabBcxyZsRzpq_wpRwCLcBGAsYHQ/s1600/28.png"},

            {"Sweater",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Sweater. Sweater merupakan baju panjang berbahan hangat yang tebal dan biasanya digunakan saat musim dingin. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-8iBv3Y9qBTk/Xgcc1ieT-fI/AAAAAAAATjs/HiAQkyM5guoepnYU_eM6iWglzL8PjVB9QCLcBGAsYHQ/s1600/13.png"},

            {"Trolli",
                    "BSL Centre Preston" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Trolli atau tempat untuk menaruh barang bawaan, troli dapat digambarkan sebagai keranjang kotak untuk menaruh barang. \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/--6vnUX2aWd8/Xgcc61isiII/AAAAAAAATko/3AyNaTcKqIQo1H-izLY67bEnF7TQA67VgCLcBGAsYHQ/s1600/25.png"},

            {"Gratis (Free)",
                    "studysignlanguage.com" ,
                    "Bahasa isyarat untuk berbelanja, yaitu memiliki arti Gratis atau Free (tidak membayar). \n \n" +
                            "Bahasa isyarat ini digunakan untuk memenuhi kebutuhan kaum disabilitas dalam melakukan perbelanjaan baik di warung atau supermarket maupun di gedung pertokoan.",
                    "https://1.bp.blogspot.com/-2nzd8nFRiV4/XgczkSPXKLI/AAAAAAAATmE/zRFaeh6azPIcWV66DtOtaE_yUccAefTCACEwYBhgL/s1600/31.png"},
    };

    public static ArrayList<ExploreGambar> getListData(){
        ArrayList<ExploreGambar> list = new ArrayList<>();
        for (String[] aData : data) {
            ExploreGambar exploreGambar = new ExploreGambar();
            exploreGambar.setNama(aData[0]);
            exploreGambar.setAsal(aData[1]);
            exploreGambar.setIsi(aData[2]);
            exploreGambar.setPhoto(aData[3]);
            list.add(exploreGambar);
        }
        return list;
    }
}
