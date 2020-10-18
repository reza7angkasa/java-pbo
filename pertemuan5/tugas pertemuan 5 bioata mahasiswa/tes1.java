package com.company;
class tes1 {
    private int nim;
    private String namalengkap;
    private String jurusan;
    private int angkatan;

    public void setNim(int nim){
        this.nim = nim;
    }

    public void setNamalengkap(String namalengkap){
        this.namalengkap = namalengkap;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setAngkatan(int angkatan){
        this.angkatan = angkatan;
    }

    public int getNim(){
        return this.nim;
    }

    public String getNamalengkap(){
        return this.namalengkap;
    }
    public String getJurusan(){
        return this.jurusan;
    }
    public int getAngkatan(){
        return this.angkatan;
    }
}
