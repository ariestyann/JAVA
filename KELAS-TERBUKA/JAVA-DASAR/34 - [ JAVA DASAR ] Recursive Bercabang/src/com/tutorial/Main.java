package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //Recursive bercabang adalah sebuah metode untuk memakai berkali kali fungsi dirinya sendiri
        // contoh untuk hal ini adalah marge sort dan fibonacci
        // recursive ini sebuah metode yang sangat tidak efisien ketika menggunakan sebuah angka berpola yang banyak
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int nilai = userInput.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("Fibonacci ke-"+nilai+" adalah : "+nilai_fibonacci);

    }

    private static int fibonacci(int n, String daun){
        System.out.println("daun"+daun);
        System.out.println("fibonacci ke-"+n);
        if(n==1||n==0){
            return n; // return nilai n itu sendiri
        }else{
            return fibonacci(n-1,"kiri") + fibonacci(n-2,"kanan");
        }
    }
}
