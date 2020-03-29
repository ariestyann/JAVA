package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Latihan fungsi, Menghitung Dan Menggambar
        Scanner userInput = new Scanner(System.in);
        int inputPanjang, inputLebar;

        System.out.print("Masukan nilai panjang : ");
        inputPanjang = userInput.nextInt();
        System.out.print("Masukan nilai lebar : ");
        inputLebar = userInput.nextInt();
        tampilkanGambar(inputPanjang,inputLebar);
        tampilkanKelilingDanLuas(inputPanjang, inputLebar);
    }
    private static void tampilkanKelilingDanLuas(int panjang, int lebar){
        // ini contoh untuk memakai kembali fungsi yang ada
        System.out.println("Menghitung luas : "+luas(panjang, lebar));
        System.out.println("Menghitung keliling : "+keliling(panjang, lebar));
    }
    private static int keliling(int panjang, int lebar){
        int hasil;
        hasil = ( panjang + lebar ) * 2;
        return hasil;
    }
    private static int luas(int panjang, int lebar){
        int hasil;
        hasil = panjang * lebar;
        return hasil;
    }
    private static void tampilkanGambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("X ");
            }
            System.out.print("\n");
        }
    }

}
