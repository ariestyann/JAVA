package com.latihan;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] angkaArray = {2,4,5,1,10,30,7};
        int[] angkaArray2 = {2,3,29,43,541,30,7};
        int[] angkaArrayHasil = new int[angkaArray.length];
        System.out.println("\nSort Reverse ==========");
        System.out.println("Array : "+Arrays.toString(angkaArray));
        Arrays.sort(angkaArray);
        System.out.println("Array : "+Arrays.toString(angkaArray));

        angkaArrayHasil = Arrays.copyOf(angkaArray, angkaArray.length);

        for(int i = 0; i < angkaArrayHasil.length; i++ ){
            angkaArray[i] = angkaArrayHasil[(angkaArrayHasil.length - 1) -i]; // jadi (6 - 1) = (5-0) = 5
        }

        System.out.println("Array Reversed Sorted 1 : "+Arrays.toString(angkaArray));

        //kelebihan yang ini adalah lebih cepat dan tidak memerlukan array baru
        Arrays.sort(angkaArray2);
        int buffer;
        System.out.println("Array 2 : "+Arrays.toString(angkaArray2));
        for(int i = 0; i < angkaArray2.length/2; i++){
            buffer = angkaArray2[i];
            angkaArray2[i] = angkaArray2[(angkaArray2.length - 1)-i];
            angkaArray2[(angkaArray2.length - 1)-i] = buffer;
        }
        System.out.println("Array Reversed Sorted 2 : "+Arrays.toString(angkaArray2));

    }
}
