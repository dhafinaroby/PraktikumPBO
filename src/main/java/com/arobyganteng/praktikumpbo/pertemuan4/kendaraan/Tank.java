package com.arobyganteng.praktikumpbo.pertemuan4.kendaraan;

public class Tank extends Kendaraan {
    int dayaPeluru;
    
    public void belok(String arah){
        System.out.println("Tank " + nama + " belok ke " + arah + " ! ");
    }
    
    public void belok(){
        System.out.println("Error : Mohon masukkan arah!");
    }
    
    public void extraInfo(){
        System.out.println("Daya Peluru Tank : " + dayaPeluru + " ammo ");
    }
}
