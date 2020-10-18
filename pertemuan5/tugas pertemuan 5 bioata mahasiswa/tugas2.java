package com.company;
import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        tes1 input = new tes1();
        Scanner userInput=new Scanner(System.in);
        System.out.print("NIM: ");
        int nim = userInput.nextInt();
        userInput.nextLine();
        input.setNim(nim);
        System.out.print("Nama lengkap: ");
        String namalengkap = userInput.nextLine();
        input.setNamalengkap(namalengkap);
        System.out.print("Jurusan: ");
        String jurusan = userInput.nextLine();
        input.setJurusan(jurusan);
        System.out.print("Angkatan: ");
        int angkatan = userInput.nextInt();
        input.setAngkatan(angkatan);
        System.out.print("\n");
        System.out.println("|===============BIODATA MAHASISWA==================|");
        System.out.println("            NIM: " + input.getNim());
        System.out.println("            Nama Lengkap: " + input.getNamalengkap());
        System.out.println("            Jurusan: " + input.getJurusan());
        System.out.println("            Angkatan: " + input.getAngkatan());
        System.out.print("|==================================================|");
    }
}