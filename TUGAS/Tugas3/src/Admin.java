import java.util.Scanner;

public class Admin extends User {
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
