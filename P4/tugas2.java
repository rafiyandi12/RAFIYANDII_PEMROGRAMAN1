package P4;
import java.util.Scanner;

public class tugas2 {

    // Hitung profit per barang
    static double hitungProfit(double beli, double jual) {
        return jual - beli;
    }

    // Cetak garis pemisah
    static void cetakGaris(char c, int panjang) {
        for (int i = 0; i < panjang; i++) System.out.print(c);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahBarang = 5;

        String[] nama   = new String[jumlahBarang];
        double[] beli   = new double[jumlahBarang];
        double[] jual   = new double[jumlahBarang];
        double[] profit = new double[jumlahBarang];

        double totalBeli = 0, totalJual = 0;

        cetakGaris('=', 40);
        System.out.println("   SISTEM MANAJEMEN STOK TOKO");
        cetakGaris('=', 40);

        // Input data barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\n>> Barang ke-" + (i + 1));
            System.out.print("   Nama Barang  : ");
            nama[i] = sc.next();
            System.out.print("   Harga Beli   : Rp ");
            beli[i] = sc.nextDouble();
            System.out.print("   Harga Jual   : Rp ");
            jual[i] = sc.nextDouble();

            profit[i] = hitungProfit(beli[i], jual[i]);
            totalBeli += beli[i];
            totalJual += jual[i];
        }

        double totalProfit = totalJual - totalBeli;

        // Header laporan
        System.out.println("\n\n   LAPORAN LABA RUGI TOKO");
        cetakGaris('=', 72);
        System.out.printf("   %-15s %15s %15s %15s%n",
            "NAMA BARANG", "HARGA BELI", "HARGA JUAL", "PROFIT");
        cetakGaris('-', 72);

        // Baris data tiap barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.printf("   %-15s Rp%,12.0f Rp%,12.0f Rp%,12.0f%n",
                nama[i], beli[i], jual[i], profit[i]);
        }

        cetakGaris('-', 72);

        // Ringkasan total
        System.out.printf("   %-30s : Rp%,12.0f%n", "Total Modal",      totalBeli);
        System.out.printf("   %-30s : Rp%,12.0f%n", "Total Pendapatan", totalJual);
        System.out.printf("   %-30s : Rp%,12.0f%n", "Total Profit",     totalProfit);

        cetakGaris('=', 72);

        // Margin keuntungan
        if (totalBeli > 0) {
            double margin = (totalProfit / totalBeli) * 100;
            System.out.printf("%n   Margin Keuntungan Global : %.2f%%%n", margin);
        }

        cetakGaris('=', 72);
        sc.close();
    }
}