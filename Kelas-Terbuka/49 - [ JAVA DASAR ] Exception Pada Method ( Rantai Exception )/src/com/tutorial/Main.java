package com.tutorial;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] arrayData = {0,1,2,3};

        System.out.print("data ke-");
        int indexInput = userInput.nextInt();

        // exception biasa
        System.out.println("Exception biasa\n");
        try{
        System.out.printf("data dari array ke-%d adalah %d\n\n",indexInput,arrayData[indexInput]);
        }catch (Exception e){
            System.err.println("salah"); // ("isi disini") bisa juga
        }

        // exception di dalam fungsi
        System.out.println("Exception didalam fungsi");
        int data = ambilDataDariArray(arrayData,indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n\n",indexInput,data);

        // exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try{
            data2 = ambilData(arrayData, indexInput);
        }catch(Exception e){
            System.err.println("salahhhh");
        }
        System.out.printf("data dari array ke-%d adalah %d\n\n",indexInput,data2);

        System.out.println("Akhir dari program");
    }
    private static int ambilData(int[] array, int index)throws Exception{
        // akan menghasilkan exception di tempat yang memanggilnya
        int hasil = array[index];
        return hasil;
    }
    private static int ambilDataDariArray(int[] array, int index){
        int hasil = 0;
        try{
            hasil = array[index];
        }catch (Exception e){
            System.err.println("salah"); // ("isi disini") bisa juga
        }
        return hasil;
    }
}
