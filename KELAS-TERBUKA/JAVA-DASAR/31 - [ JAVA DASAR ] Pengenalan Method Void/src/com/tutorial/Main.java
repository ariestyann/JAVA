package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Method Void dengan Return
        System.out.println(simple());
        fungsiVoid("waduu kita bisa memasukan apapun disini ");
        selamatPagi("Mama");
        selamatPagi("Papa");
        selamatPagi("Ndutt");
        selamatPagi("Badung");
    }

    private static float simple(){
        return 10.0f;
        //klo return itu berarti sebuah fungsi yang di dalamnya ada proses hitungan
        // kalo void tidak hanya melakukan kegiatan atau aksi biasa
        //simple nya printed text ke console
    }

    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi ");
    }
}
