// Fachrul Muhamad Ariestyan
// 183112706450240
package com.latihan.Operations;
import com.latihan.Operations.Shape;

public class Segitiga extends Shape {
  double sisiA, sisiB, sisiC, tinggi;

  public Segitiga(double sisiA, double sisiB, double sisiC, double tinggi) {
    this.sisiA = sisiA;
    this.sisiB = sisiB;
    this.sisiC = sisiC;
    this.tinggi = tinggi;
  }

  @Override
  protected double hitungLuas() {
    return 0.5 * this.sisiA* this.tinggi;
  }

  @Override
  protected double hitungKeliling() {
    return this.sisiA + this.sisiB + this.sisiC;
  }
}