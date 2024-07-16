package Arrays.Medium;

import java.util.*;

public class LeadersinanArray {
    public static void main(String[] args) {
        // BRUTE FORCE TC=O(N^2) SC=O(1)
        /*
         * int arr[] = { 1, 0, 2, 2, 1, 0 };
         * int n = arr.length;
         * for (int i = 0; i < n - 1; i++) {
         * boolean leader = true;
         * for (int j = i + 1; j < n; j++) {
         * if (arr[j] >= arr[i]) {
         * leader = false;
         * break;
         * }
         * /*
         * if (arr[i] > arr[j]) {
         * continue;
         * } else {
         * leader = false;
         * break;
         * }
         */
        /*
         * }
         * if (leader) {
         * System.out.print(arr[i] + " ");
         * }
         * }
         * System.out.println(arr[n - 1]);
         */

        // OPTIMAL APPROACH
        // TC=O(N) SC=O(N)
        int arr[] = { 1, 2, 2, 1 };
        int n = arr.length;
        List<Integer> l = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                l.add(arr[i]);
            }
            max = Math.max(arr[i], max);
        }
        System.out.println(l);
    }
}
