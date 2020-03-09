package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // If Else Statement
        Scanner userInput = new Scanner(System.in);
        int a;

        System.out.print("Masukan nilai a = ");
        a = userInput.nextInt();
        if(a == 5){
            System.out.println("Nilai yang dimasukan BENAR");
        }
        else{
            System.out.println("Nilai yang dimasukan SALAH");
        }
        System.out.println("Program SELESAI");
    }
}
