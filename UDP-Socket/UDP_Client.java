import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Client {

    public static void main(String[] args) {
        
        try {
            DatagramSocket socket = new DatagramSocket(5000);

            String message = "Hello from client";

            DatagramPacket packet = new DatagramPacket(message.getBytes(), 0 , message.length() , InetAddress.getByName("localhost") , 4000);

            socket.send(packet);

            socket.close();
        } catch ( IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

      


    }
    
}
