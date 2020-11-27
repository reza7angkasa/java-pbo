public class CthRuntimeException {
    public static void main(String[] args) {
        try{
            int angka_atau_nilai = 10;
            int hasil_atau_pembagiannya = angka_atau_nilai/0;
            System.out.println(hasil_atau_pembagiannya);
        }catch(ArithmeticException ex){
            System.out.println("Dilarang Menggunakan angka 0 untuk pembagian");
        }finally{
            System.out.println("End Of My Program, Thx A Bunch");
        }
    }
}
