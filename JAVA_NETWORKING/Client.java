import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class Client {
    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            while (true) {
                String str = new Scanner(System.in).nextLine();
                out.writeUTF(str);
                out.flush();
                if (str.equals("exit")) {
                    out.writeUTF(str);
                    out.flush();
                    out.close();
                    s.close();
                    break;
                }

            }

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}