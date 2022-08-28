import java.io.FileInputStream;

public class fileInputStream {
    public static void main(String[] args) {
        /**
         * Just reads one letter or one byte
         * here reads 72 and then we need to convert it into character using typecasting
         */
        try {
            FileInputStream in = new FileInputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\fileOut.txt");
            int i = in.read();
            System.out.println(i);
            System.out.println((char) i);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * Read all the characters
         */

        try {
            FileInputStream in = new FileInputStream("C:\\NOTES\\JAVA code\\JAVA_FILES\\fileOut.txt");
            int i = 0;
            while ((i = in.read()) != -1) {

                System.out.print((char) i);
            }
            in.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
