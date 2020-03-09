package com.latihan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Latihan menjumlahakan antara kedua array
        int[] angkaArray1 = {1,3,5,6,10};
        int[] angkaArray2 = {3,2,5,6,20};
        int[] angkaArrayHasil = new int[angkaArray1.length];

        for(int i = 0; i < angkaArray1.length; i++){
        angkaArrayHasil[i] = angkaArray1[i] + angkaArray2[i];
        }
        System.out.println("Array 1 : "+ Arrays.toString(angkaArray1));
        System.out.println("Array 2 : "+ Arrays.toString(angkaArray2));
        System.out.println("Array hasil : "+ Arrays.toString(angkaArrayHasil));


    }
}
