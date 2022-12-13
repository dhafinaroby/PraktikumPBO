package com.arobyganteng.praktikumpbo.pertemuan4.tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("OBAT - OBATAN");
        System.out.println("1. Troches ");
        System.out.println("2. Demacolin ");
        System.out.println("3. Amoxcillin ");
        System.out.println("4. Keluar ");
        System.out.println("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        
        // Pembuatan Object
        Troches tr = new Troches();
        Obat ot = new Obat();
        Amoxcilin ax = new Amoxcilin();
 
        // Isi Nilai Attribute
        tr.nama  = "Troches";
        tr.jml   = 4;
        tr.warna = "Jingga";
        tr.kimia = "gramicidin-S HCl";
 
        ot.nama  = "Demacollin";
        ot.warna = "Putih";
        ot.jml   = 2;
 
        ax.nama = "Amoxcilin";
        ax.jml = 1;
        ax.warna = "Putih";
        ax.kimia = "Amoxiclin";
 
        // Memanggil Method
        switch(pilihan){
        case 1 -> {
        tr.color();
        tr.showInfo();
        tr.kandungan();
        tr.extraInfo();
     } 
        case 2 -> {
        ot.color();
        ot.showInfo();
     } 
        case 3 -> {
        ax.color();
        ax.showInfo();
        ax.kandungan();
        ax.extraInfo();
     } 
        case 4 -> System.out.println("Anda Telah Keluar");
        } 
    }
}
