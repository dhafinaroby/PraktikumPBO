package com.arobyganteng.praktikumpbo.pertemuan3.tugas.arobyy;

public class Main {
    
    public static void main(String[] args) {
        
        // manggil class Roby
        Roby saya = new Roby ("Antar", 170, 55, 25);
        Roby dia  = new Roby ("Dhafin", 167, 52, 21);
        
        //method dijalankan
        saya.tentangRoby();
        dia.tentangRoby();
        
        //Demo Getter & Setter
        System.out.println("Tinggi badan saya(sebelum diet)     : " + dia.getBerat());
        dia.setBerat(100);
        System.out.println("Tinggi badan saya (setelah diet)    : " + dia.getBerat());
        System.out.println("\n");
        
        //Inheritance = menghubungkan dua objek atau lebih
        Jenis hewan = new Jenis(); 
        
        //panggil class Jenis
        System.out.println("Apakah hewan adalah Objek    ---> " + (hewan instanceof Object));
        System.out.println("Apakah hewan adalah Hewan    ---> " + (hewan instanceof Jenis));
        System.out.println("Apakah hewan adalah Kelinci  ---> " + (hewan instanceof Kucing));
        System.out.println("-------------------------------------------------------------"); 
        // spasi
 
        Kucing Kucing = new Kucing();
        
        //panggil class Kelinci “Kucing ialah hewan kesayangan Nabi Muhammad SAW” 
        System.out.println("Apakah hewan adalah Objek       ---> " + (Kucing instanceof Object));
        System.out.println("Apakah Kucing adalah Hewan      ---> " + (Kucing instanceof Jenis));
        System.out.println("Apakah Kucing adalah Kucing     ---> " + (Kucing instanceof Kucing)); 
    }
}

