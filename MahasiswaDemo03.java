public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Mahasiswa03 [] arrayofMahasiswa03 = new Mahasiswa03[3];
        arrayofMahasiswa03[0] = new Mahasiswa03();
        arrayofMahasiswa03[0].nim = "244107060033";
        arrayofMahasiswa03[0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa03[0].kelas = "SIB-1E";
        arrayofMahasiswa03[0].ipk = (float) 3.75;

        arrayofMahasiswa03[1] = new Mahasiswa03();
        arrayofMahasiswa03[1].nim = "2341720172";
        arrayofMahasiswa03[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa03[1].kelas = "TI-2A";
        arrayofMahasiswa03[1].ipk = (float) 3.36;

        arrayofMahasiswa03[2] = new Mahasiswa03();
        arrayofMahasiswa03[2].nim = "244107023006";
        arrayofMahasiswa03[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayofMahasiswa03[2].kelas = "TI-2E";
        arrayofMahasiswa03[2].ipk = (float) 3.80;

        System.out.println("NIM     : "+ arrayofMahasiswa03[0].nim);
        System.out.println("Nama    : "+ arrayofMahasiswa03[0].nama);
        System.out.println("Kelas   : "+ arrayofMahasiswa03[0].kelas);
        System.out.println("IPK     : "+ arrayofMahasiswa03[0].ipk);
        System.out.println("------------------------------------");

        System.out.println("NIM     : "+ arrayofMahasiswa03[1].nim);
        System.out.println("Nama    : "+ arrayofMahasiswa03[1].nama);
        System.out.println("Kelas   : "+ arrayofMahasiswa03[1].kelas);
        System.out.println("IPK     : "+ arrayofMahasiswa03[1].ipk);
        System.out.println("------------------------------------");

        System.out.println("NIM     : "+ arrayofMahasiswa03[2].nim);
        System.out.println("Nama    : "+ arrayofMahasiswa03[2].nama);
        System.out.println("Kelas   : "+ arrayofMahasiswa03[2].kelas);
        System.out.println("IPK     : "+ arrayofMahasiswa03[2].ipk);
        System.out.println("------------------------------------");
    }
}
