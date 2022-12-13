package com.arobyganteng.praktikumpbo.pertemuan4.tugas;

public class Obat {
    //Atribut
    String nama;
    String warna;
    int jml;
    
    //Method
    public void color(){
        System.out.println("Adik membeli obat warnanya " + warna + " di apotek. ");
    }
    
    public void showInfo(){
        System.out.println("Akan tetapi, Adik membeli obat " + nama + " sebanyak " + jml );
    }
    
}
