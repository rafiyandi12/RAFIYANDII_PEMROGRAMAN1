package P8;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        double total = 0;
        int jumlahData = 0;

        do {
            System.out.print("Masukkan Nilai : ");
            double nilai = input.nextDouble();
            input.nextLine();

            total = total + nilai;
            jumlahData++;

            System.out.println("Nilai " + nilai + " berhasil ditambahkan.");

            System.out.print("Tambah nilai lagi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("================================");
        System.out.println("Jumlah Data  : " + jumlahData);
        System.out.println("Total Nilai  : " + total);
        System.out.println("================================");

        input.close();
    }
}