package P7;
import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPertemuan = 21;

        System.out.print("Masukkan jumlah kehadiran (dari 21): ");
        int kehadiran = input.nextInt();

        System.out.print("Masukkan nilai akhir: ");
        double nilaiAkhir = input.nextDouble();

        double persentase = ((double) kehadiran / totalPertemuan) * 100;

        // Jika kehadiran >= 75%
        if (persentase >= 75) {
            if (nilaiAkhir >= 80) {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: A");
                System.out.println("Keterangan: Lulus");
            } else if (nilaiAkhir >= 70) {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: B");
                System.out.println("Keterangan: Lulus");
            } else if (nilaiAkhir >= 60) {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: C");
                System.out.println("Keterangan: Lulus");
            } else if (nilaiAkhir >= 55) {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: D");
                System.out.println("Keterangan: Tidak Lulus");
            } else {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: E");
                System.out.println("Keterangan: Tidak Lulus");
            }

        // Jika kehadiran < 75%
        } else {
            if (nilaiAkhir >= 55) {
                // N >= 55, cetak nilai 55 dan grade D
                System.out.println("Kehadiran kurang dari 75%");
                System.out.println("Nilai: 55");
                System.out.println("Grade: D");
                System.out.println("Keterangan: Tidak Lulus");
            } else {
                // N < 55, cetak nilai semestinya dan grade E
                System.out.println("Kehadiran kurang dari 75%");
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: E");
                System.out.println("Keterangan: Tidak Lulus");
            }
        }

        input.close();
    }
    
}
