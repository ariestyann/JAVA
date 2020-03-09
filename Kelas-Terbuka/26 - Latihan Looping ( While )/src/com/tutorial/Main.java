package com.tutorial;
import java.util.*;

public class Main {

    public static void main(String[] args){
        //Latihan looping dengan while
        Scanner userInput;
        int nilaiAwal, nilaiAkhir, total=0;

        userInput = new Scanner(System.in);
        System.out.println("PROGRAM LOOPING WHILE");
        System.out.print("Masukan nilai awal : ");
        nilaiAwal = userInput.nextInt();
        System.out.print("Masukan nilai akhir : ");
        nilaiAkhir = userInput.nextInt();

        //looping while
        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.printf("Nilai %d menjadi = %d\n",nilaiAwal,total);
            nilaiAwal++;
        }
        System.out.println("Program Selesai");

    }

}
