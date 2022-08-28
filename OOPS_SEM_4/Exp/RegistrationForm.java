
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Form {
    Form() {
        Frame frame = new Frame("Registration Form");
        frame.setSize(700, 650);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.DARK_GRAY);
        Font fontB = new Font("Courier New", Font.BOLD, 17);
        Font font = new Font("Courier New", Font.PLAIN, 17);
        Font fonts = new Font("Courier New", Font.PLAIN, 14);

        Label head = new Label("Registration Form");
        head.setBounds(300, 25, 200, 50);
        head.setForeground(Color.LIGHT_GRAY);
        head.setFont(fontB);
        frame.add(head);

        Label name = new Label("Name :");
        name.setBounds(50, 100, 50, 50);
        name.setForeground(Color.LIGHT_GRAY);
        name.setFont(fonts);
        frame.add(name);

        TextField nametext = new TextField();
        nametext.setBounds(180, 115, 150, 20);
        frame.add(nametext);

        Label fName = new Label("Father's Name :");
        fName.setBounds(50, 150, 100, 50);
        fName.setForeground(Color.LIGHT_GRAY);
        fName.setFont(fonts);
        frame.add(fName);

        TextField fNametext = new TextField();
        fNametext.setBounds(180, 165, 150, 20);
        frame.add(fNametext);

        Label gender = new Label("Gender :");
        gender.setBounds(50, 200, 100, 50);
        gender.setForeground(Color.LIGHT_GRAY);
        gender.setFont(fonts);
        frame.add(gender);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", cbg, false);
        Checkbox female = new Checkbox("Female", cbg, false);
        male.setBounds(180, 200, 50, 50);
        female.setBounds(255, 200, 70, 50);
        male.setForeground(Color.lightGray);
        female.setForeground(Color.lightGray);
        male.setFont(fonts);
        female.setFont(fonts);
        frame.add(male);
        frame.add(female);

        Label dob = new Label("Date of birth :");
        dob.setBounds(50, 250, 100, 50);
        dob.setForeground(Color.LIGHT_GRAY);
        dob.setFont(fonts);
        frame.add(dob);

        Choice DOBday = new Choice();
        for (int i = 1; i <= 31; i++) {
            DOBday.add(i + "");
        }
        DOBday.setBounds(180, 265, 40, 20);
        frame.add(DOBday);

        Choice DOBmonth = new Choice();
        for (int i = 1; i <= 12; i++) {
            DOBmonth.add(i + "");
        }
        DOBmonth.setBounds(220, 265, 50, 20);
        frame.add(DOBmonth);

        Choice DOByear = new Choice();
        for (int i = 1950; i <= 2050; i++) {
            DOByear.add(i + "");
        }
        DOByear.setBounds(270, 265, 60, 20);
        frame.add(DOByear);

        Label address = new Label("Address :");
        address.setBounds(50, 300, 100, 50);
        address.setForeground(Color.LIGHT_GRAY);
        address.setFont(fonts);
        frame.add(address);

        TextArea addressText = new TextArea("", 3, 100, TextArea.SCROLLBARS_NONE);
        addressText.setBounds(180, 320, 150, 100);
        frame.add(addressText);

        Label phoneNo = new Label("Phone No. :");
        phoneNo.setBounds(50, 450, 100, 50);
        phoneNo.setForeground(Color.LIGHT_GRAY);
        phoneNo.setFont(fonts);
        frame.add(phoneNo);

        TextField fPhoneNo = new TextField();
        fPhoneNo.setBounds(180, 465, 150, 20);
        frame.add(fPhoneNo);

        Label email = new Label("Email :");
        email.setBounds(50, 500, 100, 50);
        email.setForeground(Color.LIGHT_GRAY);
        email.setFont(fonts);
        frame.add(email);

        TextField fEmail = new TextField();
        fEmail.setBounds(180, 505, 150, 20);
        frame.add(fEmail);

        Checkbox condition = new Checkbox("I accept the terms and conditions");
        condition.setForeground(Color.lightGray);
        condition.setBounds(50, 530, 500, 50);
        condition.setFont(fontB);
        frame.add(condition);

        Button submit = new Button("Submit");
        submit.setBounds(180, 590, 100, 30);
        submit.setForeground(Color.lightGray);
        submit.setFont(fontB);
        frame.add(submit);

        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (condition.getState() == true) {
                    Dialog d = new Dialog(frame, "Submitted", true);
                    d.setLayout(new FlowLayout());
                    Button b = new Button("OK");
                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            d.setVisible(false);
                        }
                    });
                    d.add(new Label("Click button to continue."));
                    d.add(b);
                    d.setSize(300, 100);
                    d.setBounds(300, 200, 300, 100);
                    d.setVisible(true);
                } else {
                    Dialog d = new Dialog(frame, "Need to check conditions", true);
                    d.setLayout(new FlowLayout());
                    Button b = new Button("OK");
                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            d.setVisible(false);
                        }
                    });
                    d.add(new Label("Click button to continue."));
                    d.add(b);
                    d.setSize(300, 100);
                    d.setBounds(300, 200, 300, 100);
                    d.setVisible(true);
                }

            }

        });

        frame.addWindowListener(new WindowListener() {

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
                frame.dispose();

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

public class RegistrationForm {
    public static void main(String[] args) {
        Form f = new Form();
    }
}
