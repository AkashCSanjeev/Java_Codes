import java.io.File;

public class SeeAllFiles {
    public static void main(String[] args) {
        File f = new File("C:\\NOTES\\JAVA code");
        String fileName[] = f.list();
        for (String file : fileName) {
            System.out.println(file);
        }
    }
}
