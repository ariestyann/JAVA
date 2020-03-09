package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Pengenalan method atau fungsi
        int x,y;
        x = 5;
        y=hitung(x);
        System.out.println("x = "+x+", y = "+y);
    }
    static int hitung (int input){
        int hasil ;
        hasil = (input + 2) * input;
        return hasil; // ini harus sama tipe datanya
    }
    // jadi dia tu kek [y=f(n)=(y*2)+y]
}
