package com.tutorial;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //membaca file

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        //ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); // true

        //ini untuk membaca kata dengan pemisah delimiter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext());//false

        //menggunakan delimiter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        //menggunakan string tokenizer
        //ini ngambil perbaris
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        //yang ini di pisah dengan delimiter
        StringTokenizer stringToken = new StringTokenizer(data,",");
        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        //cetak baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data,",");
        while(stringToken.hasMoreTokens()){
            System.out.print(stringToken.nextToken()); // ini keadan tanpa println
        }

    }
}
