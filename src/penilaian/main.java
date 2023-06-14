package penilaian;

public class main {
    public static void main(String[] args) {
        NilaiAkhir Rabia = new NilaiAkhir ( "Rabia","2110010463", 85, 80, 85 );
        System.out.println("Nama:"+ Rabia.nama);
        System.out.println("Npm:"+ Rabia.npm);
        System.out.println("NilaiAkhir"+ Rabia.HitungNilaiAkhir());
    }
    
}
