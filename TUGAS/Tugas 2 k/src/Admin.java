import java.util.Scanner;
public class Admin {
    Scanner input = new Scanner(System.in);

    String username, password;


    void login() {
        System.out.println("===============================");
        System.out.print("Masukan Username: ");
        username = input.nextLine();
        System.out.print("Masukan Password: ");
        password = input.nextLine();

        if (username.equals("admin1") && password.equals("pass1")) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }

    }
}