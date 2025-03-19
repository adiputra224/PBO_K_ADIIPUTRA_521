import java.util.Scanner;

public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String inputNama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String inputNim = scanner.nextLine();

        if (inputNama.equals(getNama()) && inputNim.equals(getNim())) {
            System.out.println("Login Mahasiswa berhasil!");
            displayInfo();
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("[Mahasiswa] Nama: " + getNama() + ", NIM: " + getNim());
    }
}
