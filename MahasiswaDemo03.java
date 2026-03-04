import java.util.Scanner;
public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa03[] arrayofMahasiswa03 = new Mahasiswa03[3];
        String dummy;

        for(int i=0; i < 3; i++) {
            arrayofMahasiswa03[i] = new Mahasiswa03();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayofMahasiswa03[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayofMahasiswa03[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayofMahasiswa03[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayofMahasiswa03[i].ipk = Float.parseFloat (dummy);
            System.out.println("---------------------------------");
        }

        for(int i =0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayofMahasiswa03[i].cetakInfo();
        }
        
    }
}
