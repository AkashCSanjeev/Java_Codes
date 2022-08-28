import java.io.FileOutputStream;

public class fileOutputStream {
    public static void main(String[] args) {
        /**
         * FileOutputStream uses bytes to write the data (i.e 65 is the ASCII for 'A')
         * Used mostly for byte-oriented data
         */

        /**
         * Write a single character into the file
         */

        try {
            FileOutputStream out = new FileOutputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\fileOut.txt");
            out.write(65);
            out.close();
            System.out.println("Success....");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * Writes an entire line into the file
         */

        try {
            FileOutputStream out = new FileOutputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\fileOut.txt");
            String s = "Hello File";
            byte string[] = s.getBytes();
            out.write(string);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
