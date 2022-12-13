package com.arobyganteng.praktikumpbo.pertemuan6.tugas;

import java.util.*;

public class Exception2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Input sebuah angka : ");
        String strInput = input.nextLine();
        int intInput = 10;
        try{
            intInput = Integer.parseInt(strInput);
            System.out.println(strInput);
            System.out.println("Mantap, Anda berhasil");
        }catch(NumberFormatException e){
            System.out.println("Mohon maaf tidak bisa melakukan proses karena bukan merupakan angka");
        }
    }
}
