package com.tutorial;

public class Lain {
        //dapat diakses oleh siapa saja
        public static void methodPublic(){
            System.out.println("public");
            //memanggil private di class yang berbeda bisa begini
            //methodPrivate();
        }

        //hanya bisa diakses pada class yang sama
        private static void methodPrivate(){
            System.out.println("private");
        }

        //hanya dapat diaskses pada package yang sama
        static void methodDefault(){
            System.out.println("default");
        }

        //hanya dapat diaskses pada package yang sama, dan subclass nya
        protected static void methodProtected(){
            System.out.println("protected");
        }

}
