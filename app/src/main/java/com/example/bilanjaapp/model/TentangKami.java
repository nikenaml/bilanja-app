package com.example.bilanjaapp.model;

public class TentangKami {
    private String nama;
    private String asal;
    private String isi;
    private String photo;

    public TentangKami(String nama, String asal, String isi, String photo) {
        this.nama=nama;
        this.asal=asal;
        this.isi=isi;
        this.photo=photo;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() { return asal; }

    public String getIsi() {
        return isi;
    }

    public String getPhoto() {
        return photo;
    }
}
