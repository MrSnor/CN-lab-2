import java.io.FileOutputStream;
import java.util.Scanner;

public class FileWriteTry {
  public static void main(String args[]) {
    try {
      Scanner sc = new Scanner(System.in);
      // System.out.print("Enter the file name: ");
      // String fileName = sc.nextLine();
      String fileName = "A:\\college study\\5th Sem\\Computer Network\\lab\\lab1\\wt.md";
      FileOutputStream fileToBeWrittenOn = new FileOutputStream(fileName, true);

      System.out.print("Enter content that you want to put in file: ");
      String str = sc.nextLine() + "\n";

      byte[] b = str.getBytes();
      fileToBeWrittenOn.write(b);
      fileToBeWrittenOn.close();

      sc.close();
      System.out.println("file saved.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
