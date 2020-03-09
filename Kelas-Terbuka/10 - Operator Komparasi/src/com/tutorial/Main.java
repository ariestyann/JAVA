package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operator komparasi ini akan menghasilkan sebuah nilai dalam bentuk boolean dalam number

        int a,b;
        boolean hasilKomparasi;

        // Operator equal atau persamaan
        System.out.println("---------PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a==b);
        System.out.printf("%d == %d ---> %s \n",a,b,hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a==b);
        System.out.printf("%d == %d ---> %s \n",a,b,hasilKomparasi);

        // Operator not equal atau pertidaksamaan
        System.out.println("---------PERTIDAKSAMAAN");
        a = 11;
        b = 10;
        hasilKomparasi = (a!=b);
        System.out.printf("%d != %d ---> %s \n",a,b,hasilKomparasi);
        a = 10;
        b = 10;
        hasilKomparasi = (a!=b);
        System.out.printf("%d != %d ---> %s \n",a,b,hasilKomparasi);

        // Operator less than atau kurang dari
        System.out.println("---------KURANG DARI");
        a = 9;
        b = 10;
        hasilKomparasi = (a<b);
        System.out.printf("%d < %d ---> %s \n",a,b,hasilKomparasi);
        a = 11;
        b = 10;
        hasilKomparasi = (a<b);
        System.out.printf("%d < %d ---> %s \n",a,b,hasilKomparasi);

        // Operator greater than atau lebih dari
        System.out.println("---------LEBIH DARI");
        a = 10;
        b = 9;
        hasilKomparasi = (a>b);
        System.out.printf("%d > %d ---> %s \n",a,b,hasilKomparasi);
        a = 10;
        b = 11;
        hasilKomparasi = (a>b);
        System.out.printf("%d > %d ---> %s \n",a,b,hasilKomparasi);

        // Operator less than equal atau kurang dari sama dengan
        System.out.println("---------KURANG DARI SAMA DENGAN");
        a = 9;
        b = 10;
        hasilKomparasi = (a<=b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasilKomparasi);
        a = 11;
        b = 10;
        hasilKomparasi = (a<=b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasilKomparasi);

        // Operator greater than equal atau lebih dari sama dengan
        System.out.println("---------LEBIH DARI SAMA DENGAN");
        a = 10;
        b = 9;
        hasilKomparasi = (a>=b);
        System.out.printf("%d >= %d ---> %s \n",a,b,hasilKomparasi);
        a = 10;
        b = 11;
        hasilKomparasi = (a>=b);
        System.out.printf("%d >= %d ---> %s \n",a,b,hasilKomparasi);
    }
}
