package com.tutorial;

class Mahasiswa{
    // data member
    String nama;
    String NIM;
    // constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM; //biar bisa pake variable diatas
    }
    //method tanpa return dan tanpa parameter
    void Show(){
        System.out.println("Nama: "+this.nama);
        System.out.println("NIM: "+this.NIM);
    }
    //method tanpa return dan parameter
    void setNama(String nama){
        this.nama = nama;
    }
    //method return dan tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    //method return dan parameter
    String sayHiS(String message){
        return message +" juga, nama saya adalah "+ this.nama;
    }
}

public class Main {
    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","183112706450240");
        System.out.println(mahasiswa1.nama);
        mahasiswa1.Show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.Show();
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        String data = mahasiswa1.sayHiS("Hallo");
        System.out.println(data);
    }
}