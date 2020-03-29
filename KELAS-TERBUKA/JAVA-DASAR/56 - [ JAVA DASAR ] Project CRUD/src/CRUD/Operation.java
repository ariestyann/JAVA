package CRUD;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import CRUD.Utility;
import CRUD.Operation;

public class Operation {
    public static void tampilkanData() throws IOException {
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
        bufferInput.close();
        fileInput.close();
    }
    public static void cariData() throws IOException{
        try {
            File file = new File("database.txt");
        }catch(Exception e){
            System.out.println("Database tidak ada\nTambah data buku terlebih dahulu");
            return;
        }
        //ambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        //kita cek keyword di database
        Utility.cekBukuDiDatabase(keywords, true);

    }
    public static void tambahData() throws IOException{
        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan tahun terbit, format=(YYYY): ");
        tahun = Utility.ambilTahun();

        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};

        System.out.println(Arrays.toString(keywords));
        boolean isExist = Utility.cekBukuDiDatabase(keywords, false);
        if(!isExist){
            long nomorEntry = Utility.ambilEntryPerTahun(penulis,tahun) + 1;
            String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
            String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
            System.out.println("\nData yang akan anda masukan : ");
            System.out.println("=============================");
            System.out.println("Primary key   : "+primaryKey);
            System.out.println("Tahun terbit  : "+tahun);
            System.out.println("Penulis       : "+penulis);
            System.out.println("Penerbit      : "+penerbit);
            System.out.println("Judul         : "+judul);
            System.out.println("=============================");

            boolean isTambah = Utility.getYesOrNo("Apakah anda ingin nambahkan data tersebut ");

            if(isTambah){
                bufferOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        }else{
            System.out.println("Buku yang anda akan segera masukan sudah tersedia didatabase dengan data berikut: ");
            isExist = Utility.cekBukuDiDatabase(keywords, true);
        }
        bufferOutput.close();
        fileOutput.close();
    }
    public static void updateData() throws IOException{
        //ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        //buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        //tampilkan data
        System.out.println("List buku");
        tampilkanData();

        //ambil user input
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan nomor yang akan diupdate : ");
        long updateNum = terminalInput.nextLong();

        boolean isFound = false;
        long entryCounts = 0;
        String data = bufferInput.readLine();
        while (data != null ){
            entryCounts++;
            StringTokenizer st = new StringTokenizer(data,",");
            if(updateNum==entryCounts){
                System.out.println("\nData yang akan anda hapus : ");
                System.out.println("=============================");
                System.out.println("Primary key   : "+st.nextToken());
                System.out.println("Tahun terbit  : "+st.nextToken());
                System.out.println("Penulis       : "+st.nextToken());
                System.out.println("Penerbit      : "+st.nextToken());
                System.out.println("Judul         : "+st.nextToken());
                System.out.println("=============================");
                String[] fieldData = {"tahun terbit","penulis","penerbit","judul"};
                String[] tempData = new String[4];
                st = new StringTokenizer(data,",");
                String originalData = st.nextToken();
                for (int i=0; i<fieldData.length;i++){
                    boolean isUpdate = Utility.getYesOrNo("Apakah anda ingin merubah "+fieldData[i]);
                    originalData = st.nextToken();
                    if(isUpdate){
                        if(fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("Masukan tahun terbit, format=(YYYY): ");
                            tempData[i] = Utility.ambilTahun();
                        }else{
                            terminalInput = new Scanner(System.in);
                            System.out.print("Masukan "+fieldData[i]+" baru: ");
                            tempData[i] = terminalInput.nextLine();
                        }
                    }else{
                        tempData[i] = originalData;
                    }
                }
                st = new StringTokenizer(data,",");
                st.nextToken();
                System.out.println("\nData baru anda adalah: ");
                System.out.println("=============================");
                System.out.println("Tahun terbit  : "+st.nextToken()+" ---> "+tempData[0]);
                System.out.println("Penulis       : "+st.nextToken()+" ---> "+tempData[1]);
                System.out.println("Penerbit      : "+st.nextToken()+" ---> "+tempData[2]);
                System.out.println("Judul         : "+st.nextToken()+" ---> "+tempData[3]);
                System.out.println("=============================");
                boolean isUpdate = Utility.getYesOrNo("Apakah anda yakin ingin mengupdate data tersebut ");
                if(isUpdate){
                    boolean isExist = Utility.cekBukuDiDatabase(tempData, false);
                    if(isExist){
                        System.out.println("data buku sudah ada didatabase, proses update dibatalkan\nSilakan hapus data yang bersangkutan");
                        bufferOutput.write(data);
                    }else {
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];
                        long nomorEntry = Utility.ambilEntryPerTahun(penulis,tahun)+1;
                        String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
                        String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
                        bufferOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
                    }
                }else{
                    bufferOutput.write(data);
                }
                isFound = true;
            }else{
                bufferOutput.write(data);
            }
            bufferOutput.newLine();
            data = bufferInput.readLine();
        }
        if(!isFound){
            System.out.println("Nomor yang dimasukan salah!");
        }
        bufferOutput.flush();
        fileInput.close();
        fileOutput.close();
        bufferOutput.close();
        bufferInput.close();
        database.delete();
        tempDB.renameTo(database);
    }
    public static void deleteData() throws IOException{
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        System.out.println("List Data");
        tampilkanData();

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan nomor yang akan dihapus : ");
        long deleteNum = terminalInput.nextLong();

        boolean isFound = false;
        long entryCounts = 0;
        String data = bufferInput.readLine();
        while(data != null){
            entryCounts++;
            boolean isDelete = false;
            StringTokenizer st = new StringTokenizer(data,",");
            if(deleteNum==entryCounts){
                System.out.println("\nData yang akan anda hapus : ");
                System.out.println("=============================");
                System.out.println("Primary key   : "+st.nextToken());
                System.out.println("Tahun terbit  : "+st.nextToken());
                System.out.println("Penulis       : "+st.nextToken());
                System.out.println("Penerbit      : "+st.nextToken());
                System.out.println("Judul         : "+st.nextToken());
                System.out.println("=============================");
                isDelete = Utility.getYesOrNo("Apakah anda yakin menghapus data ini ");
                isFound = true;
            }
            if(isDelete){
                System.out.println("Data berhasil di hapuskan");
            }else{
                bufferOutput.write(data);
                bufferOutput.newLine();
            }
            data = bufferInput.readLine();
        }
        if(!isFound){
            System.out.println("Nomor yang dimasukan salah!");
        }
        bufferOutput.flush();
        bufferOutput.close();
        fileOutput.close();
        bufferInput.close();
        fileInput.close();
        database.delete();
        tempDB.renameTo(database);
    }
}
