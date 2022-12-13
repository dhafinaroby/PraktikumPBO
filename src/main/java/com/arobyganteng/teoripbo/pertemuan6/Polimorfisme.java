package com.arobyganteng.teoripbo.pertemuan6;

public class Polimorfisme {
    public static void main(String[] args) {
        Bentuk2D b2d;
        
        PersegiPanjang pp = new PersegiPanjang(4,5);
        b2d = pp;
        b2d.display();
        
        System.out.println(" \n");
        Segitiga s3 = new Segitiga(6,8);
        b2d = s3;
        b2d.display();
        
        System.out.println("\n");
        b2d = new BujurSangkar (10);
        b2d.display();
    }
}
