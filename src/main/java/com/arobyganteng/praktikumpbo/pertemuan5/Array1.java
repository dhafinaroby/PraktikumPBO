package com.arobyganteng.praktikumpbo.pertemuan5;


public class Array1 {
    public static void main(String[] args) {
        //Pembuatan Array
        String[] names = {
            "Aroby",
            "Antonius Agung",
            "Antar Syuhada",
            "Nicodemus",
            "Dhava Khalish",  
        };
        
        //Cek Panjang array
        System.out.println("Panjang array : " + names.length);
        
        
        //Menampilkan semua nilai array
        for(int i=0; i<names.length; i++) {
            System.out.println(i + " : " + names[i]);
            
        }
    }
}
