import java.io.RandomAccessFile;

public class RandomAccessRead {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("C:\\NOTES\\JAVA code\\JAVA_FILES\\randomWrite.txt", "r");
            rf.seek(0);
            byte b[] = new byte[(int) rf.length()];
            rf.read(b);
            rf.close();

            System.out.println(new String(b));

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
