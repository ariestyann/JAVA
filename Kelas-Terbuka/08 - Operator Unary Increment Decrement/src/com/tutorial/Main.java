package com.tutorial;

public class Main {
    public static void main(String[] args){

        // Operasi unary adalah operasi yang di gunakan pada satu variabel

        //unary + dan -
        int angka = 1;
        System.out.printf("Unary '+', %d menjadi %d\n",angka, +angka);
        System.out.printf("Unary '-', %d menjadi %d\n",angka, -angka);

        //unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.printf("Nilai dengan '++' menjadi = %d\n", angka2);

        int angka3 = 10;
        angka3--;
        System.out.printf("Nilai dengan '--' menjadi = %d\n", angka3);

        //unary boolean dengan tanda (!) atau bangsign untuk negasi
        boolean ucup = true;
        System.out.println("Nilai boolean = " + ucup );
        System.out.println("Nilai boolean = " + !ucup );

    }
}
