package com.latihan;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] angkaArray1 = {1,2,3,4,5};
        int[] angkaArray2 = {6,7,8,9,10,11};
        int[] angkaArrayHasil = new int[angkaArray1.length+angkaArray2.length];

        for(int  i = 0; i < angkaArray1.length; i++){
            angkaArrayHasil[i] = angkaArray1[i];
        }
        for(int i = 0; i <angkaArray2.length; i++){
            angkaArrayHasil[i + angkaArray1.length] = angkaArray2[i]; //agar di cetak setelah angkaArray1
        }
        System.out.println(Arrays.toString(angkaArrayHasil));
    }
}
