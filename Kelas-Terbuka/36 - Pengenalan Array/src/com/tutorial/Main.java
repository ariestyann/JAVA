package com.tutorial;
import java.util.Arrays; //ini adalah sebuah library untuk array
public class Main {
    public static void main(String[] args){
        //assignment array
        int[] arrayInteger = {10,25,33,42,59};
        System.out.println("Array assignment");
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);
        System.out.println(arrayInteger[4]);
        System.out.print("\n");

        //deklarasi array
        float[] arrayFloat = new float[3];
        arrayFloat[1] = 13;
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.print("\n");

        System.out.println(Arrays.toString(arrayInteger)); // fungsi untuk memanggil array
    }
}
