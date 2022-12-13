package com.arobyganteng.teoripbo.pertemuan6;


public class BujurSangkar extends PersegiPanjang {
    
    public BujurSangkar (double panjang){
        super(panjang, panjang);
    }
    
    
    public void display(){
        System.out.println("Luas dan Keliling [BujurSangkar]");
        System.out.println("LUAS      : " + super.luas());
        System.out.println("KELILING  : " + super.keliling());
    }
    
}
