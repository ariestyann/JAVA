package com.latihan;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String namaPegawai;
        float gajiTotal=0, jamKerja, hasilGaji;

        panggilNamaPt();
        System.out.print("Masukan nama pegawai : ");
        namaPegawai = userInput.nextLine();
        System.out.print("Jam kerja dalam seminggu : ");
        jamKerja = userInput.nextInt();
        hasilGaji = prosesHitung(jamKerja,gajiTotal);
        System.out.printf("Nama pegawai: %1$s \nGaji pegawai perminggu: %2$,.0f",namaPegawai,hasilGaji);
    }
    private static void panggilNamaPt(){
        System.out.println("=================");
        System.out.println("PT. SUKSES MAKMUR");
        System.out.println("=================\n");
    }
    private static float prosesHitung(float jam, float gaji){
        if(jam <=40){
            gaji += (jam*8000);
        } else if(jam >=40 && jam<=60){
            gaji +=(jam*((1.5)*8000));
        }else{
            System.out.println("Waktu standar kerja 40 jam\nWaktu maksimal kerja 60 jam per minggu");
        }
        return gaji;
    }
}
