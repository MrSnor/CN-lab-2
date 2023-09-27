import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileReadTry {
    // make a file and read the contents of a file named 'fileEx.md' using input
    // stream of java

    public static void main(String[] args) {

        File file = new File("rd.md");

        System.out.println(String.format("Data from '%s':-", file));

        try (InputStream in = new FileInputStream(file)) {
            int content;
            System.out.print("Data: \n");
            while ((content = in.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}