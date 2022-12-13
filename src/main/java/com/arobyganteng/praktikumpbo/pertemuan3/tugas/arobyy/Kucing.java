package com.arobyganteng.praktikumpbo.pertemuan3.tugas.arobyy;

public class Kucing extends Jenis {
    
    public Kucing(){
        super(); //tetap manggil constructor "Hewan Darat" pada parent class
        System.out.println("Kucing merupakan hewan berkaki empat");
    }
}
