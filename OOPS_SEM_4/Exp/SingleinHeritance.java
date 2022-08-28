class parent {

    void print() {
        System.out.println("Inside parent class");
    }

}

public class SingleinHeritance extends parent {
    public static void main(String[] args) {
        SingleinHeritance s = new SingleinHeritance();
        s.print();
    }

}