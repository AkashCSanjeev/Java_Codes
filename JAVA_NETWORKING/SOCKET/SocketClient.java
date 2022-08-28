import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class SocketClient {
    public static void main(String[] args) throws Exception {
        String ip = "localhost";
        int port = 8000; // 0-1023 is reserved so use from 1024 - 65535

        Socket s = new Socket(ip, port);

        String str = "Akash";

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        os.write(str);
        os.flush();

        s.close();

    }
}