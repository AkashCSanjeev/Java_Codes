import java.io.FileReader;
import java.io.Reader;

public class reader {
    public static void main(String[] args) {
        try {
            Reader r = new FileReader("C:\\NOTES\\JAVA code\\JAVA_FILES\\writerOutput.txt");
            int data = r.read();

            while (data != -1) {
                System.out.print((char) data);
                data = r.read();
            }
            r.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
