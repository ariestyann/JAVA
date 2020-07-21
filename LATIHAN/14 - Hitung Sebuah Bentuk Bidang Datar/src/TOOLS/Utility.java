// Fachrul Muhamad Ariestyan
// 183112706450240
package TOOLS;
import java.util.Scanner;
import com.latihan.Operations.*;

public class Utility {
  public static void displayMenu(){
    System.out.println("\n===============================");
    System.out.println("PROGRAM MENGHITUNG BIDANG DATAR");
    System.out.println("===============================");
    System.out.println("[1] Persegi");
    System.out.println("[2] Persegi Panjang");
    System.out.println("[3] Lingkaran");
    System.out.println("[4] Segitiga");
    System.out.println("[5] Keluar Program");
    System.out.print("Menu yang dipilih: ");
  }
  public static void displayPersegi() {
    double inputUser;
    Scanner inputTerminal = new Scanner(System.in);
    System.out.println("\n===============================");
    System.out.println("------------PERSEGI------------");
    System.out.println("===============================");
    System.out.print("Masukan nilai sisi: ");
    inputUser = inputTerminal.nextDouble();
    Persegi persegi = new Persegi(inputUser);
    persegi.display();
  }
  public static void displayPersegiPanjang() {
    double inputUser,inputUserDua;
    Scanner inputTerminal = new Scanner(System.in);
    System.out.println("\n===============================");
    System.out.println("--------PERSEGI PANJANG--------");
    System.out.println("===============================");
    System.out.print("Masukan nilai panjang: ");
    inputUser = inputTerminal.nextDouble();
    System.out.print("Masukan nilai lebar: ");
    inputUserDua = inputTerminal.nextDouble();
    PersegiPanjang persegiPanjang = new PersegiPanjang(inputUser, inputUserDua);
    persegiPanjang.display();
  }
  public static void displayLingkaran(){
    double inputUser;
    Scanner inputTerminal = new Scanner(System.in);
    System.out.println("\n===============================");
    System.out.println("-----------LINGKARAN-----------");
    System.out.println("===============================");
    System.out.print("Masukan nilai r: ");
    inputUser = inputTerminal.nextDouble();
    Lingkaran lingkaran = new Lingkaran(inputUser);
    lingkaran.display();
  }
  public static void displaySegitiga(){
    double inputUser, inputUserDua, inputUserTiga, inputUserEmpat;
    Scanner inputTerminal = new Scanner(System.in);
    System.out.println("\n===============================");
    System.out.println("------------SEGITIGA-----------");
    System.out.println("===============================");
    System.out.print("Masukan nilai sisi a: ");
    inputUser = inputTerminal.nextDouble();
    System.out.print("Masukan nilai sisi b: ");
    inputUserDua = inputTerminal.nextDouble();
    System.out.print("Masukan nilai sisi c: ");
    inputUserTiga = inputTerminal.nextDouble();
    System.out.print("Masukan nilai tinggi: ");
    inputUserEmpat = inputTerminal.nextDouble();
    Segitiga segitiga = new Segitiga(inputUser, inputUserDua, inputUserTiga, inputUserEmpat);
    segitiga.display();
  }
  public static boolean getYesOrNo(String message){
    Scanner terminalInput = new Scanner(System.in);
    System.out.print("\n"+message+" [y/n]? ");
    String pilihanUser = terminalInput.next();
    while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
      System.out.println("Pilihan anda bukan y atau n");
      System.out.print("\n"+message+" [y/n]? ");
      pilihanUser = terminalInput.next();
    }
    return pilihanUser.equalsIgnoreCase("y");
  }
}