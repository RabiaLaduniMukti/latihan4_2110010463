package penilaian;

public class mahasiswa {
    String nama, npm;
    
    public mahasiswa ( String nama, String npm ){
        this.nama = nama;
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    
}
