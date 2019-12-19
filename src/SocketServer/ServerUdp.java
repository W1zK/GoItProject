package SocketServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ServerUdp {
    private static final int PORT = 1542;
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(PORT);
        DatagramPacket packet = new DatagramPacket(new byte[1024],112);
        socket.receive(packet);
        System.out.println(new String(packet.getData()));
        //socket.send(new DatagramPacket(new byte[1024],112));
    }
}
