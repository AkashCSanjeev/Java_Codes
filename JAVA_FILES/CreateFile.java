import java.io.File;

class CreateFile {
    public static void main(String[] args) {

        /**
         * To create a file
         */

        try {
            File file = new File("newText.txt");

            if (file.exists()) {
                System.out.println("File Already Exists");
                System.out.println(file);
                System.out.println(file.getAbsolutePath());

            } else {
                file.createNewFile();
                System.out.println("File created");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}