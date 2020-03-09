package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // Latihan deret fibonacci ( for )
        Scanner userInput;
        int fn=1,fn1=1,fn2=0,n;
        userInput = new Scanner(System.in);

        System.out.print("Masukan nilai n : ");
        n = userInput.nextInt();

        for(int i=1; i <= n; i++){
            System.out.println("deret fibonacci ke-"+ i + " Adalah : "+fn);
            fn=fn1+fn2;
            fn2=fn1;
            fn1=fn;
        }

    }

}
