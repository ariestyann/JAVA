package com.tutorial;

public class Main {
    public static void main(String[] args){
        //Method overload adalah sebuah metode yang mana kita dapat menggunakan nama fungsi yang sama
        //dengan pola atau argumen yang berbeda.

        printAngka(13);
        printAngka(13.5f);
    }

    private static void printAngka(int angkaInteger){
        System.out.println("Ini adalah angka integer yaitu : "+angkaInteger);
    }
    private static void printAngka(float angkaFloat){
        System.out.println("Ini adalah angka Float yaitu : "+angkaFloat);
    }
}
