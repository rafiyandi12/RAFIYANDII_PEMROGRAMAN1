package P7;
import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPertemuan = 21;

        System.out.print("Masukkan jumlah kehadiran (dari 21): ");
        int kehadiran = input.nextInt();

        System.out.print("Masukkan nilai akhir: ");
        double nilaiAkhir = input.nextDouble();

        double persentase = ((double) kehadiran / totalPertemuan) * 100;

        if (persentase >= 75) {
            if (nilaiAkhir >= 80) {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: A");
            } else if (nilaiAkhir >= 70) {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: B");
            } else if (nilaiAkhir >= 60) {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: C");
            } else if (nilaiAkhir >= 55) {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: D");
            } else {
                System.out.println("Nilai: " + nilaiAkhir);
                System.out.println("Grade: E");
            }
        } else {
            System.out.println("Kehadiran kurang dari 75%, tidak memenuhi syarat.");
        }

        input.close();
    }
}
    