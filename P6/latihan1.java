package P6;

import java.util.Scanner;

public class latihan1 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai anda: ");
        int grade = input.nextInt();

        if (grade == 100){
            System.out.println("Selamat Anda Lulus dengan Kategori Sempurna");
        }
        else if (grade >=95){
            System.out.println("Selamat Anda Lulus dengan Kategori Sangat Memuaskan");
        }
        else if (grade >=90){
            System.out.println("Selamat Anda Lulus dengan Kategori Memuaskan");
        }
        else if (grade >= 80){
            System.out.println("Selamat Anda Lulus dengan Kategori Baik");
        }
        else {
            System.out.println("Maaf Anda Belum Lulus");
        }
        System.out.println("Nilai Anda: " + grade);
        input.close();
    }
    
}
