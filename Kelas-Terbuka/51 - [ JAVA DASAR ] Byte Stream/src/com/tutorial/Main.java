package com.tutorial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
        System.out.println("File input bernilai = "+fileInput);

        //1. ini adalah cara yang pake throws
        //membuka file
        fileInput = new FileInputStream("input.txt");
        System.out.println("File input bernilai = "+fileInput);

        //membaca file
        int data = fileInput.read();
        while(data != -1){
            System.out.print((char)data);
            data = fileInput.read(); // ini untuk ngerefresh kan looping lol
        }

        //menutup file
        fileInput.close(); // jika sudah kelar dibaca kita wajib banget tuh close
        System.out.print("\n");
        //2. cara yang menggunakan try tapi langsung finnaly, karna catch nya pake throws
        try{
            //membuka file
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");

            //membaca file
            int buffer = fileInput.read();
            while(buffer != -1){
//                fileOutput.write((char)buffer); // ini cara buat naro di output file
                System.out.print((char)buffer);
                buffer = fileInput.read();
            }
        }finally {
            //menutup file
            if(fileInput != null){
                fileInput.close();
            }
            if(fileOutput != null){
                fileOutput.close();
            }
        }

        System.out.print("\n");

        //3. cara yang tidak menuliskan finnaly hanya menggunakan try
        // jadi doi langsung close file gitu di bagian try ini
        // dan di dalam try ini dia bisa masukin dua gitu biasanya satu output file kan
        try(FileInputStream in = new FileInputStream("input3.txt")){
            //membaca file

            int data2 = in.read();
            while(data2 != -1){
                System.out.print((char)data2);
                data2 = in.read();
            }
        }
    }
}
