package SocketServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int PORT = 1641;

    public static void main(String[] args) throws IOException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.execute(()->{
            try {
                try (ServerSocket server = new ServerSocket(PORT)) {

                    while (true) {
                        System.out.println("Waiting for the client");
                        try (Socket socket = server.accept()) {
                            //Получаем пакеты от клиента
                            DataInputStream is = new DataInputStream(socket.getInputStream());

                            System.out.println("New message from the client = " + is.readUTF());
                            //Отправляем пакеты клиенту


                            DataOutputStream os = new DataOutputStream(socket.getOutputStream());
                            os.writeUTF("Bye-bye!");
                        }
                    }
                }
            }catch (IOException e){
                System.out.println("error");

            }
        });



    }
}
