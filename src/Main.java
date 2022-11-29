import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String str = "https://randomuser.me/api";
        try {
            URL url = new URL(str);
            InputStream inputStream = url.openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("people.json");

            //for (byte b : inputStream.readAllBytes()){
                fileOutputStream.write(inputStream.readAllBytes());

        } catch (MalformedURLException e) {
            System.out.println("Incorrect URL");
        } catch (IOException e) {
            System.out.println("Unable connect to URL");
        }
    }
}