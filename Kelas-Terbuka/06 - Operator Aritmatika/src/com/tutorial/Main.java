package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operasi Aritmatika
        int variabel1 = 11;
        int variabel2 = 5;
        int hasil;

        //Penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);

        //Pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d\n",variabel1,variabel2,hasil);

        //Perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d\n",variabel1,variabel2,hasil);

        //Pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d\n",variabel1,variabel2,hasil);

        float a = 11;
        float b = 5;
        float hasilbagi = a / b;
        System.out.println(a +" / "+ b + " = "+ hasilbagi);

        //Modulus
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d\n",variabel1,variabel2,hasil);
    }
}
