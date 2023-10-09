import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String args[]) {
    try {
      ServerSocket server = new ServerSocket(3000);
      System.out.println("Server started. Listening on port " + 3000 + "...");

      Socket socket = server.accept();
      System.out.println("Client connected from: " + socket);

      DataInputStream in = new DataInputStream(socket.getInputStream());

      // receive the file content from the client
      String message = in.readUTF();

      FileOutputStream fileOutputStream = new FileOutputStream("receivedData.txt", true);
      fileOutputStream.write(message.getBytes());
      fileOutputStream.close();

      System.out.println("Received data: \n" + message);

      server.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}