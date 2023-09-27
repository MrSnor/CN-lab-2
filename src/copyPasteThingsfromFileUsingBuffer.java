import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * The Java class reads the content of a file and writes it to another file.
 */
public class copyPasteThingsfromFileUsingBuffer {
public static void main(String[] args) {
  Path fileToRead = Paths.get("A:\\college study\\5th Sem\\Computer Network\\lab\\lab1\\rd.md");
  Path fileToWrite = Paths.get("A:\\college study\\5th Sem\\Computer Network\\lab\\lab1\\wt.md");

  try (BufferedReader reader = Files.newBufferedReader(fileToRead, StandardCharsets.UTF_8);
       BufferedWriter writer = Files.newBufferedWriter(fileToWrite, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {

    System.out.println(String.format("Data from '%s':-", fileToRead));

    String line;
    while ((line = reader.readLine()) != null) {
      System.out.print(line);
      writer.write(line);
      writer.newLine();
    }

    System.out.println("file saved.");

  } catch (IOException e) {
    e.printStackTrace();
  }
}
}