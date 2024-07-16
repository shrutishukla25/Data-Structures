package Arrays.Medium;

import java.util.*;

// CODING NINJAS

public class twosumvariant2 {
    public static void main(String[] args) {
        int book[] = { 1, 3, 1, 3, 4 };
        int target = 6;
        System.out.println(read(book, target));
    }
    /*
     * Efficient Approach
     * public static String read(int[] book, int target) {
     * HashMap<Integer, Integer> map = new HashMap<>();
     * for (int i = 0; i < book.length; i++) {
     * int num = book[i];
     * int moreneed = target - num;
     * if (map.containsKey(moreneed)) {
     * return "YES";
     * }
     * map.put(num, i);
     * }
     * return "NO";
     * }
     */

    /*
     */
    // Optimal Approach {Using two pointers}
    public static String read(int[] book, int target) {
        int left = 0, right = book.length - 1;
        // First Sort Array
        // TC=O(N) SC=O(1)
        Arrays.sort(book);
        while (left < right) {
            if (book[left] + book[right] == target) {
                return "YES";
            } else if (book[left] + book[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return "NO";
    }
}
