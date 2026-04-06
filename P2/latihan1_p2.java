package P2;

import java.util.Scanner;

public class latihan1_p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int usia;

        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Usia: ");
        usia = input.nextInt();

        System.out.println("Nama Anda: " + nama);
        System.out.println("Usia Anda: " + usia + " tahun");

        input.close();
    }
}