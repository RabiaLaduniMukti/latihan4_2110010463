package penilaian;

public class NilaiAkhir extends mahasiswa {
    int uts, uas, tugas ;
    
    public NilaiAkhir ( String nama, String npm, int uts, int uas, int tugas ){
        super ( nama, npm );    
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
}
    public double HitungNilaiAkhir (){
        return ( 0.30 * uts ) + ( 0.30 * uas ) +( 0.40 * tugas );
    } 
}
