import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        Admin admin = new Admin();
        Mahasiswa mhs = new Mahasiswa();

        Boolean ulang = true;


        while(ulang){
            System.out.println("::=====-- Pilih Login --=====::");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan Pilihan (1/2): ");
            pilihan = input.nextInt();



            if(pilihan == 1){
                admin.login();
                break;

            }else if(pilihan == 2){
                mhs.login();
                break;
            }else{
                System.out.println("Pilihan tidak valid.");
            }
        }
        input.close();
    }

}