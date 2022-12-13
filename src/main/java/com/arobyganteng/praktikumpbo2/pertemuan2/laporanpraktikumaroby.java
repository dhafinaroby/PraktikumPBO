/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arobyganteng.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class laporanpraktikumaroby {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = 1;
    int acc = 0;
    String username, password;
    do{
        System.out.println("---------------------------------------------");
        System.out.println("                    LOGIN                    ");
        System.out.println("---------------------------------------------");
        System.out.println("         Mahasiswa  Sistem  Informasi        ");
        System.out.println("---------------------------------------------");
        System.out.println("Silahkan Masukkan Data Diri Anda");
        System.out.println(" Username : ");
        username = input.nextLine();
        System.out.println(" Password : ");
        password = input.nextLine();
        
        if(username.equals("RevandaDhafinAroby")&&password.equals("Aroby")){
        System.out.println(" Selamat Anda Telah Berhasil Login ");
        x = 4;
        acc = 1;
        }else{
            System.out.println(" Login Anda Gagal ");
            x++;
        }   
    }while(x <= 3);
        if(acc != 1){
            System.out.println("Anda gagal 3x");
            System.out.println("Anda Kami Blokir");
        }
    }
}
      


