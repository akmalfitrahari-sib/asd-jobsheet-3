public class Dosen03 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen03 (String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void cetakInfo () {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("JenisKelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + usia);
        System.out.println("------------------------------------");
    }
}
