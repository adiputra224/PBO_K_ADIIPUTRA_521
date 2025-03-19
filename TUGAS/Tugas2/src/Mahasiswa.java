public class Mahasiswa {
    private String nama = "Budi";
    private String nim = "210123456";

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
