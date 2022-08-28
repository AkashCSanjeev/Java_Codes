import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class GhostAnimation implements Runnable {

    Thread t;
    int x, y;

    @Override
    public void run() {

    }

}

public class Graphics extends Canvas {

    int ovalWidth = 15, ovalHeight = 15;
    int stepOval = 1;

    int arcAngle = 300;
    int arcStep = 10;

    @Override
    public void paint(java.awt.Graphics g) {
        setBackground(Color.black);

        g.setColor(Color.yellow);
        g.setFont(new Font("Courier New", Font.BOLD, 30));
        g.drawString("Pacman", 150, 50);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));
        g2d.setPaint(Color.BLUE);
        g2d.drawLine(0, 100, 400, 100);
        g2d.drawLine(0, 105, 400, 105);

        g2d.setStroke(new BasicStroke(3));
        g2d.setPaint(Color.BLUE);
        g2d.drawLine(0, 270, 400, 270);
        g2d.drawLine(0, 275, 400, 275);

        g.setColor(Color.yellow);
        g.fillArc(30, 130, 100, 100, 30, arcAngle);
        if (arcAngle > 360 || arcAngle < 300) {
            arcStep = -arcStep;
        }

        arcAngle = arcAngle + arcStep;

        g.setColor(Color.white);
        g.fillOval(160, 170, 15, 15);

        g.setColor(Color.white);
        g.fillOval(200, 169, ovalWidth, ovalHeight);

        if ((ovalHeight > 20 && ovalWidth > 20) || (ovalHeight < 15 && ovalWidth < 15)) {
            stepOval = -stepOval;
            g.setColor(Color.blue);
            g.fillOval(200, 169, ovalWidth, ovalHeight);
        }

        ovalHeight = ovalHeight + stepOval;
        ovalWidth = ovalWidth + stepOval;

        g.setColor(Color.white);
        g.fillOval(240, 170, 15, 15);

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("ghost.png");
        g.drawImage(i, 280, 130, 100, 100, Color.black, this);

        if ((ovalHeight > 20 && ovalWidth > 20) || (ovalHeight < 15 && ovalWidth < 15)) {
            stepOval = -stepOval;
            g.setColor(Color.blue);
            g.fillOval(200, 169, ovalWidth, ovalHeight);
        }

        ovalHeight = ovalHeight + stepOval;
        ovalWidth = ovalWidth + stepOval;

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        repaint();

    }

    public static void main(String[] args) {
        Graphics m = new Graphics();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowListener() {

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                f.dispose();

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub

            }

        });
    }
}
