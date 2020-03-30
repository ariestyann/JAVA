package com.tutorial;
import java.util.*;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String kalimat = "Saya suka makan pisang";
        System.out.println(kalimat);

        pesan("charAt");
        System.out.println(kalimat.charAt(5)); // ini untuk menggambil komponen pada string

        pesan("subString");
        String kata = kalimat.substring(10,15);
        System.out.println(kata);

        pesan("concat / concatenation");
        String kalimat2 = " bakwan";
        System.out.println(kata + kalimat2);
        kata +=" cireng"; // kata = kata + " cireng"
        System.out.println(kata);

        pesan("concat / concatenation non string(casting)");
        int jumlah = 20;
        String kalimat3 = kata +" "+ jumlah; // ini tu dasarnya
        System.out.println(kata +" "+ jumlah); // ini cara praktisinya disini juga pake casting

        pesan("toUppercase dan toLowercase");
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        pesan("replace");
        System.out.println(kalimat.replace("pisang","combro"));

        pesan("compareTo / membandingkan abjad dari string");
        // jika saa dia akan menggeser lalu membandingkan lagi
        String abjad1 = "abc";
        String abjad2 = "ace";
        System.out.println(abjad1.compareTo(abjad2));

        pesan("equals");
        // jika string yang di gunakan berada pada satu tempat maka itu true
        String kataInput = "test"; // kata ini ada di string pool
        String kataTest = "test"; // kata ini ada di string pool
//        String kataTest = new String("test"); // ini bukan string literal,
        // dan bukan ada di memory string pool

        System.out.println("\npersamaan pada lokasi string pool");
        if(kataInput==kataTest){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }

        Scanner userInput = new Scanner(System.in); // ini ada di memory heap
        System.out.print("\nmengambil input string dari user: ");
        kataInput = userInput.next(); // ini kalo ambil input dari string : memory heap
        System.out.println("Ini adalah input user: "+kataInput);

        if (kataInput.equals(kataTest)){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
    }
    private static void pesan(String pesan1){
        System.out.println("\nIni menggunakan operasi : "+pesan1);
    }
}
