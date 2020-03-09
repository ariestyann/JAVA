package com.latihan;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // Mencoba Nested If
        Scanner userInput = new Scanner(System.in);
        int a, b, c;

        System.out.print("Masukan nilai a : ");
        a = userInput.nextInt();
        System.out.print("Masukan nilai b : ");
        b = userInput.nextInt();
        System.out.print("Masukan nilai c : ");
        c = userInput.nextInt();

        //if bersarang
        if(a==5){
            System.out.println("Ini adalah statement / aksi 1");
        }else{
                if(b==10){
                    System.out.println("Ini adalah statement / aksi 4");
                }else{
                    if(c==20){
                        System.out.println("Ini adalah statement / aksi 2");
                    }else{
                        System.out.println("Ini adalah statement / aksi 3");
                    }
                }
        }

    }
}
