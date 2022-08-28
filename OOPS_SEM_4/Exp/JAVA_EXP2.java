import java.util.Scanner;

class Calculator {
    Calculator() {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter Num 1: ");
        a = sc.nextInt();
        System.out.println("Enter Num 2: ");
        b = sc.nextInt();

        System.out.println("Enter Operation: ");
        System.out.println("\t1. +");
        System.out.println("\t2. -");
        System.out.println("\t3. *");
        System.out.println("\t4. >");
        System.out.println("\t5. <");
        System.out.println("\t6. =");
        System.out.println("\t7. AND");
        System.out.println("\t8. OR");
        System.out.println("\t9. Exclusive OR");
        System.out.println("\t10. /");
        c = sc.nextInt();

        switch (c) {

            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a > b);
                break;
            case 5:
                System.out.println(a < b);
                break;
            case 6:
                System.out.println(a == b);
                break;
            case 7:
                System.out.println(a & b);
                break;
            case 8:
                System.out.println(a | b);
                break;
            case 9:
                System.out.println(a ^ b);
                break;
            case 10:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Wrong Argument try again");

        }
    }
}

class Sorting {

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    void bubble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }

    void selection(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int max = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[max])
                    max = j;
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }

    void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

}

public class JAVA_EXP2 {
    public static void main(String[] args) {

        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------PATTERNS----------------------------\n");
        System.out.println("Enter Number of Rows: ");
        rows = sc.nextInt();

        // Q1> Pattern 1
        System.out.println("----------------------PATTERN 1----------------------------");
        for (int i = 0; i <= rows; i++) {

            for (int j = 0; j < i; j++)
                System.out.print(j + 1 + " ");

            System.out.println();

        }
        System.out.println();

        // Q2> Pattern 2
        System.out.println("----------------------PATTERN 2----------------------------");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i - 1; j++)
                System.out.print("1 ");

            for (int k = 0; k <= i; k++)
                System.out.print(i + 1 + " ");

            System.out.println();

        }
        System.out.println();

        // Q12 Pattern 3
        System.out.println("----------------------PATTERN 3----------------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++)
                System.out.print((j + 1) % 2 + " ");

            System.out.println();
        }
        System.out.println();

        // Q13 Pattern 4
        System.out.println("----------------------PATTERN 4----------------------------");
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1 + " ");
            int count = i + 1;
            for (int j = 0; j < i; j++) {
                count = count + rows - j - 1;
                System.out.print(count + " ");
            }

            System.out.println();
        }
        System.out.println();

        // Q14 Pattern 5
        System.out.println("----------------------PATTERN 5----------------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == i) {
                    System.out.print(i + " ");
                } else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println();

        // Calculator
        System.out.println("----------------------CALCULATOR----------------------------");
        Calculator c;
        while (true) {
            System.out.println("Enter 1 to use and anything else to exit");
            int i = sc.nextInt();
            if (i == 1)
                c = new Calculator();
            else
                break;

        }

        // Sorting
        System.out.println("----------------------SORTING----------------------------");
        System.out.println("---------------------------------------------------------");

        System.out.println("Enter no. of elements: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Sorting sorting = new Sorting();
        System.out.println("----------------------BUBBLE----------------------------");
        sorting.bubble(arr);
        System.out.println("\n----------------------SELECTION----------------------------");
        sorting.selection(arr);
        System.out.println("\n----------------------INSERTION----------------------------");
        sorting.insertion(arr);

    }
}
