import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin User", "0001", "admin", "1234");
        Mahasiswa mahasiswa = new Mahasiswa("Budi", "20211001");

        System.out.println("Pilih login: 1. Admin, 2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        if (pilihan == 1) {
            admin.login();
        } else if (pilihan == 2) {
            mahasiswa.login();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
