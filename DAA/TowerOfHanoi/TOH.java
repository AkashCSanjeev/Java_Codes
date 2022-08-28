import java.util.Scanner;

class TOH {
    static void towerOfHanoi(int Disk, String Source, String Aux, String Dest) {

        if (Disk == 1) {
            System.out.println("Mover from " + Source + " to " + Dest);
            return;

        } else {
            towerOfHanoi(Disk - 1, Source, Dest, Aux);
            System.out.println("Mover from " + Source + " to " + Dest);
            towerOfHanoi(Disk - 1, Aux, Source, Dest);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter Number of Disks: ");
        int Disks = new Scanner(System.in).nextInt();

        System.out.println("\nSolution:\n");
        towerOfHanoi(Disks, "Source", "Aux", "Dest");

    }
}
