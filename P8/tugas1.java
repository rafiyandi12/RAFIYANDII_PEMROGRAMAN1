package P8;
import java.util.Scanner;
public class tugas1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan Nama  : ");
            String nama = input.nextLine();

            System.out.print("Masukkan Nilai : ");
            double nilai = input.nextDouble();
            input.nextLine();

            System.out.println("Nama  : " + nama);
            System.out.println("Nilai : " + nilai);

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        input.close();
    }
}

