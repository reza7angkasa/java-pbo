import java.io.*;
public class CthFileNotFoundException {
    public static void findFile() throws IOException {

        File newFile = new File("tes hanya sebagai percobaan aja.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
