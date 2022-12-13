package com.arobyganteng.teoripbo.pertemuan6;

public class PersegiPanjang extends Bentuk2D {
    double panjang, lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double luas(){
        return panjang*lebar;
    }
    
    public double keliling(){
        return 2* (panjang + lebar);
    }
    
    public void display(){
        System.out.println("Luas dan Keliling [Persegi Panjang]");
        System.out.println("LUAS            : " + luas());
        System.out.println("KELILING        : " + keliling());
    }
    
}
