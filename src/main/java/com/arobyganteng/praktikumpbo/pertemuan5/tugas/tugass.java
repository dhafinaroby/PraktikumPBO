package com.arobyganteng.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

public class tugass {
    public static void main(String[] args) {
        
        //Membuat array dan scanner
        String[][]jembatan = new String[5][5];
        Scanner scan = new Scanner(System.in);
        
        //Menambah kendaraan setiap gate in di jembatan
        System.out.println("---Nama Kendaraan---");
        for(int bar = 0; bar < jembatan.length; bar++){
            for(int kol = 0; kol < jembatan[bar].length; kol++){
                System.out.format("Kendaraan pada gate in jembatan (%d, %d) : ", bar , kol);
                jembatan[bar][kol] = scan.nextLine();
            }
        }
        System.out.println("");
        
        //tampilkan isi array
        System.out.println("---Gate in Jembatan Suramadu---");
        System.out.println("|Gate in 1|  |Gate in 2|  |Gate in 3|  |Gate in 4|  |Gate in 5|");
        for(int bar = 0; bar < jembatan.length; bar++){
            for(int kol = 0; kol < jembatan[bar].length; kol++){
                System.out.format("| %s | \t", jembatan[bar][kol]);
            }
            System.out.println("");
        }
    }
}
