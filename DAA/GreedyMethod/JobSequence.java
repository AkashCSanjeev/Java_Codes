import java.util.Arrays;

public class JobSequence {

    static void jobSequnce(int profit[], int deadlines[], int deadline) {

        int maxProfit = 0;
        int solutionSet[] = new int[deadline];
        Arrays.fill(solutionSet, -1);

        for (int i = 0; i < deadlines.length; i++) {
            int max = 0;
            for (int j = 0; j < profit.length; j++) {
                if (profit[j] > profit[max])
                    max = j;
            }

            for (int j = deadlines[max] - 1; j >= 0; j--) {
                if (solutionSet[j] == -1) {
                    solutionSet[j] = max + 1;
                    maxProfit = maxProfit + profit[max];
                    profit[max] = 0;
                    break;
                }
            }

            if (profit[max] != 0)
                profit[max] = 0;

        }

        System.out.println(Arrays.toString(solutionSet));
        System.out.println("Max Profit : " + maxProfit);

    }

    public static void main(String[] args) {
        // System.out.println("Enter number of object: ");
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // float profit[] = new float[n];
        // float weight[] = new float[n];

        // System.out.println("Enter Profit : ");
        // for (int i = 0; i < n; i++)
        // profit[i] = sc.nextInt();

        // System.out.println("Enter Weight : ");
        // for (int i = 0; i < n; i++)
        // weight[i] = sc.nextInt();

        // System.out.println("enter bag weight : ");
        // int bag_weight = sc.nextInt();

        int profit[] = { 35, 30, 25, 20, 15, 12, 5 };
        int deadlines[] = { 3, 4, 4, 2, 3, 1, 2 };

        jobSequnce(profit, deadlines, 4);

    }
}
