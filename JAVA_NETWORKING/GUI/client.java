import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class client extends JFrame implements ActionListener {
    JScrollPane jScrollPane1;
    static JTextArea msg_area;
    JTextField msg_text;
    JButton msg_send;
    JLabel jLabel1;
    Container c;

    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dout;

    client() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        jLabel1 = new JLabel("Client");
        jLabel1.setForeground(Color.white);
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel1.setLocation(10, 10);
        jLabel1.setSize(90, 20);
        c.add(jLabel1);

        msg_area = new JTextArea();
        msg_area.setLocation(15, 40);
        msg_area.setEditable(false);
        msg_area.setSize(455, 370);
        c.add(msg_area);

        msg_text = new JTextField();
        msg_text.setFont(new Font("Tahoma", Font.ITALIC, 15));
        msg_text.setLocation(15, 420);
        msg_text.setSize(370, 30);
        c.add(msg_text);

        msg_send = new JButton("Send");
        msg_send.setLocation(395, 420);
        msg_send.setSize(70, 30);
        msg_send.addActionListener(this);
        c.add(msg_send);

        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == msg_send) {
            try {
                String msg = "", temp = "";
                msg = temp = msg_text.getText();
                msg_area.setText(msg_area.getText() + "\n You : " + temp);
                dout.writeUTF(msg);
                msg_text.setText("");
            } catch (Exception excep) {
                System.out.println(excep);
            }
        }
    }

    public static void main(String[] args) {
        client GUI = new client();

        try {
            String msgin = "";

            s = new Socket(InetAddress.getByName(args[0]), Integer.valueOf(args[1]));
            // server ip address and port must be specified as command line arguments
            // eg. java client 192.168.1.112 5000 (server ip & port)
            // eg. java 127.0.0.1 5000 for localhost (same machine)

            dis = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            while (!msgin.equals("exit")) {
                msgin = dis.readUTF();
                msg_area.setText(msg_area.getText() + "\n Server : " + msgin);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
