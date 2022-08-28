import java.util.Arrays;

class Knapsack {

    static void knapsack(float profit[], float weight[], int bag_weight) {
        float pw[] = new float[profit.length];
        float ans[] = new float[profit.length];
        float maxProfit = 0;

        for (int i = 0; i < pw.length; i++) {
            pw[i] = profit[i] / weight[i];
        }
        System.out.println("P/W : " + Arrays.toString(pw));

        while (bag_weight > 0) {
            int max = 0;
            for (int i = 0; i < pw.length; i++) {
                if (pw[i] > pw[max])
                    max = i;
            }

            while ((weight[max] > 0) && (bag_weight > 0)) {
                bag_weight--;
                weight[max]--;
                ans[max]++;
                maxProfit = maxProfit + pw[max];
            }
            pw[max] = 0;

        }

        System.out.println("Max profit : " + maxProfit);
        System.out.println("Solution Set : " + Arrays.toString(ans));

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

        float profit[] = { 10, 5, 15, 7, 6, 18, 3 };
        float weight[] = { 2, 3, 5, 7, 1, 4, 1 };

        knapsack(profit, weight, 15);

    }
}