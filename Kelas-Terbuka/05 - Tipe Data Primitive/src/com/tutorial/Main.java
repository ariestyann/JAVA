package com.tutorial;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args){
        /*
        TIPE DATA DALAM JAVA :
        1. byte
        2. short
        3. integer
        4. long
        5. double
        6. float
        7. char
        8. boolean
         */

        //byte (Satuan)
        byte b = 10;
        System.out.println("========BYTE========");
        System.out.println("Nilai byte b = " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai max = " + Byte.MIN_VALUE);
        System.out.println("Besar Memory = " + Byte.BYTES + " Bytes");
        System.out.println("Besar Memory = " + Byte.SIZE + " Bit");

        //Short (Satuan)
        short s = 10;
        System.out.println("========SHORT========");
        System.out.println("Nilai short s = " + s);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai max = " + Short.MIN_VALUE);
        System.out.println("Besar Memory = " + Short.BYTES + " Bytes");
        System.out.println("Besar Memory = " + Short.SIZE + " Bit");

        //Integer (Satuan)
        int i = 10;
        System.out.println("========INTEGER========");
        System.out.println("Nilai integer i = " + i);
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai max = " + Integer.MIN_VALUE);
        System.out.println("Besar Memory = " + Integer.BYTES + " Bytes");
        System.out.println("Besar Memory = " + Integer.SIZE + " Bit");

        //Long (satuan)
        long l = 10l; // tanda l untuk memberitahu bahwa ini bilangan Long
        System.out.println("========LONG========");
        System.out.println("Nilai long l = " + l);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai max = " + Long.MIN_VALUE);
        System.out.println("Besar Memory = " + Long.BYTES + " Bytes");
        System.out.println("Besar Memory = " + Long.SIZE + " Bit");

        //double (koma / bilangan real)
        double d = 10.5d; // tanda d untuk memberitahu bahwa ini bilangan double
        System.out.println("========DOUBLE========");
        System.out.println("Nilai double d = " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai max = " + Double.MIN_VALUE);
        System.out.println("Besar Memory = " + Double.BYTES + " Bytes");
        System.out.println("Besar Memory = " + Double.SIZE + " Bit");

        //float (koma / bilangan real)
        float f = 9.5f; // tanda f untuk memberitahu bahwa ini bilangan float
        System.out.println("========FLOAT========");
        System.out.println("Nilai float f = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai max = " + Float.MIN_VALUE);
        System.out.println("Besar Memory = " + Float.BYTES + " Bytes");
        System.out.println("Besar Memory = " + Float.SIZE + " Bit");

        //char (Karakter)
        char c = 'a';
        System.out.println("========CHARACTER========");
        System.out.println("Nilai char c = " + c);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai max = " + Character.MIN_VALUE);
        System.out.println("Besar Memory = " + Character.BYTES + " Bytes");
        System.out.println("Besar Memory = " + Character.SIZE + " Bit");

        //boolean (Karakter)
        boolean val = true;
        System.out.println("========BOOLEAN========");
        System.out.println("Nilai boolean val = " + val);
        System.out.println("Nilai max = " + true);
        System.out.println("Nilai max = " + false);

    }
}
