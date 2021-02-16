import java.io.*;
import java.nio.charset.StandardCharsets;

public class Read {
    public static void read(String[] args) {
        try (OutputStream out = new FileOutputStream("File.csv")) {
            out.write("Hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

     try (BufferedReader bufferedReader = new BufferedReader
             (new FileReader("file.csv"))) {
         BufferedReader reader = null;
         String s = reader.readLine();
         System.out.println(s);
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }catch (IOException e) {
         e.printStackTrace();
     }


    }
}
