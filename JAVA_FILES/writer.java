import java.io.FileWriter;
import java.io.Writer;

public class writer {
    public static void main(String[] args) {
        /**
         * Used to write string
         */
        try {
            Writer w = new FileWriter("C:\\NOTES\\JAVA code\\JAVA_FILES\\writerOutput.txt");
            String s = "Hello Writer";
            w.write(s);
            w.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
