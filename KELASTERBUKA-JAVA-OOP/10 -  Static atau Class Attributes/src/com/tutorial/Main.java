package com.tutorial;

class Display{
    static String type = "Display";
    private String name;
    public Display(String name){
        this.name = name;
    }

    public void getType(String typeInput){
        // type = typeInput; //alternatif 1
        // this.type = typeInput; //alternatif 2
        Display.type = typeInput; // alternatif 3 ***
    }
    public void Show(){
        System.out.println("Display name = "+this.name);
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Display display1 = new Display("Monitor");
        Display display2 = new Display("Smartphone");
        display1.Show();
        display2.Show();

        //coba untuk mengganti variable staticnya
        display1.getType("Spanduk");
        System.out.println("Menampilkan menggunakan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
        
    }
}