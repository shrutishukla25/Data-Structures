package Arrays.Medium;

public class buyandsellstock {
    // best time to buy and sell stock out of 6 days
    // time complexity=O(N);
    // space complexity=O(1);
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int profit = 0, mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);// remembering the past {Dynamic Programming}
        }

        System.out.print("Maximum Profit that I will get is " + "\n" + profit + "\n"
                + "and for the profit to be maximum I have to buy stock at cost Rs " + "\n" + mini + "\n" +
                "and need to sell it at Rs " + "\n" + (mini + profit) + "\n");
    }
}
