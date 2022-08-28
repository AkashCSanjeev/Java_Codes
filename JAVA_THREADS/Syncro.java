
/*
 * When synchronized key word is added the first thread is run first then the second and so on
 */

class Table {
    synchronized void print(int num) {
        for (int i = 0; i < 5; i++)
            System.out.println(num * (i + 1));
    }
}

class OP1 extends Thread {
    Table t;

    OP1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.print(5);
    }

}

class OP2 extends Thread {
    Table t;

    OP2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.print(100);
    }
}

public class Syncro {
    public static void main(String[] args) {

        Table t = new Table();

        OP1 o1 = new OP1(t);
        OP2 o2 = new OP2(t);
        o1.start();
        o2.start();

    }

}
