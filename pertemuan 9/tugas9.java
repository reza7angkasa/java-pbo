import java.util.*;
class setget{
    public int nilai;
    public int nilai1;
    public int nilai2;
    public int nilai3;
    public int nilai4;
    public int nilai5;
    public int nilai6;
    public int nilai7;
    public int nilai8;
    public int nilai9;
    public int nilai10;
    public String O;

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }
    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }
    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }
    public void setNilai4(int nilai4) {
        this.nilai4 = nilai4;
    }
    public void setNilai5(int nilai5) {
        this.nilai5 = nilai5;
    }
    public void setNilai6(int nilai6) {
        this.nilai6 = nilai6;
    }
    public void setNilai7(int nilai7) {
        this.nilai7 = nilai7;
    }
    public void setNilai8(int nilai8) {
        this.nilai8 = nilai8;
    }
    public void setNilai9(int nilai9) {
        this.nilai9 = nilai9;
    }
    public void setNilai10(int nilai10) {
        this.nilai10 = nilai10;
    }
    public void setO(String O) {
        this.O = O;
    }
    public int getNilai() {
        return this.nilai;
    }
    public int getNilai1() {
        return this.nilai1;
    }
    public int getNilai2() {
        return this.nilai2;
    }
    public int getNilai3() {
        return this.nilai3;
    }
    public int getNilai4() {
        return this.nilai4;
    }
    public int getNilai5() {
        return this.nilai5;
    }
    public int getNilai6() {
        return this.nilai6;
    }
    public int getNilai7() {
        return this.nilai7;
    }
    public int getNilai8() {
        return this.nilai8;
    }
    public int getNilai9() {
        return this.nilai9;
    }
    public int getNilai10() {
        return this.nilai10;
    }
    public String getO() {
        return this.O;
    }
}
public class tugas9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        setget bilangan = new setget();
        String answer="Yes";
        String answer1="No";
        if ((answer.equalsIgnoreCase("yes")) && (answer1.equalsIgnoreCase("no"))) {
            System.out.print("Masukkan Bilangan Bulat: ");
            int A = input.nextInt();
            bilangan.setNilai(A);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int B = input.nextInt();
            bilangan.setNilai1(B);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int C = input.nextInt();
            bilangan.setNilai2(C);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int D = input.nextInt();
            bilangan.setNilai3(D);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int E = input.nextInt();
            bilangan.setNilai4(E);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int F = input.nextInt();
            bilangan.setNilai5(F);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int G = input.nextInt();
            bilangan.setNilai6(G);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int H = input.nextInt();
            bilangan.setNilai7(H);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int J = input.nextInt();
            bilangan.setNilai8(J);
            System.out.print("Masukkan Bilangan Bulat Berikutnya: ");
            int K = input.nextInt();
            input.nextLine();
            bilangan.setNilai9(K);
            System.out.println("Nilai Yang Telah dimasukkan: " + bilangan.getNilai() + ", " + bilangan.getNilai1() + ", " + bilangan.getNilai2() + ", " + bilangan.getNilai3() + ", " + bilangan.getNilai4() + ", " + bilangan.getNilai5() + ", " + bilangan.getNilai6() + ", " + bilangan.getNilai7() + ", " + bilangan.getNilai8() + ", " + bilangan.getNilai9());
            System.out.print("Apakah Anda Ingin Mencari Nilai Yang Telah Diinput (Yes or No)? ");
            String L = input.nextLine();
            bilangan.setO(L);

                if ((bilangan.getO().equalsIgnoreCase(answer))) {
                    System.out.print("Masukkan Nilai Yang Akan Dicari: ");
                    int M = input.nextInt();
                    bilangan.setNilai10(M);
                    System.out.println("Nilai Yang Dicari Anda: " + bilangan.getNilai10());
                    if (bilangan.getNilai10() == (bilangan.getNilai())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai1())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai1()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai2())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai2()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai3())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai3()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai4())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai4()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai5())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai5()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai6())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai6()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai7())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai7()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai8())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai8()));
                    } else if (bilangan.getNilai10() == (bilangan.getNilai9())) {
                        System.out.print("Menampilkan Hasil Pencarian: " + (bilangan.getNilai9()));
                    } else {
                        System.out.print("Nilai Yang Anda Cari Tidak Ditemukan");
                    }
                } else if ((bilangan.getO().equalsIgnoreCase(answer1))) {
                    System.out.print("Makasih");
                } else {
                    System.out.println("Error");
                }
            }
        }

}
