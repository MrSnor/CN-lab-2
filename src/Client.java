import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {
    public static void main(String args[]) {
        try {

            Socket socket = new Socket("localhost", 3000);
            System.out.println("Connected to server at " + socket);

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String fileContent = new String(Files.readAllBytes(Paths.get("fileToRead.txt")));

            System.out.println("File content: \n" + fileContent);

            // send the file content to the server
            out.writeUTF(fileContent);

            out.flush();
            out.close();

            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}