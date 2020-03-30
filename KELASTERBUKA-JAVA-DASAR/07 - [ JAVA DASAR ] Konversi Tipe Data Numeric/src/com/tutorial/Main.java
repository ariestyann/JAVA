package com.tutorial;

public class Main {
    public static void main(String[] args){
        //Konversi tipe data

        int nilaiInt = 14; //32-bit
        System.out.println("Nilai int = "+ nilaiInt);

        // Memperluas rentang tipe data ke yang lebih besar akan otomatis
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

        //Memperkecil rentang ke tipe data yang lebih kecil, tapi akan bermasalah ketika
        //melewati batas max atau min dari tipe datanya
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = "+ nilaiByte);
        System.out.printf("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);

        //Casting pembagian terdapat 2 cara dalam casting
        //1. ubah salah satu dari nilai deklarasi
        int a = 10;
        float b = 4;
        float c = a/b;
        System.out.printf("%d / %f = %f\n",a,b,c);
        //2. konvert dengan casting ini adalah cara paling amans
        int x = 10;
        int y = 4;
        float z = (float)x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
