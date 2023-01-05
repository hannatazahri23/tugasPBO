/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

import java.util.Scanner;

/**
 *
 * @author Hannata
 */
public class Segitiga {
    
  private double alas;
  private double tinggi;

  public Segitiga(double alas, double tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }
  public double getAlas() {
    return alas;
  }
  public void setAlas(double alas) {
    this.alas = alas;
  }
  public double getTinggi() {
    return tinggi;
  }
  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }
  public double hitungLuas() {
    return 0.5 * alas * tinggi;
  }
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama\t\t: M. Hannata Zahri");
        System.out.println("NIM\t\t: 312010318");
        
        System.out.print("Masukkan alas\t: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi\t: ");
        double tinggi = input.nextDouble();

        Segitiga sgt = new Segitiga(alas, tinggi);
        double luas = sgt.hitungLuas();
        System.out.println("Luas segitiga: " + luas);
    }
    
}