public class ExceptionHandling {

    void print() {
        System.out.println("Print");
    }

    public static void main(String[] args) {
        try {
            int a = 3 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        try {
            int arr[] = { 1, 2, 3 };
            for (int i = 0; i <= arr.length; i++)
                System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound");
        }

        try {
            ExceptionHandling exceptionHandling = null;
            exceptionHandling.print();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer ");
        }

        try {
            int a = Integer.parseInt("a1");
        } catch (NumberFormatException e) {
            System.out.println("Number Format");
        }
    }
}
