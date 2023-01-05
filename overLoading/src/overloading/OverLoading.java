/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;
class Barang {
    public String merek;
    public float harga;
    
    //konstruktor
    public Barang(){
    }
    public Barang(String merek) {
        this.merek = merek;
    }
    public Barang (String merek, float harga) {
        this.merek = merek;
        this.harga = harga;
    }
    
    //method
    public void jenisBarang(String merek) {
        this.merek = merek;
    }
    public void jenisBarang(String merek, int harga) {
        this.merek = merek;
        this.harga = harga;
    }
    public void show() {
        System.out.println("Merek = " + this.merek);
        System.out.println("Harga = " + this.harga + "\n");
    } 
}

class Perhiasan extends Barang {
    Integer berat;
    
    // Constructor
    public Perhiasan(String merek, int harga, Integer berat) {
        super(merek);
        this.harga = harga;
        this.berat = berat;
    }
    
    @Override
    // Overridding method
    public void show() {
        System.out.println("Nama Barang = " + this.merek);
        System.out.println("Harga Barang = Rp." + this.harga);
        System.out.println("Berat Barang = " + this.berat + "gr");
    }
}

public class OverLoading {
    public static void main(String[] args) {
        System.out.println("Nama\t : M. Hannata Zahri");
        System.out.println("NIM\t : 31200318");
        System.out.println("-------------------------");
        Barang b1 = new Barang();
        Barang b2 = new Barang("Buku");
        Barang b3 = new Barang("Pensil", 3000);
        System.out.println("Output OverLoading");
        System.out.println("Output dari masing2 Constructor");
        b1.show();
        b2.show();
        b3.show();
        Barang b4, b5;
        b4 = new Barang();
        b5 = new Barang();
        b4.jenisBarang("Jam");
        b5.jenisBarang("Pulpen", 3500);
        System.out.println("Output dari masing2 method");
        b4.show();
        b5.show();
        
        Perhiasan b6 = new Perhiasan("Emas", 2500000, 1);
        System.out.println("==========================");
        System.out.println("Output Inheritance");
        b6.show();
    }
    
}
