package Arrays.Medium;

import java.util.HashMap;

// TIME Complexity check
// LEETCODE
public class twosumvariant1 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int ans[] = sum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    /*
     * // Brute Force
     * Time Complexity: O(N^2), where N = size of the array.
     * Reason: There are two loops(i.e. nested) each running for approximately N
     * times.
     * 
     * Space Complexity: O(1) as we are not using any extra space.
     * 
     * public static int[] sum(int arr[], int target) {
     * // Another way to print array is to create ans array and then put values of i
     * // and j in it
     * // int ans[] = { -1, -1 };
     * for (int i = 0; i < arr.length; i++) {
     * for (int j = i + 1; j < arr.length; j++) {
     * if (arr[i] + arr[j] == target) {
     * return new int[] { i, j };
     * // ans[0] = i;
     * // ans[1] = j;
     * // return ans;
     * 
     * }
     * }
     * }
     * return new int[] {};
     * // return ans;
     * }
     */

    // Efficient & Optimal Approach(Hashing)
    // Space Complexity=O(N) as we use the map data structure.
    // Time Complexity: O(N), where N = size of the array.
    // The loop runs N times in the worst case and searching in a hashmap takes O(1)
    // generally. So the time complexity is O(N).
    public static int[] sum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreneed = target - num;
            if (map.containsKey(moreneed)) {
                return new int[] { map.get(moreneed), i };
            }
            map.put(num, i);
        }
        return new int[] {};
    }
}
