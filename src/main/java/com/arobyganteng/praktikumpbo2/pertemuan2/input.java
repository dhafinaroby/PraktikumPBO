/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arobyganteng.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan usia: ");
        int usia = input.nextInt();
        
        System.out.println("Nama saya: " + nama);
        System.out.println("Usia saya: " + usia + " tahun");
        
        
    }
}
