package com.tutorial;

import java.util.*; //mengambi semua object dari folder util di folder java

public class Main {
    public static void main(String[] args){
        // membuat sebuah object untuk menangkap input dari user
        Scanner userInput = new Scanner(System.in);

        //sebuah program sederhana untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukan nilai tebakan anda : ");
        nilaiTebakan = userInput.nextInt();
        System.out.println("Nilai tebakan anda adalaha : " + nilaiTebakan);

        //operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda : "+ statusTebakan);

        //operasi aljabar boolean [and / or]
        System.out.println("Masukan nilai diantara 4 dan 9 : ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Tebakan anda : " + statusTebakan);
    }
}
