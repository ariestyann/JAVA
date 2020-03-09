package com.tutorial;

public class Main {
    public static void main(String[] args){
        //Operator Bitwise adalah operator untuk melakukan operasi pada nilai bit
        // 8 Bit = 1 Byte

        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        System.out.println("=========SHIFT LEFT (<<)");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        System.out.println("=========SHIFT RIGHT (>>)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a >> 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        System.out.println("=========BITWISER OR (|)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace( ' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

        System.out.println("=========BITWISER AND (&)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace( ' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

        System.out.println("=========BITWISER XOR (^)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace( ' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

        System.out.println("=========BITWISER XOR (^)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(~a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n",b_bits, b);
    }
}
