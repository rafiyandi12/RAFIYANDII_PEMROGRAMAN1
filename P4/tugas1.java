package P4;

import java.util.Scanner;

/**
 * Program Pengeluaran Mingguan - 1 File, 1 Package
 * Package: sistembelanja
 */
public class tugas1 {

    // ── MODEL DATA 1 HARI ─────────────────────────────────────
    static class DataHari {
        int makan, transportasi, belanja;

        DataHari(int makan, int transportasi, int belanja) {
            this.makan        = makan;
            this.transportasi = transportasi;
            this.belanja      = belanja;
        }

        int getTotal() {
            return makan + transportasi + belanja;
        }
    }

    // ── KONSTANTA ─────────────────────────────────────────────
    private static final int JUMLAH_HARI = 7;
    private static final String[] NAMA_HARI = {
        "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"
    };

    // ── MAIN ──────────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataHari[] data = new DataHari[JUMLAH_HARI];

        cetakHeader("PROGRAM PENGELUARAN MINGGUAN");
        System.out.println("  Masukkan pengeluaran untuk 7 hari.");
        System.out.println("  Setiap hari: 3 input (Makan, Transportasi, Belanja)");
        System.out.println(garis('=', 54));

        // ── INPUT 7 HARI (21 input total) ─────────────────────
        for (int h = 0; h < JUMLAH_HARI; h++) {
            System.out.println("\n  [ Hari " + (h + 1) + " - " + NAMA_HARI[h] + " ]");
            System.out.println(garis('-', 54));

            int makan        = inputAngka(sc, "  Biaya Makan         : Rp ");
            int transportasi = inputAngka(sc, "  Biaya Transportasi  : Rp ");
            int belanja      = inputAngka(sc, "  Biaya Belanja       : Rp ");

            data[h] = new DataHari(makan, transportasi, belanja);

            System.out.println(garis('-', 54));
            System.out.printf("  Total Hari %d (%s)  : %s%n",
                (h + 1), NAMA_HARI[h], formatRupiah(data[h].getTotal()));
        }

        // ── OUTPUT LAPORAN ────────────────────────────────────
        tampilLaporan(data);
        sc.close();
    }

    // ── LAPORAN ───────────────────────────────────────────────
    private static void tampilLaporan(DataHari[] data) {

        int totalMakan  = 0, totalTransp = 0, totalBelan = 0;
        for (DataHari d : data) {
            totalMakan  += d.makan;
            totalTransp += d.transportasi;
            totalBelan  += d.belanja;
        }
        int grandTotal = totalMakan + totalTransp + totalBelan;

        // ── TABEL RINGKASAN HARIAN ────────────────────────────
        cetakHeader("LAPORAN PENGELUARAN HARIAN");
        System.out.printf("  %-9s %-14s %-14s %-14s %-14s%n",
            "Hari", "Makan", "Transport", "Belanja", "Total");
        System.out.println(garis('-', 67));
        for (int h = 0; h < JUMLAH_HARI; h++) {
            DataHari d = data[h];
            System.out.printf("  %-9s %-14s %-14s %-14s %-14s%n",
                NAMA_HARI[h],
                formatRupiah(d.makan),
                formatRupiah(d.transportasi),
                formatRupiah(d.belanja),
                formatRupiah(d.getTotal()));
        }
        System.out.println(garis('=', 67));
        System.out.printf("  %-9s %-14s %-14s %-14s %-14s%n",
            "TOTAL",
            formatRupiah(totalMakan),
            formatRupiah(totalTransp),
            formatRupiah(totalBelan),
            formatRupiah(grandTotal));
        System.out.println(garis('=', 67));

        // ── PERSENTASE PER HARI ───────────────────────────────
        cetakHeader("PERSENTASE PENGELUARAN PER HARI");
        for (int h = 0; h < JUMLAH_HARI; h++) {
            DataHari d     = data[h];
            int total      = d.getTotal();
            double pMakan  = (double) d.makan        / total * 100;
            double pTransp = (double) d.transportasi / total * 100;
            double pBelan  = (double) d.belanja      / total * 100;

            System.out.println("\n  [ " + NAMA_HARI[h] + " ]  Total: " + formatRupiah(total));
            System.out.println(garis('-', 54));
            System.out.printf("  Makan        = ( %s / %s ) x 100 = %.1f%%%n",
                angka(d.makan), angka(total), pMakan);
            System.out.printf("  Transportasi = ( %s / %s ) x 100 = %.1f%%%n",
                angka(d.transportasi), angka(total), pTransp);
            System.out.printf("  Belanja      = ( %s / %s ) x 100 = %.1f%%%n",
                angka(d.belanja), angka(total), pBelan);
            System.out.println(garis('-', 54));
            tampilBar("Makan",        pMakan);
            tampilBar("Transportasi", pTransp);
            tampilBar("Belanja",      pBelan);
        }

        // ── PERSENTASE PER MINGGU ─────────────────────────────
        cetakHeader("PERSENTASE PENGELUARAN PER MINGGU");
        double pwMakan  = (double) totalMakan  / grandTotal * 100;
        double pwTransp = (double) totalTransp / grandTotal * 100;
        double pwBelan  = (double) totalBelan  / grandTotal * 100;

        System.out.println("\n  Total Pengeluaran Minggu: " + formatRupiah(grandTotal));
        System.out.println(garis('-', 54));
        System.out.printf("  Makan        = ( %s / %s ) x 100 = %.1f%%%n",
            angka(totalMakan), angka(grandTotal), pwMakan);
        System.out.printf("  Transportasi = ( %s / %s ) x 100 = %.1f%%%n",
            angka(totalTransp), angka(grandTotal), pwTransp);
        System.out.printf("  Belanja      = ( %s / %s ) x 100 = %.1f%%%n",
            angka(totalBelan), angka(grandTotal), pwBelan);
        System.out.println(garis('-', 54));
        tampilBar("Makan",        pwMakan);
        tampilBar("Transportasi", pwTransp);
        tampilBar("Belanja",      pwBelan);

        System.out.println("\n" + garis('=', 54));
        System.out.println("  Laporan selesai. Semoga keuanganmu terjaga!");
        System.out.println(garis('=', 54));
    }

    // ── HELPER ────────────────────────────────────────────────
    private static int inputAngka(Scanner sc, String prompt) {
        int nilai = -1;
        while (nilai < 0) {
            System.out.print(prompt);
            try {
                nilai = Integer.parseInt(sc.nextLine().trim());
                if (nilai < 0) System.out.println("  [!] Masukkan angka >= 0.");
            } catch (NumberFormatException e) {
                System.out.println("  [!] Masukkan angka valid.");
            }
        }
        return nilai;
    }

    private static void tampilBar(String label, double persen) {
        int bar = (int) Math.round(persen / 5);
        bar = Math.min(bar, 20);
        String isi = "#".repeat(bar) + ".".repeat(20 - bar);
        System.out.printf("  %-13s [%s] %5.1f%%%n", label, isi, persen);
    }

    private static String formatRupiah(int nilai) {
        return "Rp " + angka(nilai);
    }

    private static String angka(int nilai) {
        String s = String.valueOf(nilai);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count > 0 && count % 3 == 0) sb.insert(0, ".");
            sb.insert(0, s.charAt(i));
            count++;
        }
        return sb.toString();
    }

    private static void cetakHeader(String judul) {
        System.out.println("\n" + garis('=', 54));
        int pad = (54 - judul.length()) / 2;
        System.out.println(" ".repeat(Math.max(0, pad)) + judul);
        System.out.println(garis('=', 54));
    }

    private static String garis(char c, int n) {
        return "  " + String.valueOf(c).repeat(n);
    }
}