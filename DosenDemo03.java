import java.util.Scanner;
public class DosenDemo03 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Dosen03[] arrayOfDosen03 = new Dosen03[3];

    for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            System.out.print("Nama       : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true = P, false = W): ");
            boolean jenisKelamin = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Usia : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("---------------------------------");

            arrayOfDosen03[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }

        DataDosen03 data = new DataDosen03();
        data.dataSemuaDosen(arrayOfDosen03);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen03);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen03);
        data.infoDosenPalingTua(arrayOfDosen03);
        data.infoDosenPalingMuda(arrayOfDosen03);
    }
}
