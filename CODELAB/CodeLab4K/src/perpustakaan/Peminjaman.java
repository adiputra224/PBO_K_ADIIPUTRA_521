package perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judul);
    void pinjamBuku(String judul, int durasi); // overload
    void kembalikanBuku(String judul);
}
