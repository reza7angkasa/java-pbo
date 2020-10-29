import java.util.*;
public class latihannn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Golongan: ");
        int golongan = input.nextInt();
        if (golongan == 1) {
            System.out.println("Gaji Pokok: Rp. 1.486.500\nTunjagan: Rp. 250.000");
            int gaji=1486500+250000;
            System.out.print("Jam Kerja: ");
            int jamkerja = input.nextInt();
            System.out.println("Total Jam Lembur: "+(jamkerja-173));
            int jamlembur=(jamkerja-173)*20000;
            System.out.println("Gaji Lembur Karyawan: Rp. "+jamlembur);
            int total=gaji+jamlembur;
            double pajak=gaji*0.005;
            double gajikaryawan= total-pajak;
            System.out.println("Gaji Karyawan: Rp. "+gajikaryawan);
        }else if (golongan == 2) {
            System.out.println("Gaji Pokok: Rp. 1.926.000\nTunjagan: Rp. 300.000");
            int gaji= 1926000+300000;
            System.out.print("Jam Kerja: ");
            int jamkerja = input.nextInt();
            System.out.println("Total Jam Lembur: "+(jamkerja-173));
            int jamlembur=(jamkerja-173)*20000;
            System.out.println("Gaji Lembur Karyawan: Rp. "+jamlembur);
            int total=gaji+jamlembur;
            double pajak=gaji*0.005;
            double gajikaryawan= total-pajak;
            System.out.println("Gaji Karyawan: Rp. "+gajikaryawan);
        }else if (golongan == 3) {
            System.out.println("Gaji Pokok: Rp. 2.456.700\nTunjagan: Rp. 350.000");
            int gaji= 2456700+350000;
            System.out.print("Jam Kerja: ");
            int jamkerja = input.nextInt();
            System.out.println("Total Jam Lembur: "+(jamkerja-173));
            int jamlembur=(jamkerja-173)*20000;
            System.out.println("Gaji Lembur Karyawan: Rp. "+jamlembur);
            int total=gaji+jamlembur;
            double pajak=gaji*0.005;
            double gajikaryawan= total-pajak;
            System.out.println("Gaji Karyawan: Rp. "+gajikaryawan);
        }else if (golongan == 4) {
            System.out.println("Gaji Pokok: Rp. 2.899.500\nTunjagan: Rp. 400.000");
            int gaji= 2899500+400000;
            System.out.print("Jam Kerja: ");
            int jamkerja = input.nextInt();
            System.out.println("Total Jam Lembur: "+(jamkerja-173));
            int jamlembur=(jamkerja-173)*20000;
            System.out.println("Gaji Lembur Karyawan: Rp. "+jamlembur);
            int total=gaji+jamlembur;
            double pajak=gaji*0.005;
            double gajikaryawan= total-pajak;
            System.out.println("Gaji Karyawan: Rp. "+gajikaryawan);
        }
        else{
                System.out.println("error");
            }
        }
}
