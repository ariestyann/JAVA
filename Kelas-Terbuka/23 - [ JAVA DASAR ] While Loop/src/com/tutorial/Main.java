package com.tutorial;

public class Main {
    public static void main(String[] args){
        // While loop
        int a = 0;
        boolean kondisi=true;

        System.out.println("Awal program");
        while(kondisi){
            System.out.println("Nilai a : "+a);
            a++;
            if(a==10){
                kondisi = false; // ini adalah salah satu cara untuk menghentikan sebuah while loop
            }
        }
    }
}
