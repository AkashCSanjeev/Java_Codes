import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class bufferedOutput {
    public static void main(String[] args) {
        /**
         * Used to create a buffer(Store some data for some time)
         * help to increase the performance'
         * Parent class is FilteredOutputStream
         * Flush is used when you have connected two Streams
         * In this case we have connected FileOutputStream and BufferedOutputStream
         */

        try {
            FileOutputStream fout = new FileOutputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\fileBuffer.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Hello Buffer";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success...");

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
