package P3;
import java.util.Scanner;

public class latihan1_p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total harga belanja Rp : ");
        double hargaTotal = input.nextDouble();

        System.out.print("Masukkan persen diskon (contoh 15 untuk 15%): ");
        int persenDiskon = input.nextInt();
        double nominalDiskon = (double) persenDiskon / 100 * hargaTotal;
        double hargaAkhir = hargaTotal - nominalDiskon;

        System.out.println("\n--- Rincian Pembayaran ---");
        System.out.println("Harga Awal   : Rp " + hargaTotal);
        System.out.println("Diskon (" + persenDiskon + "%) : Rp " + nominalDiskon);
        System.out.println("Total Bayar   : Rp " + hargaAkhir);

        System.out.println("\nTotal bayar (dibulatkan/dipotong): Rp " + (int) hargaAkhir);

        input.close();
    }
    
}