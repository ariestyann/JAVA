import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner terminalInput = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue) {
            kurangiStock();
            isContinue = getYesOrNo("do you want to continue");
        }
    }
    public static void showData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;
        int numberData=0;

        try{
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch (Exception e){
            System.out.println("The vending machine is empty\n thanks for using our services!");
            return;
        }
        System.out.println("=====================================");
        System.out.println("|           VENDING MACHINE         |");
        System.out.print("=====================================");
        System.out.println("\n| No |     Items     |    Prices    |");
        System.out.println("|----+---------------+--------------|");
        String data = bufferInput.readLine();
        while(data != null) {
            numberData++;
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            System.out.printf("| %-2d ", numberData);
            System.out.printf("| %-13s ", stringToken.nextToken());
            System.out.printf("| %-12s |", stringToken.nextToken());
            System.out.print("\n");
            data = bufferInput.readLine();
        }
        System.out.println("=====================================");
        bufferInput.close();
        fileInput.close();
    }

    public static void kurangiStock() throws IOException{
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        showData();

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Choose your item: ");
        Byte optionItems = terminalInput.nextByte();

        long entryCounts = 0;
        String data = bufferInput.readLine();
        int masukanUang,totalHarga;
        while(data != null){
            entryCounts++;
            StringTokenizer st = new StringTokenizer(data,",");
            if (optionItems == entryCounts) {
                String items = st.nextToken();
                String prices = st.nextToken();
                System.out.println("\nItem yang akan anda beli : ");
                System.out.println("===========================");
                System.out.println("Items    : " + items);
                System.out.println("Prices   : " + prices);
                System.out.println("===========================");
                System.out.println("Masukan uang anda: ");
                masukanUang = terminalInput.nextInt();
                int intPrices = Integer.parseInt(prices);
                    while (masukanUang != 5000 || masukanUang != 10000 || masukanUang != 20000) {
                        if (masukanUang == 5000 || masukanUang == 10000 || masukanUang == 20000) {
                            totalHarga = masukanUang - intPrices;
                            System.out.println("Kembalian yang akan anda terima: " + totalHarga);
                        } else {
                            System.out.println("Mesin hanya dapat menerima pecahan Rp5.000,\n Rp10.000, dan Rp20.000");
                        }
                    }
                bufferOutput.write(data);
                bufferOutput.newLine();
            }
            data = bufferInput.readLine();
        }
        bufferOutput.flush();
        fileInput.close();
        fileOutput.close();
        bufferOutput.close();
        bufferInput.close();
//        database.delete();
//        tempDB.renameTo(database);
    }
    public static boolean getYesOrNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+" [y/n]? ");
        String isContinue = terminalInput.next();
        while(!isContinue.equalsIgnoreCase("y") && !isContinue.equalsIgnoreCase("n")){
            System.out.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" [y/n]? ");
            isContinue = terminalInput.next();
        }
        return isContinue.equalsIgnoreCase("y");
    }
}
