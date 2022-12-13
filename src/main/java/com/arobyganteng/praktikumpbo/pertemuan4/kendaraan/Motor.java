package com.arobyganteng.praktikumpbo.pertemuan4.kendaraan;


public class Motor extends Kendaraan {
    int maxThrottle;
    
    public void lurus(String arah){
        System.out.println("Motor " + nama + " lurus " + arah + "!");
        
    }
    
    public void belok() {
        System.out.println("Error : Mohon masukkan arah!");
        
    }
    public void extraInfo() {
        System.out.println("Max Throttle : " + maxThrottle);
    
   }
}