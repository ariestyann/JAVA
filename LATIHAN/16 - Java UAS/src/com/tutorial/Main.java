package com.tutorial;

import java.util.Scanner;

class Pembeli{
    Scanner terminalInput = new Scanner(System.in);
    String name;
    Items items;
    int masukanUang = 0;

    Pembeli(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Produk yang dipilih: "+items.nameItems);
        System.out.println("Harga produk yang dipilih: "+items.pricesItem);
        while(masukanUang != 5000 || masukanUang != 10000 || masukanUang != 20000){
            System.out.print("Uang yang dimasukan: ");
            masukanUang = terminalInput.nextInt();
            if(masukanUang == 5000 || masukanUang == 10000 || masukanUang == 20000){
                items.stockItems = items.stockItems - 1;
                break;
            }else{
                System.out.println("Mesin hanya dapat menerima pecahan Rp5.000, Rp10.000, dan Rp20.000");
            }
        }
        System.out.println("Produk yang keluar: "+items.nameItems);
        System.out.println("Harga produk: "+items.pricesItem);


    }

    void setItems(Items items){
        this.items = items;
    }
}

class Items{
    String nameItems;
    float pricesItem;
    int stockItems = 5;

    Items(String nameItems, float pricesItem){
        this.nameItems = nameItems;
        this.pricesItem = pricesItem;

    }

    void display(){
        System.out.printf("| %-11s ", nameItems);
        System.out.printf("| %-12s ", pricesItem);
        System.out.printf("| %-7s |\n", stockItems);
    }

}

public class Main {
    public static void main(String[] args) {
        Items items1 = new Items("Granita",2000);
        Items items2 = new Items("Teh Rio",1500);
        System.out.println("========================================");
        System.out.println("             VENDING MACHINE            ");
        System.out.println("========================================");
        System.out.println("|    Items    |     Price    |  Stock  |");
        System.out.println("----------------------------------------");
        items1.display();
        items2.display();
        System.out.println("========================================");

        Pembeli pembeli = new Pembeli("Parul");
        pembeli.setItems(items1);
        pembeli.display();
    }
}
