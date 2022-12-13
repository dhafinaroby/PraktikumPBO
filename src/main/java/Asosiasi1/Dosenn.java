package Asosiasi1;

public class Dosenn {
    private String namaDosen;
    private String nppDosen;
    private int jmlMk;
    private MataKuliah daftarMK[];
    
    public Dosenn(String npp, String nama) {
        this.namaDosen = nama;
        this.nppDosen = npp;
    
        daftarMK = new MataKuliah[6];
        this.jmlMk = 0;
    }

    public void tambahMK(MataKuliah mk){
        daftarMK[jmlMk] = mk;
        jmlMk++;
    }
    
    public void lihatMK(){
        System.out.println("Nama Dosen  : "+this.namaDosen);
        System.out.println("");
        System.out.println(jmlMk);
        
        for(int i = 0; i < jmlMk; i++){
            daftarMK[i].displayMK();
        }
    }
}