package com.tutorial;


// class polos tanpa constructor
class Polos{
    String nama;
    String NIM;
    String jurusan;
}

//class dengan menggunakan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class App {
    public static void main(String[] args){

        Mahasiswa mahasiswa1 = new Mahasiswa("Fachrul","123","Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ariestyan","321","Informatika");


        // Polos objectPolos = new Polos();
        // objectPolos.nama = "Fachrul";
        // objectPolos.NIM = "123";
        // objectPolos.jurusan = "Informatika";

        // System.out.println(objectPolos.nama);
        // System.out.println(objectPolos.NIM);
        // System.out.println(objectPolos.jurusan);

    }
}