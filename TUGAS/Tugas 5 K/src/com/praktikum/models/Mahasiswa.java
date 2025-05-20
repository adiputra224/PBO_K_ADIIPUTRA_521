package com.praktikum.models;

import java.util.Scanner;
import java.util.ArrayList;

public class Mahasiswa extends User {
    public Mahasiswa(String username, String password) {
        super(username, password);
    }

    public void reportItem(ArrayList<Item> items, Scanner scanner) {
        System.out.print("Nama barang: ");
        String name = scanner.nextLine();
        System.out.print("Deskripsi: ");
        String desc = scanner.nextLine();
        System.out.print("Lokasi ditemukan: ");
        String loc = scanner.nextLine();

        Item newItem = new Item(name, desc, loc);
        items.add(newItem);
        System.out.println("Laporan berhasil ditambahkan.");
    }

    public void viewReportedItems(ArrayList<Item> items) {
        System.out.println("=== Daftar Laporan ===");
        int i = 0;
        for (Item item : items) {
            if (item.getStatus().equals("Reported")) {
                System.out.println(i + ". " + item.getItemName() + " - " + item.getLocation());
            }
            i++;
        }
    }
}