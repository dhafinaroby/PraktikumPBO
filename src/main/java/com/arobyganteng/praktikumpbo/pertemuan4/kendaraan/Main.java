package com.arobyganteng.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //Class object = new Class()
        Mobil mb     = new Mobil();
        Tank tk      = new Tank();
        Kendaraan kn = new Kendaraan();
       
        //Memasukkan nilai atribut
        mb.nama            = "Mitsubishi";
        mb.jmlRoda         = 4;
        
        kn.nama    = "Kendaraan Misterius";
        kn.jmlRoda = 8;
        
        tk.nama       = "Maung";
        tk.jmlRoda    = 8;
        tk.dayaPeluru = 100;
       
        //Uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");
        mb.belok();
        
        System.out.println("\n");
        kn.showInfo();
        kn.nyalakanMesin();
        
        System.out.println("\n");
        tk.showInfo();
        tk.nyalakanMesin();
        tk.belok("Kiri");
        tk.belok();

    }
}

