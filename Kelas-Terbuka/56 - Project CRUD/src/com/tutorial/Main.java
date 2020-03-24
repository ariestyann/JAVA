package com.tutorial;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        boolean isLanjutkan = true;
        String pilihanUser;

        while(isLanjutkan){
            clearScreen();
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
            System.out.println("=====================");
            switch (pilihanUser){
                case "1":
                    System.out.println("=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("-----------------");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("=========");
                    System.out.println("CARI BUKU");
                    System.out.println("---------");
                    cariData();
                    break;
                case "3":
                    System.out.println("================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("----------------");
                    break;
                case "4":
                    System.out.println("==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("--------------");
                    break;
                case "5":
                    System.out.println("===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("---------------");
                    break;
                default:
                    System.out.println("Inputan yang dimasukan tidak ada!\nSilakan pilih menu [1-5]");
            }
            isLanjutkan = getYesOrNo("Apakah anda ingin melanjutkan");
        }
    }
    private static void tampilkanData() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;
        int nomorData=0;

        try{
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch (Exception e){
            System.out.println("Database tidak ada\nTambah data buku terlebih dahulu");
            return;
        }
        System.out.print("===================================================================================================");
        System.out.println("\n| No | Tahun | Penulis                  | Penerbit     | Judul Buku                               |");
        System.out.println("|----+-------+--------------------------+--------------+------------------------------------------|");
        String data = bufferInput.readLine();
        while(data != null) {
            nomorData++;
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("| %-2d ", nomorData);
            System.out.printf("| %-5s ", stringToken.nextToken());
            System.out.printf("| %-24s ", stringToken.nextToken());
            System.out.printf("| %-12s ", stringToken.nextToken());
            System.out.printf("| %-40s |", stringToken.nextToken());
            System.out.print("\n");
            data = bufferInput.readLine();
        }
        System.out.println("===================================================================================================");
    }
    private static void cariData() throws IOException{
        //cek database ada atau tidak
        try {
            File file = new File("database.txt");
        }catch(Exception e){
            System.out.println("Database tidak ada\nTambah data buku terlebih dahulu");
            return;
        }

        //ambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("Masukan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        //kita cek keyword di database
        cekBukuDiDatabase(keywords);
    }

    private static void cekBukuDiDatabase(String[] keywords) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferReader = new BufferedReader(fileInput);
        String data = bufferReader.readLine();

        while(data != null){
            //cek keyword dalam keywords
            System.out.println(data);
            System.out.println(Arrays.toString(keywords));

            data = bufferReader.readLine();
        }

    }

    private static boolean getYesOrNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\n"+message+" [y/n]? ");
        String pilihanUser = terminalInput.next();
        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.out.println("Pilihan anda bukan y atau n");
            System.out.println("\n"+message+" [y/n]? ");
            pilihanUser = terminalInput.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
    }
    private static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch (Exception e){
            System.out.println("Tidak bisa clear screen");
        }
    }
}
