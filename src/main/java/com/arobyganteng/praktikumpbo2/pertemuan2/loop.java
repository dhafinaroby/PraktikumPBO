/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arobyganteng.praktikumpbo2.pertemuan2;

/**
 *
 * @author Lenovo
 */
public class loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Looping... (" + i + "/5"); 
        }
        System.out.println("For loop selesai! \n"); 
        
        int j=0;
        while(j<5) {
            System.out.println("Looping...(" + j + "/5)");
            j++;
        }
        System.out.println("While loop selesai! \n");
        
        int k=0;
        do {
            System.out.println("Looping... (" + k + "/5)");
            k++;
            
        } while (k<5);
        System.out.println("Do-While loop selesai! \n");
    }
}
