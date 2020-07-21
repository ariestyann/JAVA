// Fachrul Muhamad Ariestyan
// 183112706450240
package com.latihan.Operations;
import com.latihan.Operations.Shape;

public class Lingkaran extends Shape{
  double phi = 3.14,diameter,r;

  public Lingkaran(double r){
    this.r = r;
  }

  @Override
  protected double hitungLuas(){
    return this.phi * (this.r * this.r);
  }

  @Override
  protected double hitungKeliling() {
    return 2 * this.phi * r;
  }
}