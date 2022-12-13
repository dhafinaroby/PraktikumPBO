package com.arobyganteng.teoripbo.pertemuan6;

public class Segitiga extends Bentuk2D {
    double alas, tinggi;
    
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double luas(){
        return (alas*tinggi)/2;
    }
    
    public double keliling(){
        double miring = Math.sqrt((alas*alas) + (tinggi*tinggi));
        return 2* (alas+tinggi+miring);
    }
    
    public void display(){
        System.out.println("Luas dan Keliling [Segitiga]");
        System.out.println("LUAS      : " + luas());
        System.out.println("KELILING  : " + keliling());
    }
    
}
