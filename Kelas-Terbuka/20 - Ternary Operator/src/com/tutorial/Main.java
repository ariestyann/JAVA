package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // Ternary Operator adalah cara untuk mempersingkat if else yang mudah
        // jadi lebih bagus dan enak di lihat
        // variable x = ekspresi/kondisi ? statement_true : statement_false;

        int input;
        float x;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan nilai x : ");
        input = userInput.nextInt();
        x = (input==10) ? (input*input) : (input/(float)2); // ini cara untuk castingnya kalo di taro di depan kagak bisa
        System.out.print("Maka hasil nya adalah : "+x);


    }

}
