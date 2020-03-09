package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //variable[baris][kolomg]
        //Cara membuat array dengan assignment
        int[][] angkaArray_2D = {
                {1,2},
                {3,4}
        };
        //Memanggil dengan (Array.deepToString)
        System.out.println("Print array multi dimensi dengan function===============");
//        System.out.println(Arrays.deepToString(angkaArray_2D));
        printArray2D(angkaArray_2D);

        System.out.println("\nPrint array multi dimensi dengan looping manual===============");
        //Cara membuat array dengan deklarasi
        int[][] angkaArray_2D_2 = new int[3][5]; // berarti barisnya 3 kolomnya ada 5
        //Memanggil dengan looping manual
        for(int i = 0; i < angkaArray_2D_2.length; i++){
            System.out.print("[");
            for(int j = 0; j < angkaArray_2D_2[i].length; j++){
                System.out.print(angkaArray_2D_2[i][j]+",");
            }
            System.out.print("]\n");
        }

        System.out.println("\nPrint array multi dimensi dengan looping foreach===============");
//        Memanggil dengan foreach
        //cara bacanya gini =
        // kita ambil dahulu array perbaris yang ada di angkaArray_2D
        // kemudian kita ambil angka yang ada didalam baris
        // cetak angka yang ada dibaris
        // jika satu baris sudah di cetak lalu akan di enter
        // ulangi lagi
        for(int[] baris:angkaArray_2D_2) {
            System.out.print("[");
            for (int angka : baris){
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }

        System.out.println("\nPrint array ragged tidak beraturan===============");
        //kenapa bisa ? karena array pada java menggunakan address sebagai membukus dari nilai array
        int[][] angkaArrayRagged = {{1,2,3},{4,5},{6}};
        printArray2D(angkaArrayRagged);
    }
    private static void printArray2D(int[][] dataArray){
        for(int i=0; i < dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i])); // cara mencetak dengan fungsi toString
        }
    }
}
