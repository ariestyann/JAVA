package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //JADI RECURSIVE ITU UNTUK SESUATU YANG BERTAHAP
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = userInput.nextInt();
        printNilai(nilai);
        System.out.print("\n");
        int jumlah = hitungNilai(nilai);
        System.out.println("Jumlahnya adalah : "+jumlah);
        System.out.print("\n");
        int jumlahFaktorial = faktorialNilai(nilai);
        System.out.println("Jumlahnya adalah : "+jumlahFaktorial);

    }

    private static int faktorialNilai(int parameter){
        System.out.println("Hitung nilai = "+parameter);
        if(parameter==1){ //if disini tu sebagai batasan
            return parameter;// jika nilai parameter 0 maka kembalikan ke printNilai
        }
        return parameter * faktorialNilai(parameter-1);
    }

    private static int hitungNilai(int parameter){
        System.out.println("Hitung nilai = "+parameter);
        if(parameter==0){ //if disini tu sebagai batasan
            return parameter;// jika nilai parameter 0 maka kembalikan ke printNilai
        }
        return parameter + hitungNilai(parameter-1);
    }

    private static void printNilai(int parameter){
        System.out.println("Nilai = "+parameter);
        if(parameter==0){ //if disini tu sebagai batasan
            return;// jika nilai parameter 0 maka kembalikan ke printNilai
        }
        parameter--;
        printNilai(parameter);
    }
}
