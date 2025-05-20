package com.praktikum.models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void manageItems(ArrayList<Item> items, Scanner scanner) {
        System.out.println("=== Semua Laporan Barang ===");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ". " + items.get(i));
            System.out.println("--------------------");
        }

        try {
            System.out.print("Masukkan indeks barang yang ingin diubah statusnya: ");
            int index = scanner.nextInt();
            scanner.nextLine();

            items.get(index).setStatus("Claimed");
            System.out.println("Status barang berhasil diubah menjadi 'Claimed'.");
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void manageUsers(ArrayList<User> users, Scanner scanner) {
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa");
        System.out.print("Pilih: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Username mahasiswa: ");
            String u = scanner.nextLine();
            System.out.print("Password: ");
            String p = scanner.nextLine();
            users.add(new Mahasiswa(u, p));
            System.out.println("Mahasiswa berhasil ditambahkan.");
        } else if (choice == 2) {
            System.out.print("Username mahasiswa yang ingin dihapus: ");
            String u = scanner.nextLine();
            boolean found = false;
            for (User user : users) {
                if (user instanceof Mahasiswa && user.getUsername().equals(u)) {
                    users.remove(user);
                    System.out.println("Mahasiswa berhasil dihapus.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Mahasiswa tidak ditemukan.");
            }
        }
    }
}