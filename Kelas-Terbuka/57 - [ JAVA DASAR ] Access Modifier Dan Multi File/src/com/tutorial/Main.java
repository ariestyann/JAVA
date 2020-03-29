package com.tutorial;
import kelasterbuka.util.Memasak;

public class Main {
    public static void main(String[] args) {
        Lain.methodPublic();
        //Lain.methodPrivate();
        Lain.methodDefault();
        Lain.methodProtected();
        Memasak.dagingPublic();

        //harus satu class
        //Memasak.dagingPrivate();

        //harus satu package
        //Memasak.dagingDefault();

        //harus satu package, dan satu subclass
        //Memasak.dagingProtected();
    }


}
