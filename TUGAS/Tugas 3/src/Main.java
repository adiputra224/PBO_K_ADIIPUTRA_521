import java.util.Scanner;

class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void login() {
        System.out.println("Login method di User.");
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }
}

class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login Admin berhasil!");
            displayInfo();
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("[Admin] Nama: " + getNama() + ", NIM: " + getNim());
    }
}

class Mahasiswa extends User {
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

class LoginSystem {
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
    }
}
