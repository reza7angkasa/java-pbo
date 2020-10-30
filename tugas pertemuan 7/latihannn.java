import java.util.*;
public class latihannn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method2 penjumlahan = new method2();
        System.out.print("Golongan: ");
        int golongan = input.nextInt();
        penjumlahan.setA(golongan);
        if (penjumlahan.getA() == 1) {
            System.out.println("Gaji Pokok: Rp. 1.486.500\nTunjagan: Rp. 250.000");
            int gaji=1486500+250000;
            penjumlahan.setC(gaji);
            System.out.print("Jam Kerja: ");
            int jamkerja = input.nextInt();
            penjumlahan.setB(jamkerja);
            System.out.println("Total Jam Lembur: "+(penjumlahan.getB()-173));
            int jamlembur=(penjumlahan.getB()-173)*20000;
            penjumlahan.setD(jamlembur);
            System.out.println("Gaji Lembur Karyawan: Rp. "+penjumlahan.getD());
            int total=penjumlahan.getC()+penjumlahan.getD();
            penjumlahan.setE(total);
            double pajak=penjumlahan.getC()*0.005;
            penjumlahan.setF(pajak);
            double gajikaryawan= penjumlahan.getE()-penjumlahan.getF();
            penjumlahan.setG(gajikaryawan);
            System.out.println("Gaji Karyawan: Rp. "+penjumlahan.getG());
        }else if (penjumlahan.getA() == 2) {
            System.out.println("Gaji Pokok: Rp. 1.926.000\nTunjagan: Rp. 300.000");
            int gaji= 1926000+300000;
            penjumlahan.setC(gaji);
            System.out.print("Jam Kerja: ");
            int jamkerja = input.nextInt();
            penjumlahan.setB(jamkerja);
            System.out.println("Total Jam Lembur: "+(penjumlahan.getB()-173));
            int jamlembur=(penjumlahan.getB()-173)*20000;
            penjumlahan.setD(jamlembur);
            System.out.println("Gaji Lembur Karyawan: Rp. "+penjumlahan.getD());
            int total=penjumlahan.getC()+penjumlahan.getD();
            penjumlahan.setE(total);
            double pajak=penjumlahan.getC()*0.005;
            penjumlahan.setF(pajak);
            double gajikaryawan= penjumlahan.getE()-penjumlahan.getF();
            penjumlahan.setG(gajikaryawan);
            System.out.println("Gaji Karyawan: Rp. "+penjumlahan.getG());
        }else if (penjumlahan.getA() == 3) {
            System.out.println("Gaji Pokok: Rp. 2.456.700\nTunjagan: Rp. 350.000");
            int gaji= 2456700+350000;
            penjumlahan.setC(gaji);
            System.out.print("Jam Kerja: ");
            int jamkerja = input.nextInt();
            penjumlahan.setB(jamkerja);
            System.out.println("Total Jam Lembur: "+(penjumlahan.getB()-173));
            int jamlembur=(penjumlahan.getB()-173)*20000;
            penjumlahan.setD(jamlembur);
            System.out.println("Gaji Lembur Karyawan: Rp. "+penjumlahan.getD());
            int total=penjumlahan.getC()+penjumlahan.getD();
            penjumlahan.setE(total);
            double pajak=penjumlahan.getC()*0.005;
            penjumlahan.setF(pajak);
            double gajikaryawan= penjumlahan.getE()-penjumlahan.getF();
            penjumlahan.setG(gajikaryawan);
            System.out.println("Gaji Karyawan: Rp. "+penjumlahan.getG());
        }else if (penjumlahan.getA() == 4) {
            System.out.println("Gaji Pokok: Rp. 2.899.500\nTunjagan: Rp. 400.000");
            int gaji= 2899500+400000;
            penjumlahan.setC(gaji);
            System.out.print("Jam Kerja: ");
            int jamkerja = input.nextInt();
            penjumlahan.setB(jamkerja);
            System.out.println("Total Jam Lembur: "+(penjumlahan.getB()-173));
            int jamlembur=(penjumlahan.getB()-173)*20000;
            penjumlahan.setD(jamlembur);
            System.out.println("Gaji Lembur Karyawan: Rp. "+penjumlahan.getD());
            int total=penjumlahan.getC()+penjumlahan.getD();
            penjumlahan.setE(total);
            double pajak=penjumlahan.getC()*0.005;
            penjumlahan.setF(pajak);
            double gajikaryawan= penjumlahan.getE()-penjumlahan.getF();
            penjumlahan.setG(gajikaryawan);
            System.out.println("Gaji Karyawan: Rp. "+penjumlahan.getG());
        }
        else{
            System.out.println("error");
        }
        }
}
