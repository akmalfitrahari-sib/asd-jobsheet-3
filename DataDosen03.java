public class DataDosen03 {
    
    public static void dataSemuaDosen(Dosen03[] arrayOfDosen03) {
        System.out.println("");
        System.out.println("===========DATA SEMUA DOSEN===========");
        for (Dosen03 dosen : arrayOfDosen03) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen03) {
        int jmlPria = 0, jmlWanita = 0;

        for(Dosen03 dosen : arrayOfDosen03) {
            if (dosen.jenisKelamin) {
                jmlPria++;
            } else {
                jmlWanita++;
            }
        }
            System.out.println("================================");
            System.out.println("Jumlah Dosen Pria     : " + jmlPria);
            System.out.println("Jumlah Dosen Wanita   : " + jmlWanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen03) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for(Dosen03 dosen : arrayOfDosen03) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jumlahPria++;
            } else {
                totalWanita += dosen.usia;
                jumlahWanita++;
            }
        }
    }

    public static void infoDosenPalingTua(Dosen03[] arrayOfDosen03) {
        Dosen03 dosenTertua = arrayOfDosen03[0];

        for (Dosen03 dosen : arrayOfDosen03) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("================================");
        System.out.println("Dosen paling tua : ");
        dosenTertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen03[] arrayOfDosen03) {
        Dosen03 dosenTermuda = arrayOfDosen03[0];

        for (Dosen03 dosen : arrayOfDosen03) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("================================");
        System.out.println("Dosen paling muda : ");
        dosenTermuda.cetakInfo();
    }
}
