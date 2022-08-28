import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener {
    double ans = 0;
    String operator = "";
    JTextArea screen = new JTextArea();

    Calculator() {
        Font screen_font = new Font("SansSerif", Font.PLAIN, 22);
        screen.setBounds(0, 0, 700, 37);
        screen.setFont(screen_font);
        add(screen);
        String Bt_names[] = { "Sin", "Cos", "Tan", "7", "8", "9", "+", "Sin-1", "Cos-1", "Tan-1", "4", "5", "6", "-",
                "pi", "e", "log", "1", "2", "3", "x", "sqrt", "%", "Clear", "0", ".", "=", "/" };
        int width = 0;
        int height = 40;
        JButton bt[] = new JButton[28];
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                bt[count] = new JButton(Bt_names[count]);
                bt[count].setBounds(width, height, 95, 80);
                bt[count].setBackground(Color.black);
                bt[count].setForeground(Color.WHITE);
                add(bt[count]);
                width += 100;
                bt[count].addActionListener(this);
                count++;
            }
            height += 85;
            width = 0;
        }
        System.out.println(height);
        setSize(700, 420);
        setLayout(new BorderLayout(7, 7));
        setVisible(true);
        setBackground(Color.red);
        setTitle("Scientific Calculator");
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        String temp;
        for (int i = 0; i < 10; i++) {
            temp = Integer.toString(i);
            if (temp.equals(btn.getText())) {
                System.out.println("Changing ");
                screen.setText(screen.getText() + e.getActionCommand());
            }
        }
        if (btn.getText() == "%" || btn.getText() == "+" || btn.getText() == "-" || btn.getText() == "/"
                || btn.getText() == "x") {
            screen.setText(screen.getText() + btn.getText());
            operator = btn.getText();
        }
        if (btn.getText() == "=") {
            temp = screen.getText();
            double a = Double.parseDouble(temp.substring(0, temp.indexOf(operator)));
            double b = Double.parseDouble(temp.substring(temp.indexOf(operator) + 1, temp.length()));
            System.out.println("----------------" + temp.indexOf(operator) + "-a " + a + " b " + b);
            if (operator == "") {
                screen.setText("N/A");
            } else {
                if (operator == "+") {
                    ans = a + b;
                } else if (operator == "-") {
                    ans = a - b;
                } else if (operator == "x") {
                    ans = a * b;
                } else if (operator == "/") {
                    ans = a / b;
                } else if (operator == "%") {
                    ans = a % b;
                } else {
                    ans = Double.parseDouble(temp);
                }
                screen.setText(String.valueOf(ans));
            }
        }
        if (screen.getText() != "") {
            if (btn.getText() == "Clear") {
                screen.setText("");
            }
            if (btn.getText() == "Sin") {
                screen.setText(String.valueOf(Math.sin(ans)));
            }
            if (btn.getText() == "Cos") {
                screen.setText(String.valueOf(Math.cos(ans)));
            }
            if (btn.getText() == "Tan") {
                screen.setText(String.valueOf(Math.tan(ans)));
            }
            if (btn.getText() == "Sin-1") {
                screen.setText(String.valueOf(Math.asin(ans)));
            }
            if (btn.getText() == "Cos-1") {
                screen.setText(String.valueOf(Math.acos(ans)));
            }
            if (btn.getText() == "Tan-1") {
                screen.setText(String.valueOf(Math.atan(ans)));
            }
            if (btn.getText() == "log") {
                screen.setText(String.valueOf(Math.log(ans)));
            }
            if (btn.getText() == "sqrt") {
                screen.setText(String.valueOf(Math.sqrt(ans)));
            }
        }
        if (btn.getText() == "pi") {
            screen.setText(String.valueOf(Math.PI));
        }
        if (btn.getText() == "e") {
            screen.setText(String.valueOf(Math.E));
        }
        if (btn.getText() == ".") {
            screen.setText(screen.getText() + ".");
        }
    }
}

class JAVA_EXP8 {
    public static void main(String[] args) {
        new Calculator();
    }
}
