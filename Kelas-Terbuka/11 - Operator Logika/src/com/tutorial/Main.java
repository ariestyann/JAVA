package com.tutorial;

public class Main {
    public static void main(String[] args){
        //Operator logika adalah operator yang di gunakan pada tipe data boolean
        boolean a,b,c;

        System.out.println("===============OR(||) / ditambah");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + "||" + b + "=" + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + "||" + b + "=" + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + "||" + b + "=" + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + "||" + b + "=" + c);

        System.out.println("===============AND(&&) / dikali");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + "&&" + b + "=" + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + "&&" + b + "=" + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + "&&" + b + "=" + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + "&&" + b + "=" + c);

        System.out.println("===============XOR(^) / yang berbeda saja yang menghasilkan true");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + "^" + b + "=" + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + "^" + b + "=" + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + "^" + b + "=" + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + "^" + b + "=" + c);

        System.out.println("===============NOT(!) / Negasi");
        a = false;
        System.out.println(a + " + (!) = " + !a);
        b = true;
        System.out.println(b + " + (!) = " + !b);
    }
}
