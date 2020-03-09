package com.latihan;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //Latihan looping dengan for
        Scanner userInput;
        int nilaiAwal, nilaiAkhir, total=0;

        userInput = new Scanner(System.in);
        System.out.println("PROGRAM LOOPING DENGAN FOR");
        System.out.print("Masukan nilai awal : ");
        nilaiAwal = userInput.nextInt();
        System.out.print("Masukan nilai akhir : ");
        nilaiAkhir = userInput.nextInt();

        // looping for
        for(; nilaiAwal <= nilaiAkhir; nilaiAwal++){
            total += nilaiAwal;
            System.out.printf("Nilai %d menjadi %d\n",nilaiAwal,total);
        }
        System.out.println("Program selesai");
    }
}
