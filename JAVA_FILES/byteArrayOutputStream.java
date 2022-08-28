import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class byteArrayOutputStream {
    public static void main(String[] args) {
        /**
         * This is used to write the same thing to different files
         */
        try {
            FileOutputStream out1 = new FileOutputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\byteArray1.txt");
            FileOutputStream out2 = new FileOutputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\byteArray2.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(out1);
            bout.writeTo(out2);

            bout.flush();
            bout.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
