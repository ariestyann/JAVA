package com.latihan;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //Latihan looping dengan do while...
        Scanner userInput;
        int nilaiAwal, nilaiAkhir, total=0;

        userInput = new Scanner(System.in);

        System.out.println("PROGRAM LOOPING DENGAN DO WHILE");
        System.out.print("Masukan nilai awal : ");
        nilaiAwal = userInput.nextInt();
        System.out.print("Masukan nilai akhir : ");
        nilaiAkhir = userInput.nextInt();

        do{

            total += nilaiAwal; // ini tu sama kayak total = total + nilaiAwal
            System.out.printf("Nilai %d menjadi %d\n",nilaiAwal,total);
            nilaiAwal++;
        }while(nilaiAwal <= nilaiAkhir);

        System.out.println("Program Selesai");
    }
}
