package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public Label label_pesan;
    public TextField text_box;
    private int i=0;

    public void button_pesan(ActionEvent actionEvent) {
        String pesan;
        i++;
        pesan=text_box.getText();
        System.out.println(pesan);
        label_pesan.setText(pesan);
    }

    public Label equals;
    public TextField nilai;
    public TextField nilaii;
    private int a=0;

    public void plus(ActionEvent actionEvent) {

        double result;
        a++;
        double value= Double.parseDouble(nilai.getText());
        double value2= Double.parseDouble(nilaii.getText());
        result = value + value2;

        System.out.println(value + " + " + value2 + " = " + result);
        equals.setText(value + " + " + value2 + " = " + result);
    }
    public void minus(ActionEvent actionEvent) {
        double result;
        a++;
        double value= Double.parseDouble(nilai.getText());
        double value2= Double.parseDouble(nilaii.getText());
        result = value - value2;

        System.out.println(value + " - " + value2 + " = " + result);
        equals.setText(value + " - " + value2 + " = " + result);
    }

    public void div(ActionEvent actionEvent) {
        double result;
        a++;
        double value= Double.parseDouble(nilai.getText());
        double value2= Double.parseDouble(nilaii.getText());
        result = value / value2;

        System.out.println(value + " / " + value2 + " = " + result);
        equals.setText(value + " / " + value2 + " = " + result);
    }

    public void mul(ActionEvent actionEvent) {
        double result;
        a++;
        double value= Double.parseDouble(nilai.getText());
        double value2= Double.parseDouble(nilaii.getText());
        result = value * value2;

        System.out.println(value + " * " + value2 + " = " + result);
        equals.setText(value + " * " + value2 + " = " + result);
    }

    public void del(ActionEvent actionEvent) {

        String result;
        a++;

        result ="0";
        System.out.println(result);
        equals.setText(result);
    }
}
