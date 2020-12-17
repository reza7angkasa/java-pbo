package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
public class Controller {
    public TextField id_number;
    public TextField name;
    public TextField age;
    public TextField major;
    private int i=0;
    private koneksi Koneksi=new koneksi();
    public void submit(ActionEvent actionEvent) {
        int data1;
        String data2;
        int data3;
        String data4;
        i++;
        int number = Integer.parseInt(id_number.getText());
        data1=number;
        data2=name.getText();
        int number2 = Integer.parseInt(age.getText());
        data3=number2;
        data4=major.getText();
        System.out.println("NIM: "+data1+"\n"+"Nama: "+data2+"\n"+"Umur: "+data3+"\n"+"Jurusan: "+data4+"\n");
        String query="INSERT INTO mahasiswa(nim,nama,umur,jurusan) VALUES('"+data1+"','"+data2+"','"+data3+"','"+data4+"')";
        int hasil=Koneksi.manipulasiData(query);
        if (hasil==1){
            System.out.println("Data berhasil diinput ke dalam tabel");
        }
    }

}
