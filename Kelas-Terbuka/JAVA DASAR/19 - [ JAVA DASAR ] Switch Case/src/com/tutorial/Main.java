package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //Switch Case : adalah sebuah kondisi yang menangkap satuan tipe data tidak seperti if yang hanya boolean
        Scanner userInput = new Scanner(System.in);
        String input;

        System.out.print("Masukan nama murid : ");
        input = userInput.next(); //kalo string cukup menggunakan method next
        switch(input){
            case "parul":
                System.out.println(input + " Hadir boss!!");
                break; // ini agar jika case true maka keluar dari switch case
            case "aries":
                System.out.println(input + " Hadir boss!!");
                break;
            default: //ini tu sama kaya else ya nilai defaultnya lah kalo ga ada di pilihan
                System.out.println(input + " Tidak hadir boss!!");
        }
        System.out.println("Program selesai");
    }
}
