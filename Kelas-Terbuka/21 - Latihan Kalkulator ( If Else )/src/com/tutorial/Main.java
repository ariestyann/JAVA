package com.tutorial;
import java.util.*;


public class Main {
    public static void main(String[] args){
        // a operator b
        // Kalkulator sederhana menggunakan if else

        float a,b,hasil;
        char operator;
        Scanner userInput;

        userInput = new Scanner(System.in);
        System.out.print("Masukan nilai a : ");
        a = userInput.nextFloat();
        System.out.print("Masukan Operator : ");
        operator = userInput.next().charAt(0);
        System.out.print("Masukan nilai b : ");
        b = userInput.nextFloat();

        if(operator=='+'){
            hasil = a + b;
            System.out.println(a+" + "+b+" = "+hasil);
        }else if(operator=='-'){
            hasil = a - b;
            System.out.println(a+" - "+b+" = "+hasil);
        }else if(operator=='*'){
            hasil = a * b;
            System.out.println(a+" * "+b+" = "+hasil);
        }else if(operator=='/'){
            if(b==0){
                System.out.println("Hasil pembagian dengan nilai 0 adalah tak terhingga");
            }else{
                hasil = a / b;
                System.out.println(a+" / "+b+" = "+hasil);
            }
        }else {
            System.out.println("Operator yang anda masukan salah");
        }
        System.out.println("Program Selesai");
    }
}
