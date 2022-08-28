import java.util.Scanner;

class Multithreading extends Thread {

    @Override
    public void run() {

        try {

            System.out.println("Thread : " + Thread.currentThread().getId() + " is running ");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

public class Threading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. threads required : ");
        int n = sc.nextInt();

        try {

            for (int i = 0; i < n; i++) {
                Multithreading mt = new Multithreading();
                mt.sleep(2000);
                mt.start();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
