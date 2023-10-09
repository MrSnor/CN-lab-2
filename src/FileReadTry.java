import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    // alternative way to read the file
    try {
      String fileContent = new String(Files.readAllBytes(Paths.get("rd.md")));
      System.out.println("File content: \n" + fileContent);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}