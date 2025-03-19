import java.util.Scanner;

// Kelas Admin
class Admin {
    private String username = "Adi Putra";
    private String password = "23072711";

    // Metode untuk login admin
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    private String nama = "Adi Putra";
    private String nim = "202410370110521";

    // Metode untuk login mahasiswa
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(nama) && inputNim.equals(nim);
    }

    // Menampilkan informasi mahasiswa setelah login berhasil
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Kelas utama LoginSystem
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek admin dan mahasiswa
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        // Menampilkan menu pilihan
        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) { // Login sebagai Admin
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            if (admin.login(inputUsername, inputPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) { // Login sebagai Mahasiswa
            System.out.print("Masukkan nama: ");
            String inputNama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String inputNim = scanner.nextLine();

            if (mahasiswa.login(inputNama, inputNim)) {
                System.out.println("Login Mahasiswa berhasil!");
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
