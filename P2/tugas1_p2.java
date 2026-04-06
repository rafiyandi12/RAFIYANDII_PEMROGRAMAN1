package P2; 
import java.util.Scanner;

public class tugas1_p2 {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        String namaLengkap, universitas, programStudi;
        int umur;

        System.out.println("=== Selamat Datang ===");
        System.out.print("Masukkan Nama Lengkap   : ");
        namaLengkap = inputScanner.nextLine();

        System.out.print("Masukkan Umur   : ");
        umur = inputScanner.nextInt();
        inputScanner.nextLine();

        System.out.print("Masukkan Universitas   :");
        universitas = inputScanner.nextLine();
        System.out.print("Masukkan Program Studi  : " );
        programStudi = inputScanner.nextLine();

        System.out.println("\n=======================");
        System.out.println("    Detail Data Diri   ");
        System.out.println("=========================");
        System.out.println(" => Nama           : " + namaLengkap);    
        System.out.println(" => Umur           : " + umur + "Tahun");    
        System.out.println(" => Universitas    : " + universitas);    
        System.out.println(" => program Studi  : " + programStudi);
        
        inputScanner.close();
    }
}