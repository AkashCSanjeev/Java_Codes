import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class sequenceInputStream {
    public static void main(String[] args) {
        /**
         * Reads the file int he sequential order it is passes
         */

        try {
            FileInputStream fin1 = new FileInputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\fileOut.txt");
            FileInputStream fin2 = new FileInputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\fileBuffer.txt");
            SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
            int i;
            while ((i = sin.read()) != -1)
                System.out.print((char) i);

            sin.close();
            fin2.close();
            fin1.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
