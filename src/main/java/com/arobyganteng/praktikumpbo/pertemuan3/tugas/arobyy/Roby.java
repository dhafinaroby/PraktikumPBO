package com.arobyganteng.praktikumpbo.pertemuan3.tugas.arobyy;

public class Roby {
     //atribut
    private String name;
    private int tinggi;
    private double berat;
    private int umur;
   
    
    // Constructor I
    public Roby(){}
    
    //Constructor II
    public Roby(String name, int tinggi, double berat, int umur) {
        this.name   = name;
        this.tinggi = tinggi;
        this.berat  = berat;
        this.umur   = umur;
    }
    
    
    //Method mencetak semua attribute
    public void tentangRoby(){
        System.out.println("Nama           : " + name);
        System.out.println("Umur           : " + umur   +    " Tahun");
        System.out.println("Tinggi Badan   : " + tinggi +    " Cm");
        System.out.println("Berat Badan    : " + berat  +    " Kg");
        System.out.println();
    }
    
    // [Alt] + [Insert] -> Getter and Setter -> Select All
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

