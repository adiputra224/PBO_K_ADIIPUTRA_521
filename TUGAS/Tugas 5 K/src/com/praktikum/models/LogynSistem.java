package com.praktikum.models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class LoginSystem {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data default
        users.add(new Admin("putra", "1234"));
        users.add(new Mahasiswa("adi", "4321"));

        while (true) {
            System.out.println("\n=== LOGIN SYSTEM ===");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            User loggedIn = login(username, password, users);

            if (loggedIn == null) {
                System.out.println("Login gagal. Coba lagi.\n");
                continue; // kembali ke awal login
            }

            System.out.println("Login berhasil sebagai " + loggedIn.getUsername());

            if (loggedIn instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) loggedIn;
                int pilih = -1;
                while (pilih != 0) {
                    System.out.println("\n--- Menu Mahasiswa ---");
                    System.out.println("1. Laporkan Barang");
                    System.out.println("2. Lihat Laporan");
                    System.out.println("0. Logout");
                    System.out.print("Pilih: ");
                    try {
                        pilih = scanner.nextInt();
                        scanner.nextLine();

                        if (pilih == 1) {
                            mhs.reportItem(items, scanner);
                        } else if (pilih == 2) {
                            mhs.viewReportedItems(items);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus angka.");
                        scanner.nextLine();
                    }
                }
            } else if (loggedIn instanceof Admin) {
                Admin admin = (Admin) loggedIn;
                int pilih = -1;
                while (pilih != 0) {
                    System.out.println("\n--- Menu Admin ---");
                    System.out.println("1. Kelola Barang");
                    System.out.println("2. Kelola User");
                    System.out.println("0. Logout");
                    System.out.print("Pilih: ");
                    try {
                        pilih = scanner.nextInt();
                        scanner.nextLine();

                        if (pilih == 1) {
                            admin.manageItems(items, scanner);
                        } else if (pilih == 2) {
                            admin.manageUsers(users, scanner);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus angka.");
                        scanner.nextLine();
                    }
                }
            }

            System.out.println("Logout berhasil.\n");
        }
        // scanner.close(); // jangan ditutup kalau pakai loop tak terbatas
    }

    public static User login(String username, String password, ArrayList<User> users) {
        for (User user : users) {
            if (user instanceof Admin) {
                if (user.getUsername().equals(username) && user.checkPassword(password)) {
                    return user;
                }
            } else if (user instanceof Mahasiswa) {
                if (user.getUsername().equals(username) && user.checkPassword(password)) {
                    return user;
                }
            }
        }
        return null;
    }
}