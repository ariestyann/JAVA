package com.tutorial;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder =  new StringBuilder("halo");
        printData(builder);
        pesan("append");
        builder.append(" semuanya");
        printData(builder);
        builder.append(" warga surabaya");
        printData(builder);
        pesan("insert");
        builder.insert(19, " kota");
        printData(builder);
        pesan("delete");
        builder.delete(19,24);
        printData(builder);
        pesan("setCharAt");
        builder.setCharAt(14,'W');
        printData(builder);
        pesan("replace");
        builder.replace(20,28,"bandung");
        printData(builder);
        pesan2("\ncasting String builder ke string biasa");
        //baru deh disini bisa menggunakan operasi string sebelumnya
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = "+Integer.toHexString(addressString));
    }
    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = "+dataBuilder);
        System.out.println("panjang = "+dataBuilder.length());
        System.out.println("kapasitas = "+dataBuilder.capacity());
        //jadi di builder sudah di sediakan sebuah tempat untuk string dengan kapasitas yang akan bertambah
        //seiring dengan bertambahnya data yang ada di string tersebut

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = "+Integer.toHexString(addressBuilder));
    }
    private static void pesan(String pesan1){
        System.out.println("\nOPERASI INI MENGGUNAKAN : "+pesan1.toUpperCase());
    }
    private static void pesan2(String pesan2){
        System.out.println(pesan2.toUpperCase());
    }
}
