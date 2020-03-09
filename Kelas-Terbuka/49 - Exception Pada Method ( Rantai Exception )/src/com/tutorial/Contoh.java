package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Contoh {
    public static void main(String[] args)throws IOException {
        FileInputStream inputFile = new FileInputStream("input.txt");
        System.out.println((char)inputFile.read());
        //pake throws IOException bakal bener semua karna itu semua keturunan dari ioexception
        // ini seharusnya throws nya di ambil, jika ga di ambil maka ya errornya sama kayak error pas compailing
        System.out.println("Akhir dari program");
    }
}
