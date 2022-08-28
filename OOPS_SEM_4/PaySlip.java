import java.util.*;

class Employee {
    String name;
    String mobile;
    int id;
    float baseSalary;

    public Employee(String name, String mobile, int id, float baseSalary) {
        this.name = name;
        this.mobile = mobile;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    void display() {
        double hra, da, ta, gross, gpf, tax;
        da = 0.34 * baseSalary;
        hra = 0.18 * (da + baseSalary);
        ta = 3600 + (0.34 * 3600);
        gross = baseSalary + da + ta + hra;
        gpf = 0.1 * gross;
        tax = 0.2 * gross;
        System.out.print("\nDA : Rs " + da);
        System.out.print("\nHRA : Rs " + hra);
        System.out.print("\nTA : Rs " + ta);
        System.out.print("\nGross : Rs " + gross);
        System.out.print("\nGPF : Rs " + gpf);
        System.out.print("\nTax : Rs " + tax);
        System.out.print("\nDeduction : Rs " + (gpf + tax));
        System.out.println("\nNet : Rs " + (gross - gpf - tax));
        System.out.println();
        System.out.println();
        System.out.println();
    }

    void details() {
        System.out.print("\nEmployee Name : " + name);
        System.out.print("\nEmployee phone no. : " + mobile);
        System.out.print("\nEmployee ID : " + id);
        System.out.print("\nEmployee Basic Salary : " + baseSalary);
    }
}

public class PaySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, id = 1;
        float baseSalary;
        String name, mobile;
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("Enter Choice: ");
            System.out.println("\t 1. Add employee");
            System.out.println("\t 2. Get employee PaySlip");
            System.out.println("\t 3. Show all employees");
            System.out.println("\t 4. Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the Employee name : ");
                    name = sc.next();
                    System.out.println("Enter the Employee ID : " + id);
                    System.out.println("Enter the Employee phone no. : ");
                    mobile = sc.next();
                    System.out.println("Enter the basic salary in Rs : ");
                    baseSalary = sc.nextFloat();
                    employees.add(new Employee(name, mobile, id, baseSalary));
                    id++;
                    break;
                case 2:
                    System.out.println("Enter Employee ID: ");
                    int x = sc.nextInt();
                    System.out.println("***************************************************");
                    System.out.println(" PAY SLIP");
                    System.out.println("***************************************************\n");
                    employees.get(x - 1).details();
                    employees.get(x - 1).display();
                    break;

                case 3:
                    for (int i = 0; i < employees.size(); i++) {
                        employees.get(i).details();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                    }
                    break;

                case 4:
                    sc.close();
                    return;

            }
        }

    }
}
