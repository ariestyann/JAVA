package com.tutorial;

public class Main {
    public static void main(String[] args){
        // do while looping perbedanya dengan while looping adalah
        // do while melakukan aksinya di mainline dan minimal sekali di jalankan walaupun kondisi false
        // while melakukan aksinya di cabang

        int a = 0;
        boolean kondisi = true;

        System.out.println("Awal program berjalan");
        do{
            a++;
            System.out.println("Nilai do while : "+a);
            if(a==10){
                kondisi = false;
            }

        }while(kondisi);
        System.out.println("Akhir program");
    }
}
