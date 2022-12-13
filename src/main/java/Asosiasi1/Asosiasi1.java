package Asosiasi1;

public class Asosiasi1 {
    public static void main(String[] args) {
       
        Dosenn A3 = new Dosenn("007", "A3");
        
        MataKuliah mk1, mk2, mk3, mk4, mk5;
        mk1 = new MataKuliah("INF001", "PBO", 3);
        mk2 = new MataKuliah("INF002", "Struktur Data", 3);
        mk3 = new MataKuliah("INF003", "Big Data", 4);
        mk4 = new MataKuliah("INF004", "PPL", 3);
        mk5 = new MataKuliah("INF005", "Alpro", 3);

        A3.tambahMK(mk1);
        A3.tambahMK(mk2); 
        A3.tambahMK(mk3);
        A3.tambahMK(mk4); 
        A3.tambahMK(mk5); 

        A3.lihatMK();
    }
}
