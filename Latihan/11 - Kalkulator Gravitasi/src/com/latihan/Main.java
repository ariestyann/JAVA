package com.latihan;

public class Main {
    public static void main(String[] args){
        /*
        x(t) = 0.5 x at^2 + Vit + xi
        menggunakan waktu benda terjatuh sekitar 10 detik
        keterangan :
        a = acceleration ( percepatan ) = -9.81 m/s ( gravitasi bumi )
        t = time ( waktu (seconds) ) = 10s
        v = initial velocity / kecepatan awal
        x = initial position / posisi awal

        jawaban yang benar adalah -490.5m
        */

        //deklarasi
        double a = -9.81;
        short t = 10;
        short v_0 = 0;
        short x_0 = 0;
        double x;

        //proses
        x = ((0.5 * (a*(t*t))) + (v_0*t) + x_0);

        //hasil
        System.out.println(x+" m");

        //output -490.5 m
    }
}
