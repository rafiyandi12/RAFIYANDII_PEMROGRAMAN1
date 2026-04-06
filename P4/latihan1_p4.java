package P4;
import java.util.Scanner;

public class latihan1_p4 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int totalPertemuan, hadir;
        double presensi, tugas, uts, uas, total;

        System.out.print("Masukkan jumlah pertemuan: ");
        totalPertemuan = input.nextInt();
        System.out.print("Masukkan jumlah kehadiran: ");
        hadir = input.nextInt();
        presensi = ((double) hadir / totalPertemuan)*100;

        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();

        total = (0.10*presensi) + (0.20*tugas) + (0.30*uts) + (0.40*uas);

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Presensi: " + presensi);
        System.out.println("Niali Tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Total Nilai: " + total);    

        input.close();
    }
}
