package SocketClient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ClientUdp {
    private static final int PORT = 1542;
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(PORT);
        socket.send(new DatagramPacket(new byte[1024],112));

    }
}
