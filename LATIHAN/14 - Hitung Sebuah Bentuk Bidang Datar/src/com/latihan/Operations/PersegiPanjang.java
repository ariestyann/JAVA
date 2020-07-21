// Fachrul Muhamad Ariestyan
// 183112706450240
package com.latihan.Operations;
import com.latihan.Operations.Shape;

public class PersegiPanjang extends Shape{
  double panjang,lebar;

  public PersegiPanjang(double panjang, double lebar){
    this.panjang = panjang;
    this.lebar = lebar;
  }

  @Override
  protected double hitungLuas(){
    return this.panjang * this.lebar;
  }

  @Override
  protected double hitungKeliling(){
    return 2*(this.panjang * this.lebar);
  }
  
}