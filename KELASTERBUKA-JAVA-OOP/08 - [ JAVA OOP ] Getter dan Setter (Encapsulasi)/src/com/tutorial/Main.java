package com.tutorial;

class Data{
  public int intPublic;
  private int intPrivate;

  public Data(){
    this.intPublic = 0;
    this.intPrivate = 10;
  }

  //getter
  public int getIntPrivate(){
    return this.intPrivate;
  }

  //setter
  public void setIntPrivate(int newIntPrivate){
    this.intPrivate = newIntPrivate;
  }
}

class Lingkaran{
  private double diameter;

  Lingkaran(double diameter){
    this.diameter = diameter;
  }

  //setter
  public void setJari2(double jari2){
    this.diameter = jari2*2;
  }

  //getter
  public double getJari2(){
    return this.diameter/2;
  }

  public double getLuasLingkaran(){
    return ((3.14*(this.diameter*this.diameter))/4);
  }
}
public class Main {
  public static void main(String[] args) {
    Data object = new Data();

    //read dan write menggunakan public
    object.intPublic = 5;
    System.out.println(object.intPublic);

    //read only menggunakan getter
    //harus banget dimasukin ke variabel baru
    int angka = object.getIntPrivate();
    System.out.println(angka);

    //write only menggunakan setter
    object.setIntPrivate(20);

    //gabungan antara getter dan setter
    Lingkaran lingkaran = new Lingkaran(5);
    System.out.println(lingkaran.getJari2());
    lingkaran.setJari2(14);
    System.out.println(lingkaran.getJari2());
    System.out.println(lingkaran.getLuasLingkaran());
  }
}
