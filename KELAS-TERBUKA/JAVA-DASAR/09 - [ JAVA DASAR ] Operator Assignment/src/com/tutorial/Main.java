package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operator assignment
        // untuk mempermudah menggunakan operator artimatika

        //Penjumlahan
        int a = 1;
        a += 10; // ini sama aja kaya a = a + 10
        System.out.println("Hasil penjumalahan assignment adalah = "+ a);

        //Pengurangan
        int b = 1;
        b -= 10;
        System.out.println("Hasil pengurangan assignment adalah = "+ b);

        //Perkalian
        int c = 5;
        c *= 10;
        System.out.println("Hasil perkalian assignment adalah = "+ c);

        //Pembagian
        int d = 9;
        d /= 3;
        System.out.println("Hasil pembagian assignment adalah = "+ d);

        //Modulus
        int e = 11;
        e %= 3;
        System.out.println("Hasil modulus assignment adalah = "+ e);
    }
}
