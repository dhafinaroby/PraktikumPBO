package com.arobyganteng.praktikumpbo.pertemuan4.tugas;

public class Troches extends Obat{
    //Atribut
    String kimia;
    
    //Method
    public void kandungan(){
        System.out.println("Dokter berkata, " + nama + " bisa menyembuhkan radang tenggorokan. ");
    }
    
    public void extraInfo(){
        System.out.println("Troches mengandung bahan kimia " + kimia + " membantu menyembuhkan radang tenggorokan.");
    }
    
}
