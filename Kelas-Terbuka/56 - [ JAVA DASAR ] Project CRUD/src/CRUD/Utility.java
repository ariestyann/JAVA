package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {
    static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while(data != null){
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s+","");
            if(penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())){
                entry = dataScanner.nextInt();
            }
            data = bufferInput.readLine();
        }
        fileInput.close();
        bufferInput.close();
        return entry;
    }
    static String ambilTahun(){
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        boolean tahunValid = false;
        while (!tahunValid){
            try{
                Year.parse(tahunInput);
                tahunValid = true;
            }catch (Exception e){
                System.out.println("Format tahun yang anda masukan salah, Format=(YYYY)");
                System.out.println("Silakan masukan tahun terbit lagi: ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }
        return tahunInput;
    }
    protected static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        Scanner terminalInput = new Scanner(System.in);
        boolean isExist=false;
        int nomorData=0;
        String data = bufferInput.readLine();
        if (isDisplay){
            System.out.print("===================================================================================================");
            System.out.println("\n| No | Tahun | Penulis                  | Penerbit     | Judul Buku                               |");
            System.out.println("|----+-------+--------------------------+--------------+------------------------------------------|");
        }
        while(data != null){
            isExist = true;
            for(String keyword : keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            if(isExist){
                if(isDisplay) {
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");
                    stringToken.nextToken();
                    System.out.printf("| %-2d ", nomorData);
                    System.out.printf("| %-5s ", stringToken.nextToken());
                    System.out.printf("| %-24s ", stringToken.nextToken());
                    System.out.printf("| %-12s ", stringToken.nextToken());
                    System.out.printf("| %-40s |", stringToken.nextToken());
                    System.out.print("\n");
                }else{
                    break;
                }
            }

            data = bufferInput.readLine();
        }
        if (isDisplay) {
            System.out.println("===================================================================================================");
        }
        fileInput.close();
        bufferInput.close();
        return isExist;
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
    public static void clearScreen(){
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
