package com.arobyganteng.praktikumpbo.pertemuan3.challenge;

public class Main {
    public static void main(String[] args) {
        challenge Revanda = new challenge("Revanda", 8, 2000);
        challenge Dhafin  = new challenge("Dhafin", 16, 2008);
        challenge Aroby   = new challenge ("Aroby", 24, 2016);
        
        Revanda.showProfile();
        Dhafin.showProfile();
        Aroby.showProfile();
        
        System.out.println("Revanda name (before) : " + Revanda.getName());
        Revanda.setName("Revannn");
        System.out.println("Revanda name (after) : " + Revanda.getName());
        
    }
}
