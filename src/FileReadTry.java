import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileReadTry {
    // make a file and read the contents of a file named 'fileEx.md' using input
    // stream of java

    public static void main(String[] args) {

        File file = new File("A:\\college study\\5th Sem\\Computer Network\\lab\\lab1\\RD.md");

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