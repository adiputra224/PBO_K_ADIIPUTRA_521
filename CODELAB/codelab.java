import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        // Membuat Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta input Nama
        System.out.print("Masukkan Nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta input Jenis Kelamin
        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Meminta input Tahun Lahir
        System.out.print("Masukkan Tahun Lahir Anda: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur berdasarkan tahun lahir
        int tahunSekarang = LocalDate.now().getYear(); // Mendapatkan tahun saat ini
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminString = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        // Menampilkan hasil
        System.out.println("\n=== Data Diri Anda ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminString);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup Scanner setelah selesai digunakan
        scanner.close();
    }
}