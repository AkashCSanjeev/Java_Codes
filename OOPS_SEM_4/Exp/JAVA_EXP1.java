import java.util.Scanner;

class EXP1 {

    EXP1(int a, int b, int c) {

        double discriminant = (b * b) - (4 * a * c);

        System.out.println("The equation : " + a + "x^2 " + b + "x " + c);

        if (discriminant < 0) {
            System.out.println("No Real Roots");
            System.out.println();
        } else {
            System.out.println("X1 : " + ((-b + Math.sqrt(discriminant)) / (2 * a)));
            System.out.println("X2 : " + -((-b - Math.sqrt(discriminant)) / (2 * a)));
            System.out.println();
        }

    }

    void calculateAreaTriangle(int height, int base) {
        System.out.println("The area of triangle : " + 0.5 * base * height);
        System.out.println();
    }

    void checkIfLeapYear(int year) {
        if (year % 4 == 0)
            System.out.println("Yes, It's a leap year");
        else
            System.out.println("Not a leap year");

    }

}

class JAVA_EXP1 {

    public static void main(String[] args) {
        // Q1 & Q2 & Q4 & Q6 & Q12>
        Scanner sc = new Scanner(System.in);
        int a, b, c, height, base, year;
        System.out.println("-------------------------Q1 & Q6-------------------------------");
        System.out.println("--------------Constructor & Quadratic Roots--------------------");
        System.out.println("Enter A : ");
        a = sc.nextInt();
        System.out.println("Enter B : ");
        b = sc.nextInt();
        System.out.println("Enter C : ");
        c = sc.nextInt();
        EXP1 ex = new EXP1(a, b, c);
        System.out.println();
        System.out.println("-------------------------Q12 & Q2-------------------------------");
        System.out.println("------------------Class & Triangle Area-------------------------");
        System.out.println("Enter height : ");
        height = sc.nextInt();
        System.out.println("Enter base : ");
        base = sc.nextInt();
        ex.calculateAreaTriangle(height, base);
        System.out.println();
        System.out.println("-------------------------Q4-------------------------------");
        System.out.println("---------------------Leap Year----------------------------");
        System.out.println("Enter year : ");
        year = sc.nextInt();
        ex.checkIfLeapYear(year);
    }

}