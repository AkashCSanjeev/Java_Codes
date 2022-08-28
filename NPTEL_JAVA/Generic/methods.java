class methods {

    static <T> void display(T t) {
        System.out.println(t);
    }

    static <T> void swap(T t1, T t2) {
        T temp = t1;
        t1 = t2;
        t2 = temp;

        System.out.println("After : " + t1 + " " + t2);
    }

    static <T> void printArray(T t[]) {
        for (T x : t) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static <T> void printArrayEllipsis(T... t) {
        for (T x : t) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void printArrayObj(Object... o) {
        for (Object x : o) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        display(1000);
        display("lkjhgfdsa");
        display(3.0002);
        display(true);

        // Integer a = new Integer(10); -----> Deprecated
        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf(20);

        System.out.println("Before : " + a + " " + b);
        swap(a, b);

        // To pass variable arguments we can use :
        // -> array
        Integer c[] = { 1, 2, 3 };
        Integer d[] = { 1, 2, 3, 1, 2, 3 };
        printArray(c);
        printArray(d);
        // -> ellipsis (...)
        printArrayEllipsis(1, true, 3);
        printArrayEllipsis(1, 2, 3, 4, 5, 6);
        // ->Object class
        printArrayObj(1, 2.23, true, "kjhg");

    }
}