
class Threads1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }

}

class Threads2 implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i < 20; i++)
            System.out.println(i);
    }

}

public class RunnableThread {
    public static void main(String[] args) {
        Threads1 r1 = new Threads1();
        Threads2 r2 = new Threads2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();

        t2.start();
    }
}
