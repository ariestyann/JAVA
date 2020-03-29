package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args){
        int[] angkaArray1 = {1,2,3,4,5};
        int[] angkaArray2 = new int[5];

        System.out.println(angkaArray1); // addressnya berbeda
        System.out.println(angkaArray2); // addressnya berbeda

        angkaArray2 = angkaArray1; // addressnya jadi sama

        System.out.println(angkaArray1); // addressnya jadi sama
        System.out.println(angkaArray2); // addressnya jadi samaa

        System.out.println("Array 1 => "+ Arrays.toString(angkaArray1));
        System.out.println("Array 2 => "+ Arrays.toString(angkaArray2));

        angkaArray1[0] = 100;
        angkaArray2[4] = 400;

        ubahArray(angkaArray1);
        System.out.println("Array 1 => "+ Arrays.toString(angkaArray1));
        System.out.println("Array 2 => "+ Arrays.toString(angkaArray2));
    }

    // ini adalah method yang argumentnya reference, pass by reference
    // kalau array pass by reference
    // kalau tipe data primitive pass by value
    private static void ubahArray(int[] dataArray){
        dataArray[0] = 125;
    }
}
