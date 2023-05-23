import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class TCP_Server {
   public static void main(String[] args) {
      try {
        ServerSocket socket = new ServerSocket(4000);

        Socket s = socket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream());

        String message = in.readLine();
        System.out.println(message);

        socket.close();

    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

   }
   
}