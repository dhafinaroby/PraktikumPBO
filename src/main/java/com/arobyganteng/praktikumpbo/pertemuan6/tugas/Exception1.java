package com.arobyganteng.praktikumpbo.pertemuan6.tugas;

public class Exception1 {
    public static void main(String[] args) {
        try{
        Object[] array = new String[10];
        array[0] = 100;
        }catch(ArrayStoreException e){
            e.printStackTrace();
        }
        System.out.println("Alhamdulillah udah ga eror");
    }
}
