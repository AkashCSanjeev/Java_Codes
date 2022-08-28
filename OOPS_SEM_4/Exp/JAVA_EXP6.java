import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Output {

    Output() {
        try {

            FileReader input = new FileReader("PaySlipInput.txt");
            FileWriter writer = new FileWriter("PaySlipOutput.txt");

            int i;
            String employee[] = { "", "", "", "" };
            int count = 0;

            while ((i = input.read()) != -1) {
                if (count == 4) {

                    double bp = Double.parseDouble(employee[3]);
                    double da = 0.34 * bp;
                    double hra = 0.18 * (da + bp);
                    double ta = 3600 + (0.34 * 3600);
                    double gross = bp + da + hra + ta;
                    double gpf = 0.1 * gross;
                    double tax = 0.2 * gross;
                    double net = gross - gpf - tax;

                    String s1 = "-----------------------------------------------------------\n";
                    String s2 = "Basic Information: \n\t Name: " + employee[1] +
                            " \n\t Employee ID: " + employee[0] +
                            " \n\t Designation: " + employee[2] + "\n";
                    String s3 = "Pay Slip:\n\t" +
                            "Base Pay : " + bp +
                            "\n\tDA : " + da +
                            "\n\tHRA : " + hra +
                            "\n\tTA : " + ta +
                            "\n\tGross : " + gross +
                            "\n\tGPF : " + gpf +
                            "\n\tTAX : " + tax +
                            "\n\tNet : " + net + "\n\n";
                    System.out.println(s1);
                    System.out.println(s2);
                    System.out.println(s3);

                    writer.append(s1);
                    writer.append(s2);
                    writer.append(s3);

                    count++;
                    count = count % 5;

                    employee[0] = "";
                    employee[1] = "";
                    employee[2] = "";
                    employee[3] = "";
                } else if ((char) i == ' ' || (char) i == '\n') {
                    count++;
                    count = count % 5;
                } else {
                    employee[count] = employee[count] + (char) i;
                }
            }
            input.close();
            writer.close();
            System.out.println("-----------------------------------------------------------");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Input {

    Input() {
        Scanner sc = new Scanner(System.in);
        char check;
        try {
            FileWriter writer = new FileWriter("PaySlipInput.txt");
            while (true) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Enter n to stop else type anything");
                check = sc.next().charAt(0);
                sc.nextLine();

                if (check == 'n' || check == 'N')
                    break;

                System.out.println("Enter Employee Name : ");
                String name = sc.nextLine();
                System.out.println("Enter Employee ID : ");
                String ID = sc.nextLine();
                System.out.println("Enter Employee Designation : ");
                String des = sc.nextLine();
                System.out.println("Enter Base Pay : ");
                String basePay = sc.nextLine();
                System.out.println("\n\n");

                String content = ID + " " + name + " " + des + " " + basePay + " \n";
                writer.append(content);

            }
            writer.close();
            System.out.println("-----------------------------------------------------------");
            Output output = new Output();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

public class JAVA_EXP6 {
    public static void main(String[] args) {
        Input input = new Input();
    }
}