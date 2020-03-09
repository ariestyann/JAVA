package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // kalkulator sederhana menggunakan switch case
        // a operator b
        Scanner userInput;
        float a,b,hasil;
        String operator;

        userInput = new Scanner(System.in);

        System.out.print("Masukan nilai a :");
        a = userInput.nextFloat();
        System.out.print("Masukan operator :");
        operator = userInput.next();
        System.out.print("Masukan nilai b :");
        b = userInput.nextFloat();

        switch(operator){
            case "+":
                hasil = a + b;
                System.out.println(a+" + "+b+" = "+hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println(a+" - "+b+" = "+hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println(a+" * "+b+" = "+hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println(a+" / "+b+" = "+hasil);
                break;
            default:
                System.out.println("Operator ("+operator+") tidak ada" );
        }
        System.out.println("Program selesai");
    }
}
