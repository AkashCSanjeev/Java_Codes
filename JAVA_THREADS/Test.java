
class Threads1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }

}

class Threads2 extends Thread {

    @Override
    public void run() {
        for (int i = 10; i < 20; i++)
            System.out.println(i);
    }

}

class Test {
    public static void main(String[] args) {

        Threads1 t1 = new Threads1();
        Threads2 t2 = new Threads2();
        t1.start();
        t2.start();

    }
}