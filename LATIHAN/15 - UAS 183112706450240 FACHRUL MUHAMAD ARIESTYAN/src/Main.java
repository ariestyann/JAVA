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
        System.out.println("============================================");
        System.out.println("|              VENDING MACHINE             |");
        System.out.print("============================================");
        System.out.println("\n| No |     Items     |    Price    | Stock |");
        System.out.println("|----+---------------+-------------+-------|");
        String data = bufferInput.readLine();
        while(data != null) {
            numberData++;
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("| %-2d ", numberData);
            System.out.printf("| %-13s ", stringToken.nextToken());
            System.out.printf("| %-11s ", stringToken.nextToken());
            System.out.printf("| %-5s |", stringToken.nextToken());
            System.out.print("\n");
            data = bufferInput.readLine();
        }
        System.out.println("============================================");
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

        System.out.println("List buku");
        showData();

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Choose your item: ");
        Byte optionItems = terminalInput.nextByte();

        long entryCounts = 0;
        String data = bufferInput.readLine();
        loops:
        while(data != null){
            entryCounts++;
            StringTokenizer st = new StringTokenizer(data,",");
            if (optionItems == entryCounts) {
                st.nextToken();
                System.out.println("\nItem yang akan anda beli : ");
                System.out.println("===========================");
                System.out.println("Items : " + st.nextToken());
                System.out.println("Prices   : " + st.nextToken());
                System.out.println("Stocks   : " + st.nextToken());
                System.out.println("===========================");
                String[] fieldData = {"items", "prices", "stocks"};
                String[] tempData = new String[3];

                st = new StringTokenizer(data, ",");
                String originalData = st.nextToken();
                for (int i = 0; i < fieldData.length; i++) {
                    originalData = st.nextToken();
                    if (fieldData[i].equalsIgnoreCase("stocks")) {
                        terminalInput = new Scanner(System.in);
                        System.out.print("Jumlah barang: ");
                        tempData[i] = terminalInput.nextLine();
                    } else {
                        tempData[i] = originalData;
                    }
                }

                st = new StringTokenizer(data,",");
                String items = tempData[0];
                String prices = tempData[1];
                int intPrices = Integer.parseInt(prices);
                String stocks = tempData[2];
                int intStocks = Integer.parseInt(stocks);
                String primaryKey = st.nextToken();
                bufferOutput.write(primaryKey+","+items+","+prices+","+stocks);
                if(intStocks==0){
                    System.out.println("STOK KURANG");
                    break loops;
                }else{
                    int totalHarga = intStocks * intPrices;
                    System.out.println(totalHarga);
                }
                data = bufferInput.readLine();
                bufferOutput.newLine();
                bufferOutput.write(data);
            }
            bufferOutput.newLine();
            data = bufferInput.readLine();
        }
        bufferOutput.flush();
        fileInput.close();
        fileOutput.close();
        bufferOutput.close();
        bufferInput.close();
        database.delete();
        tempDB.renameTo(database);
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
