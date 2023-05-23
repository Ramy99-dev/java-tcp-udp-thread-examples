import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class UDP_Server {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(4000);
            byte[] buff = new byte[256];

            DatagramPacket packet = new DatagramPacket(buff, buff.length);

            socket.receive(packet);
            
            String str = new String(packet.getData(),0,packet.getLength());

            System.out.println(str);

            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}