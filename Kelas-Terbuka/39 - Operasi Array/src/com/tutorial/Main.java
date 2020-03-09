package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Operasi pada array
        int[] angkaArray1 = {1,2,3,4,5};

        //merubah array menjadi string
        printArray(angkaArray1);

        //mengkopi array agar addressnya tidak sama
        System.out.println("\nMengkopi Array\n===================");
        int[] angkaArray2 = new int[5];
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray2);
        System.out.println(angkaArray2);

        //mengkopi array dengan looping
        System.out.println("\nMengkopi Array dengan looping");
        for(int i = 0; i < angkaArray1.length; i++){
            angkaArray2[i]=angkaArray1[i];
        }
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray2);
        System.out.println(angkaArray2);

        //mengkopi array dengan copyOf yaitu sebuah fungsi yang ada di library arrays
        System.out.println("\nMengkopi Array dengan copyOf");
        int[] angkaArray3 = Arrays.copyOf(angkaArray1, 5);
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray3);
        System.out.println(angkaArray3);

        //mengkopi array dengan copyOfRange jadi kita bisa bisa menaruh dari mana yang akan kita copy
        // dan dimana batasny
        System.out.println("\nMengkopi Array dengan copyOfRange");
        int[] angkaArray4 = Arrays.copyOfRange(angkaArray1,3,5);
        //kalo to(5) itu batas akhirnya ga di ambil
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray4);
        System.out.println(angkaArray4);

        System.out.println("\nFill array\n===================");
        // ini digunakan ketika kita ingin membuat array yang panjang dengan nilai yang sama
        int[] angkaArray5 = new int[10];
        Arrays.fill(angkaArray5, 1);
        printArray(angkaArray5);

        System.out.println("\nKomparasi array\n===================");
        int[] angkaArray6 = {1,2,3,4,5};
        int[] angkaArray7 = {1,2,3,4,5};
        printArray(angkaArray6);
        printArray(angkaArray7);

        System.out.println("\nKomparasi array dengan equals");
        System.out.println(Arrays.equals(angkaArray6,angkaArray7)); // ini hasilnya boolean
        if(Arrays.equals(angkaArray6,angkaArray7)){
            System.out.println("Nilai sama");
        }else{
            System.out.println("Nilai tidak sama");
        }

        System.out.println("\nKomparasi array compare"); // ini hasilnya integer
        // jika yang keluar hasilnya 1 maka angkaArray6 lebih besar dari angkaArray7
        // jika -1 maka angkaArray7 lebih besar dari angkaArray6
        // jika 0 maka tidak ada yang lebih besar nilai sebanding
        System.out.println(Arrays.compare(angkaArray6,angkaArray7));

        System.out.println("Komparasi array mismatch"); // ini array yang membandingkan tiap index
        // yang di keluarkan adalah sesuai index yang berbeda
        // jika yang keluar -1 maka tidak ada indekks yang berbeda
        System.out.println(Arrays.mismatch(angkaArray6,angkaArray7));

        System.out.println("\nSort Array\n==================="); // pada saat array random
        //dan kita mau mencari berdasarkan angka maka langkah pertama harus di sort terlebih dahulu
        int[] angkaArray8 = {1,3,6,4,7,9,3,8};
        printArray(angkaArray8);
        Arrays.sort(angkaArray8);
        printArray(angkaArray8);

        System.out.println("\nArray searchBinary\n===================");
        //sepertinya kalo angkanya double angka pertama yang di ambil
        int angka = 3;
        int posisi = Arrays.binarySearch(angkaArray8, angka);
        System.out.println("Angka "+angka+" ada pada posisi indeks ke- "+posisi);
    }
    private static void printArray(int[] dataArray){
        System.out.println("Array = "+Arrays.toString(dataArray));
    }
}
