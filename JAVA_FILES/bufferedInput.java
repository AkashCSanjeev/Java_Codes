import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class bufferedInput {
    public static void main(String[] args) {
        /**
         * Parent lass is FilterInputStream
         */

        try {
            FileInputStream fin = new FileInputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\fileBuffer.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1)
                System.out.print((char) i);

            bin.close();
            fin.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
