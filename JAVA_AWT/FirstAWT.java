
import java.awt.*;
import java.awt.event.*;

public class FirstAWT {

    public FirstAWT() {
        Frame f = new Frame();
        f.setSize(400, 800);
        f.setTitle("Information");

        Label l = new Label("Name: ");
        Label l2 = new Label("Selected: ");
        Button btn = new Button("Submit");
        TextField textField = new TextField();
        TextArea textArea = new TextArea();
        Checkbox CheckBox1 = new Checkbox("c++");
        Checkbox CheckBox2 = new Checkbox("java", true);
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox CheckBox3 = new Checkbox("c++", checkboxGroup, false);
        Checkbox CheckBox4 = new Checkbox("java", checkboxGroup, true);
        Choice choice = new Choice();
        choice.add("JAVA");
        choice.add("PYTHON");
        choice.add("C++");

        l.setBounds(20, 80, 80, 30);
        l2.setBounds(20, 360, 80, 30);
        textField.setBounds(20, 120, 80, 30);
        btn.setBounds(40, 160, 50, 30);
        textArea.setBounds(20, 190, 80, 80);
        CheckBox1.setBounds(20, 280, 80, 30);
        CheckBox2.setBounds(20, 320, 80, 30);
        CheckBox3.setBounds(120, 280, 80, 30);
        CheckBox4.setBounds(120, 320, 80, 30);
        choice.setBounds(20, 400, 80, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.GRAY);
                String textAreaString = textField.getText();
                l.setText(textAreaString);
                textField.setText("CLICKED");

                String data = choice.getItem(choice.getSelectedIndex());
                l2.setText("Selected :" + data);

            }
        });

        choice.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                l2.setText(e.getItem().toString());

            }
        });

        f.add(l);
        f.add(l2);
        f.add(textField);
        f.add(btn);
        f.add(textArea);
        f.add(CheckBox1);
        f.add(CheckBox2);
        f.add(CheckBox3);
        f.add(CheckBox4);
        f.add(choice);

        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();

            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }

        });
    }

    public static void main(String[] args) {
        FirstAWT firstAWT = new FirstAWT();
    }
}