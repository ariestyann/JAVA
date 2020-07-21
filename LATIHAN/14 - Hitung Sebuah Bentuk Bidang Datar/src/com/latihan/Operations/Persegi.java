// Fachrul Muhamad Ariestyan
// 183112706450240
package com.latihan.Operations;
import com.latihan.Operations.Shape;

public class Persegi extends PersegiPanjang{
  double sisi;
  
  public Persegi(double sisi){
    super(0,0);
    this.sisi = sisi;
  }
  
  @Override
  public double hitungLuas() {
    return this.sisi * this.sisi;
  }

  @Override
  public double hitungKeliling() {
    return this.sisi * 4;
  }
}
