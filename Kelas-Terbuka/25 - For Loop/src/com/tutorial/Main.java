package com.tutorial;

public class Main {
    public static void main(String[] args){
        //for loop adalah sebuah looping yang explicit artinya semua inisialisasi,kondisi,dan step nilai di jabarkan
        System.out.println("Awal program");
        System.out.println("Looping pertama");
        for(int nilai = 0; nilai <= 10; nilai++){
            System.out.println("Nilai for : "+nilai);
        }

        System.out.println("Looping kedua");
        for(int nilai = 0; nilai < 10; nilai++){
            System.out.println("Nilai for : "+nilai);
        }

        System.out.println("Looping ketiga");
        for(int nilai = 10; nilai >= 5; nilai--){
            System.out.println("Nilai for : "+nilai);
        }

        System.out.println("Looping empat"); // ini adalah cara aneh
        int nilai = 0;
        for(; nilai <= 10;){
            System.out.println("Nilai for : "+nilai);
            nilai++;
        }
    }
}
