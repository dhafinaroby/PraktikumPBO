package com.arobyganteng.praktikumpbo.pertemuan6.tugas;

public class Exception3 {
    public static void main(String[] args) {
        String str = "Lihat itu boneka Doraemon lucu ya";
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        System.out.println("Luas String : " + str.length());
        
        try{
            //Akses elemen yang lebih besar dari Luas String
            System.out.println(str.charAt(45));
        }catch(StringIndexOutOfBoundsException e){
        System.out.println("Terjadi gagal saat akan mau run");
        }
    }
}
