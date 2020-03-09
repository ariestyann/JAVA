package com.tutorial;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        // format pada string
        String nama = "Udin";
        int umur = 17;
        //dengan printline biasa
        System.out.println("Nama saya adalah "+nama+" , umur saya adalah "+umur);
        //dengan format string
        System.out.printf("Nama saya adalah %s , umur saya adalah %d\n",nama,umur);
        //conversion = f=floating point, d=integer, c=character, s=string, b=boolean
        //struktur format = %[argument index$][flags][width][.precision]conversion

        System.out.println("\n[argument index$]");
        //untuk kita memanggil berdasarkan index saja gitu
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?\n",nama);
        System.out.printf("\numur %1$s berapa?,\n%1$s menjawab: %2$d,\n wah masih muda ya umurnya %2$d tahun",nama,umur);
        // ini tu gini index nya("0",1,2,3,4,5,dll)
        System.out.print("\n");
        System.out.println("\n[flags]");
        //nilai yang ingin di taru ke dalam nilai (+) nanti klo hasilnya minus
        //dia akan ngubah sendiri jadi minus
        int int1 = 6;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d\n",int1,int2,hasil);
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3); //flags "-" tanda minus agar rata kiri
        System.out.printf("%+5d\n",int3); //flag akan mengambil slot dalam string format
        System.out.printf("%+-5d\n",int3); //flag bisa di gabungkan
        System.out.printf("%10d\n",int3);
        System.out.printf("% 10d\n",int3); //flag="spasi", leading spasi didepan
        System.out.printf("%010d\n",int3); // flag="0", leading 0 didepan
        System.out.printf("%+010d\n",int3);
        System.out.printf("%,10d\n",int3); //flag ="," menandakan delimeter perseribu
        int int4 = 1000000000;
        System.out.printf("%-,15d\n",int4);
        System.out.println("\nFLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n",float1);
        System.out.printf("%5f\n",float1);
        System.out.printf("%+9f\n",float1); //floating point dengan mengambil width 6 desimal

        System.out.println("\n[.precision]");
        float float2 = 15.678f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2); // untuk dibulatkan berapa angka stelah koma
        //4 itu kebawah, 5 keatas
        System.out.printf("%.2f\n",float2);
        System.out.printf("%8.2f\n",float2); // gabungkan dengan width
        System.out.printf("%+08.2f\n",float2); // gabungkan width dengan flags

        //contoh
        String nama2 = "ucup";
        float IPK = 3.78517238914f;
        //struktur format = %[argument index$][flags][width][.precision]conversion
        System.out.printf("\nIPK %1$s berapa ?\n%1$s: saya dapat %2$+5.2f\n",nama2,IPK);

        //kesimpulan
        //save format ini kedalam variable string
        String info_biasa = "nama: "+nama2 + ", IPK = "+ IPK;
        System.out.println("biasa -->"+info_biasa);

        String infoFormat = String.format("Nama %s, IPK = %2$+5.2f\n",nama2,IPK);
        System.out.println("String format -->"+infoFormat);

        //save format ini ke dalam stringbuilder
        StringBuilder builderInfo = new StringBuilder();
        Formatter formatBuilder = new Formatter(builderInfo);

        formatBuilder.format("Nama %s, IPK = %2$+5.2f\n",nama2,IPK);
        System.out.println("String builder format -->"+builderInfo);




    }
}
