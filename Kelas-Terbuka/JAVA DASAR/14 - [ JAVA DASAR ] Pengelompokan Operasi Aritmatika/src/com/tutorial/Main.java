package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Kesimpulannya adalah
        //Perkalian atau pembagian akan dilakukan terlebih dahulu
        //perkalian dan pembagian setara maka dari kiri ke kanan
        //penjumlahan dan perngurangan adalaah setara juga

        int  hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        //Menggunakan pengelompokan operasi dengan (  )
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int y, m, x, c;
        Scanner userInput = new Scanner(System.in);
        System.out.print(" Nilai x = ");
        x = userInput.nextInt();
        System.out.print(" Gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        y = (m * x * x) + c; // tanda ( ) agar pembaca dapat lebih mudah mengerti
        System.out.print("Maka hasil persamaan kuadrat adalah = " + y);
    }
}
