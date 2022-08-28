
class Action<T> {

    void print(T t) {
        System.out.println(t);
    }

}

public class GenericClass {

    public static void main(String[] args) {

        Action<Integer> i = new Action<Integer>();
        i.print(Integer.valueOf(10));

        Action<String> s = new Action<String>();
        s.print(new String("kjhgfds"));

    }
}
