/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arobyganteng.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();
        
        if(bilangan > 0)
            System.out.println(bilangan + " adalah bilangan positif!");
        
        else if(bilangan < 0)
            System.out.println(bilangan + " adalah bilangan negatif!");
        
        else
            System.out.println(bilangan + " adalah nol!");
    }
}
