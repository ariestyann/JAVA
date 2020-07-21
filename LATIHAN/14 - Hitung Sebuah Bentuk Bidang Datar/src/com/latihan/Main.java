// Fachrul Muhamad Ariestyan
// 183112706450240
package com.latihan;
import java.util.*;
import TOOLS.Utility;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner inputTerminal = new Scanner(System.in);
        String inputMenu;
        boolean isLanjutkan=true;
        while(isLanjutkan){
        Utility.displayMenu();
        inputMenu = inputTerminal.next();
        switch (inputMenu) {
            case "1":
                Utility.displayPersegi();
                break;
            case "2":
                Utility.displayPersegiPanjang();
                break;
            case "3":
                Utility.displayLingkaran();
                break;
            case "4":
                Utility.displaySegitiga();
                break;
            case "5":
                System.out.println("Program Berakhir! Bye~");
                return;
            default:
                System.out.print("Inputan yang dimasukan tidak ada!\nSilakan pilih menu [1-5]");
                break;
        }
        isLanjutkan = Utility.getYesOrNo("Apakah anda ingin melanjutkan");
    }
}
}