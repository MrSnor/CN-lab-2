import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;

/**
 * The Java class reads the content of a file and writes it to another file.
 */
public class copyPasteThingsfromFile {
  public static void main(String[] args) {
    File fileToRead = new File("rd.md");
    File fileToWrite = new File("wt.md");

    try (InputStream in = new FileInputStream(fileToRead)) {
      int content;

      FileOutputStream fileToBeWrittenOn = new FileOutputStream(fileToWrite, true);

      System.out.println(String.format("Data from '%s':-", fileToRead));
      while ((content = in.read()) != -1) {
        String strConverted = Character.toString((char) content);
        System.out.print(strConverted);
        fileToBeWrittenOn.write(content);
      }
      fileToBeWrittenOn.close();
      System.out.println("file saved.");

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}