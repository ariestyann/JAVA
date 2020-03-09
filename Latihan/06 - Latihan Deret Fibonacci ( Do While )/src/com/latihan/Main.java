package com.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Latihan deret fibonacci ( Do While )
        Scanner userInput;
        int fn=1,fn1=1,fn2=0,n,i=1;

        userInput = new Scanner(System.in);
        System.out.println("PROGRAM DERET FIBONACCI ( DO WHILE )");
        System.out.print("Masukan nilai n : ");
        n = userInput.nextInt();

        do{
            System.out.println("Deret fibonacci ke-"+i+" menjadi "+fn);
            fn=fn1+fn2;
            fn2=fn1;
            fn1=fn;
            i++;
        }while(i<=n);
    }
}
