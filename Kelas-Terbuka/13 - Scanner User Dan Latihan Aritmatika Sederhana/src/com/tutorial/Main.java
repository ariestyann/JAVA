package com.tutorial;

import java.util.Scanner; // ini adalah library ketika kita menggunakan scanner
// artinya seperti ambilkan object scanner yang ada di folder utilitas yang ada di folder java

public class Main {
    public static void main(String[] args){
        //Mencoba Object Scanner dan method nextInt
        Scanner userInput = new Scanner(System.in); //yang ada didalam () artinya apa yang mau dia ambil.
        //System.in artinya mengambil data dari apa yang kita ketikan dalam console
        int panjang, lebar, tinggi, luas, volume;

        System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
        System.out.print("Masukan panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Masukan lebar = ");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang tersebut = " + luas);
        System.out.println("MENGHITUNG VOLUME PERSEGI PANJANG");
        System.out.print("Masukan tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.print("Volume persegi panjang tersebut = "+volume);

    }
}
