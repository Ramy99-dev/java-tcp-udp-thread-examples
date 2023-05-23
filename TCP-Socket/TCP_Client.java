
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

class TCP_Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",4000);
            System.out.println("Connected To Server");

            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println("Hello from client");
            out.flush();

            socket.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }
}