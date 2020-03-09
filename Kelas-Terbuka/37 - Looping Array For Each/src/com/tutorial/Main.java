package com.tutorial;

public class Main {
    public static void main(String[] args){
        int[] arrayAngka = {11,20,42,50,32};

        //array dengan looping standar
        System.out.println("array dengan looping standar");
        for(int i=0; i<5; i++){
            System.out.println("Array ke-"+i+" adalah : "+ arrayAngka[i]);
        }

        System.out.print("\n");

        //array dengan looping dengan properti array
        System.out.println("array dengan properti arrays");
        for(int i=0; i<arrayAngka.length; i++){
            System.out.println("Array ke-"+i+" adalah : "+ arrayAngka[i]);
        }

        System.out.print("\n");

        //array dengan looping dengan collection
        System.out.println("array dengan collection");
        for(int angka : arrayAngka){
            //menggunakan foreach jika index ke-n tidak perlu di print
            System.out.println("Ini adalah angka dengan nilai : " + angka);
        }
    }
}
