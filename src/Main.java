import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        String str = "https";
        InputStream inputStream;
        Reader configReader = null;
        try {
            URL url = new URL(str);
            inputStream = url.openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("people.json");

            //for (byte b : inputStream.readAllBytes()){
                fileOutputStream.write(inputStream.readAllBytes());

        } catch (MalformedURLException e) {
            try {
                inputStream = new FileInputStream("config.txt");
                configReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                int c;
                while ((c = configReader.read()) != -1) {
                    System.out.print((char)c);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    configReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("Unable connect to URL");
        }
    }
}