package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int a;

        System.out.print("Masukan nilai a = ");
        a = userInput.nextInt();
        if(a == 5){ // ini merupakan ekspresi
            // jika kondisi pertama sudah benar maka kondisi yang lain di skip
            System.out.println("Ini merupakan aksi ke 1"); // ini adalah aksi
        } else if(a == 10){
            System.out.println("Ini merupakan aksi ke 2");
        } else{
            System.out.println("Ini merupakan aksi default ");
        }
        System.out.println("Program selesai");
    }
}
