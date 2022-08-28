import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream in = new DataInputStream(s.getInputStream());
            while (true) {
                System.out.println(in.readUTF());
                if (in.readUTF().equals("exit")) {
                    ss.close();
                    break;
                }

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
