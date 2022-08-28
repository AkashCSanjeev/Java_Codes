import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.*;

class First {
    public First() {
        System.out.println("a");
    }
}

class Second extends First {
    public Second() {
        System.out.println("b");
    }
}

class Third extends Second {
    public Third() {
        System.out.println("c");
    }
}

class Person {
    public static void main(String[] args) {

        // try {
        // File file = new File("C:\\Users\\AKASH
        // SANJEEV\\OneDrive\\Desktop\\test.txt");

        // BufferedReader reader = new BufferedReader(new FileReader(file));

        // String s;
        // int sumOfNum = 0;

        // while ((s = reader.readLine()) != null) {

        // sumOfNum = sumOfNum + Integer.parseInt(s);

        // }

        // System.out.println("Sum: " + sumOfNum);
        // } catch (Exception e) {
        // // TODO: handle exception
        // }
        // String s1 = new String("geeksforgeeks");
        // String s2 = new String("geeksforgeeks");
        // if (s1 == s2)
        // System.out.println("Equal");
        // else
        // System.out.println("Not equal");

        Third third = new Third();

    }

    // System.out.println();

}

// }
