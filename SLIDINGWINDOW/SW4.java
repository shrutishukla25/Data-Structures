
//import java.util.ArrayList;
import java.util.*;

public class SW4 {
    // Maximum number in all subarrays of size k
    // USE of queue and sliding window
    /*
     * Time Complexity: O(N). It seems more than O(N) at first look. It can be
     * observed that every element of the array is added and removed at most once.
     * So there are a total of 2n operations.
     * Auxiliary Space: O(K). Elements stored in the dequeue take O(K) space.
     */
    public static void main(String args[]) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        // ans 78,90,90,90,89
        int k = 3;
        Deque<Integer> Qi = new LinkedList<>();
        // Index of maximum number is added in this queue
        int i = 0, j = 0;
        while (j < arr.length) {
            while (!Qi.isEmpty() && arr[j] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(j);
            if (j - i + 1 == k) {
                System.out.print(arr[Qi.peek()] + " ");
                while (!Qi.isEmpty() && Qi.peek() <= i) {
                    Qi.removeFirst();
                }
                i++;
            }
            j++;
        }
    }
}
/*
 * Time Complexity: O(N * K), The outer loop runs N-K+1 times and the inner loop
 * runs K times for every iteration of the outer loop. So time complexity is
 * O((n-k+1)*k) which can also be written as O(N * K)
 * Auxiliary Space: O(1)
 * 
 * // Brute force
 * public class p {
 * public static void main(String[] args) {
 * int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
 * int k = 3;
 * for (int i = 0; i <= arr.length - k; i++) {
 * int max = arr[i];
 * for (int j = 1; j < k; j++) {
 * if (arr[i + j] > max) {
 * max = arr[i + j];
 * }
 * }
 * System.out.print(max + " ");
 * 
 * }
 * }
 * }
 */