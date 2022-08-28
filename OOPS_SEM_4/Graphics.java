
import java.awt.*;
import javax.swing.JFrame;

public class Graphics extends Canvas {

    @Override
    public void paint(java.awt.Graphics g) {
        g.drawString("Hello", 40, 40);
        setBackground(Color.WHITE);
        setForeground(Color.black);
        // g.fillRect(130, 30, 100, 80);
        // g.drawRect(280, 30, 100, 80);
        // g.drawOval(30, 130, 50, 60);

        // g.fillOval(130, 130, 50, 60);
        // g.drawArc(30, 200, 40, 50, 90, 60);
        // g.fillArc(30, 130, 40, 50, 180, 40);

        g.fillRect(200, 100, 5, 5);

        g.drawOval(200, 100, 50, 50);
        g.drawOval(190, 90, 30, 30);
        g.drawOval(230, 90, 30, 30);
        g.drawOval(220, 130, 10, 10);
    }

    public static void main(String[] args) {
        Graphics m = new Graphics();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        // f.setLayout(null);
        f.setVisible(true);
    }

}
