package com.arobyganteng.praktikumpbo2.pertemuan3.animal;

public class Main {
    // 'main' + [Tab]
    public static void main(String[] args) {
        //Membuat class
        Animal cat = new Animal("Chiko", 2, "Orange");
        Animal dog = new Animal("Bingo", 4, "Brown");
        Animal rabbit = new Animal("Thomas", 6, "Black");
        
        
        // Menjalankan method "showProfile()" masing - masing object
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        //Demo Getter & Setter
        System.out.println("Dog's name (before) : " + dog.getName());
        dog.setName("Doggy");
        System.out.println("Dog's name (after) : " + dog.getName());
       
    }
    
}