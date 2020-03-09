package com.latihan;
import java.util.*;
public class Main {
    public static void main(String[] args){
        //Membuat Kalkulator Sederhana
        Scanner userInput = new Scanner(System.in);
        int nilaiPertama, nilaiKedua, penjumlahan, pengurangan, perkalian;
        float pembagian;

        System.out.println("======PROGRAM KALKULATOR SEDERHANA======");
        System.out.print("Masukan nilai pertama : ");
        nilaiPertama = userInput.nextInt();
        System.out.print("Masukan nilai kedua : ");
        nilaiKedua = userInput.nextInt();

        //Proses Aritmatika
        penjumlahan = nilaiPertama + nilaiKedua;
        pengurangan = nilaiPertama - nilaiKedua;
        perkalian = nilaiPertama * nilaiKedua;
        pembagian = (float) nilaiPertama / nilaiKedua;

        System.out.println("======HASIL======");
        System.out.printf("Penjumlahan : %d\n", penjumlahan);
        System.out.printf("Pengurangan : %d\n", pengurangan);
        System.out.printf("Perkalian   : %d\n", perkalian);
        System.out.printf("Pembagian   : %f\n", pembagian);
    }
}
