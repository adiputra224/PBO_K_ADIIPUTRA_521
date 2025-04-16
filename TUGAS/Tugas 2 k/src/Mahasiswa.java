import java.util.Scanner;
public class Mahasiswa {
    Scanner input = new Scanner(System.in);

    String nama, nim;


    void login() {
        System.out.println("==========================");
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();

        if (nama.equals("ayub") && nim.equals("512")) {
            System.out.println("Login Mahasiswa berhasil!");

            displayinfo();

        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }

    void displayinfo() {

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}