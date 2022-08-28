import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws Exception {

        System.out.println("Server Started...");

        int port = 8000;
        ServerSocket ss = new ServerSocket(port);
        System.out.println("Waiting for client request");
        Socket s = ss.accept();

        System.out.println("Client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();

        System.out.println("Client Data: " + str);

        s.close();
        ss.close();

    }
}
