package com.tutorial;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception {
        //instansiasi atau membuat object 
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Fachrul";
        mahasiswa1.NIM = "183112706450240";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 20;
        
        //panggil object baru
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        //instansiasi atau membuat object 
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Ariestyan";
        mahasiswa2.NIM = "183112706450241";
        mahasiswa2.jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 3.0;
        mahasiswa2.umur = 22;
        
        //panggil object baru
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
        
    }
}