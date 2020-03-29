package com.tutorial;
import java.io.*;
import java.util.*;
import CRUD.Operation;
import CRUD.Utility;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        boolean isLanjutkan = true;
        String pilihanUser;

        while(isLanjutkan){
            Utility.clearScreen();
            System.out.println("=====================");
            System.out.println("DATABASE PERPUSTAKAAN");
            System.out.println("---------------------");
            System.out.println("[1]\tLihat Seluruh Buku");
            System.out.println("[2]\tCari Data Buku");
            System.out.println("[3]\tTambah Data Buku");
            System.out.println("[4]\tUbah Data Buku");
            System.out.println("[5]\tHapus Data Buku");
            System.out.println("---------------------");
            System.out.print("Menu yang dipilih : ");
            pilihanUser = terminalInput.next();
            switch (pilihanUser){
                case "1":
                    System.out.println("=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("-----------------");
                    Operation.tampilkanData();
                    break;
                case "2":
                    System.out.println("=========");
                    System.out.println("CARI BUKU");
                    System.out.println("---------");
                    Operation.cariData();
                    break;
                case "3":
                    System.out.println("================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("----------------");
                    Operation.tambahData();
                    Operation.tampilkanData();
                    break;
                case "4":
                    System.out.println("==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("--------------");
                    Operation.updateData();
                    break;
                case "5":
                    System.out.println("===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("---------------");
                    Operation.deleteData();
                    break;
                default:
                    System.out.print("Inputan yang dimasukan tidak ada!\nSilakan pilih menu [1-5]");
            }
            isLanjutkan = Utility.getYesOrNo("Apakah anda ingin melanjutkan");
        }
    }
}
