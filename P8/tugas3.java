package P8;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        double total = 0;
        int jumlah = 0;

        do {
            System.out.print("Masukkan Nilai : ");
            double nilai = input.nextDouble();
            input.nextLine();

            total = total + nilai;
            jumlah++;

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        double rataRata = total / jumlah;
        System.out.println("Rata-rata Nilai : " + rataRata);

        input.close();
    }
}