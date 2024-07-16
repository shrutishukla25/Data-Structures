package Arrays.Medium;

import java.util.ArrayList;
import java.util.*;

// In Brute force use any sorting algorithm (Merge Sort)

/*
 * // Sort array of 0's,1's and 2's in java
 * // we can sort it using any of sorting algo's
 * // Better Approach Time Complexity=O(2N)
 * // Space=O(1){not using any extra space}
 * public class sortarray012 {
 * public static void main(String args[]) {
 * int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
 * int cnt0 = 0;
 * int cnt1 = 0;
 * int cnt2 = 0;
 * for (int i = 0; i < arr.length; i++) {
 * if (arr[i] == 0) {
 * cnt0++;
 * } else if (arr[i] == 1) {
 * cnt1++;
 * } else {
 * cnt2++;
 * }
 * }
 * for (int i = 0; i < cnt0; i++) {
 * arr[i] = 0;
 * }
 * for (int i = cnt0; i < cnt0 + cnt1; i++) {
 * arr[i] = 1;
 * 
 * }
 * for (int i = cnt0 + cnt1; i < arr.length; i++) {
 * arr[i] = 2;
 * }
 * for (int i = 0; i < cnt0 + cnt1 + cnt2; i++) {
 * System.out.print(arr[i] + " ");
 * }
 * }
 * }
 */

// MOSt Optimal Solution
// Dutch National Flag Algorithm
//If,else-if ladder is very important in such questions, (or else output will be wrong)
public class sortarray012 {
    public static void main(String args[]) {
        int a[] = { 0, 1, 2, 0, 1, 2, 1, 0 };
        List<Integer> arr = new ArrayList<>();
        for (int n : a) {
            arr.add(n);
        }
        int n = arr.size();
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                Collections.swap(arr, mid, low);
                // we could write index in any order
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                Collections.swap(arr, high, mid);
                high--;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}