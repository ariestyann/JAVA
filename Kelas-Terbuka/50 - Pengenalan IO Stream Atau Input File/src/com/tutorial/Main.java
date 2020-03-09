package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        try {
//            FileInputStream FileInput = new FileInputStream("input.txt");
//        }catch (Exception e){
//         System.err.println(e);
//        }

        FileInputStream FileInput = new FileInputStream("input.txt");
        System.out.println((char) FileInput.read());
        System.out.println((char) FileInput.read());
        System.out.println((char) FileInput.read());
        System.out.println((char) FileInput.read());
        //kalo naro file harus selevel gitu. nah klo buat di run di sini lo taro aja selevel sama folder src
        //misal buat run di cmd itu lo taro di selevel sama com
        //misal buat file jar lo taro selevel juga di jar ye
    }

}
