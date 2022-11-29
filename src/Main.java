import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    static String str;

    public static void main(String[] args) {

        String str = "https://randomuser.me/api";
        try {
            URL url = new URL(str);
            InputStream inputStream = url.openStream();

            int i;
            //byte[] buffer = new byte[1024];
            while ((i = inputStream.read()) != -1){
                System.out.print((char) i);
            }
        } catch (MalformedURLException e) {
            System.out.println("Incorrect URL");
        } catch (IOException e) {
            System.out.println("Unable connect to URL");
        }

    }
}