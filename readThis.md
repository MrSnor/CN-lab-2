# Computer Network Lab (5th sem)

## Lab 2

Java Streams (**Pre-requisite**)

- Make a file and read the contents of a file named 'fileEx.md' using input

```java
public class FileReadTry {
    // make a file and read the contents of a file named 'fileEx.md' using input
    // stream of java

    public static void main(String[] args) {

        File file = new File("<absolute path to file>");

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
```

- Make a file and Writing data into the given file with write method

```java
public class FileWriteTry {
  public static void main(String args[]) {
    try {
      Scanner sc = new Scanner(System.in);
      // System.out.print("Enter the file name: ");
      // String fileName = sc.nextLine();
      String fileName = "D:\\anon\\src\\wrt.md";
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
```

- Reads the content of a file, converts each character to bytes, and writes the bytes to another file.

```java
public class copyPasteThingsfromFile {
  public static void main(String[] args) {
    File fileToRead = new File("<absolute path to the file>");
    File fileToWrite = new File("<absolute path to the file>");

    try (InputStream in = new FileInputStream(fileToRead)) {
      int content;

      FileOutputStream fileToBeWrittenOn = new FileOutputStream(fileToWrite, true);

      System.out.println(String.format("Data from '%s':-", fileToRead));
      while ((content = in.read()) != -1) {

        char convertedToChar = (char) content;

        String strConverted = Character.toString(convertedToChar);

        byte[] bytesToBeWritten = strConverted.getBytes();

        System.out.print(strConverted);

        fileToBeWrittenOn.write(bytesToBeWritten);

      }
      fileToBeWrittenOn.close();
      System.out.println("file saved.");

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

```