package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matriks_a = {
                {1,2},
                {3,4}
        };
        int[][] matriks_b = {
                {11,12},
                {13,14}

        };
        //Pertama membuat pertambahan dengan matriks
        System.out.print("Matriks A :\n");
        printArray_2D(matriks_a);
        System.out.print("Matriks B :\n");
        printArray_2D(matriks_b);
        System.out.print("Hasil penjumlahan :\n");
        int[][] hasilmatriks = tambahMatriks(matriks_a,matriks_b);
        printArray_2D(hasilmatriks);
        System.out.print("Hasil perkalian :\n");
        int[][] hasilkali = kaliMetriks(matriks_a,matriks_b);
        printArray_2D(hasilkali);
    }

    private static int[][] kaliMetriks(int[][] matriks_1, int[][] matriks_2){
        int baris_1 = matriks_1.length;
        int kolom_1 = matriks_1[0].length;
        int baris_2 = matriks_2.length;
        int kolom_2 = matriks_2[0].length;
        int[][] hasil = new int[baris_1][kolom_1];
        int buffer;

        if(kolom_1 == baris_2){
            for(int i = 0; i < baris_1; i++){
                for (int j = 0; j<kolom_2; j++){
                    buffer = 0;
                    for(int k =0; k<kolom_2; k++){
                        buffer += matriks_1[i][k] * matriks_2[k][j];
                    }
                    hasil[i][j] = buffer;
                }
            }
        }else {
            System.out.println("Kolom matrik A tidak sama dngan baris matriks B");
        }
        return hasil;
    }
    private static int[][] tambahMatriks(int[][] matriks_1, int[][] matriks_2){
        int baris_1 = matriks_1.length;
        int kolom_1 = matriks_1[0].length;
        int baris_2 = matriks_2.length;
        int kolom_2 = matriks_2[0].length;
        int[][] hasil = new int[baris_1][kolom_1];

        if((baris_1 == kolom_1) &&  (baris_2 == kolom_2)){
            for(int i = 0; i < baris_1; i++){
                for (int j = 0; j < kolom_1; j++){
                    hasil[i][j] = matriks_1[i][j] + matriks_2[i][j];
                }
            }
        }else{
            System.out.println("Baris dan Kolom harus sama");
        }
        return hasil;
    }

    private static void printArray_2D(int[][] dataArray_2D){
        int baris = dataArray_2D.length;
        int kolom = dataArray_2D[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++){
                System.out.print(dataArray_2D[i][j]);
                if(j < (kolom-1)){
                    System.out.print(",");
                }else{
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
