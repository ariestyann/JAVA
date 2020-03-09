package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //ini adalah if bersarang atau nested if

        Scanner userInput = new Scanner(System.in);
        int a, b;

        System.out.print("Masukan nilai a : ");
        a = userInput.nextInt();
        System.out.print("Masukan nilai b : ");
        b = userInput.nextInt();

        if(a == 5){
            if(b == 10){
                System.out.println("Ini artinya a = 5 dan b = 10");
            }else{
                System.out.println("Ini artinya a = 5 dan b bukan 10");
            }
        }else{
            System.out.println("Ini artinya a salah, maka kondisi yang lain langsung terskip");
        }

        System.out.println("Program selesai");
    }
}
