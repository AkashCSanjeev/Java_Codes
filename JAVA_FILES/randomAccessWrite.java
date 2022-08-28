import java.io.RandomAccessFile;

public class randomAccessWrite {
    public static void main(String[] args) {

        /**
         * To insert in between
         */
        try {
            RandomAccessFile rf = new RandomAccessFile("C:\\NOTES\\JAVA code\\JAVA_FILES\\randomWrite.txt", "rw");
            rf.seek(rf.length());
            String s = " Akash";
            byte b[] = s.getBytes();
            rf.write(b);
            rf.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
