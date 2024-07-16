
//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
// Question SOLVED in CODING_NINJAS

public class SW2 {
    // First Negative Number in every Window of Size K
    // Time Complexity: O(n)

    // Auxiliary Space: O(k)// k here is window size
    public static void main(String[] args) {
        int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        int i = 0, j = 0;
        List<Integer> l = new ArrayList<>();
        while (j < arr.length) {
            if (arr[j] < 0) {
                l.add(arr[j]); // l={-1,-7,-15};
            }
            if (j - i + 1 == k) {
                if (l.isEmpty()) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(l.get(0) + " ");
                    if (arr[i] == l.get(0)) {
                        l.remove(0);
                    }
                }
                i++;
            }
            j++;
        }
    }
}
/*
 * Time Compleaxity=O((n-k)*k){both loops traversal}
 * which can also be written as O(nk) when k is comparatively much smaller than
 * n,
 * Auxiliary Space: O(1) as it is using constant space for variables
 * 
 * public class bruteforce {
 * public static void main(String args[]) {
 * int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
 * int k = 3;
 * 
 * for (int i = 0; i <= arr.length - k; i++) {
 * boolean flag = false;
 * for (int j = i; j < i + k; j++) {
 * if (arr[j] < 0) {
 * System.out.print(arr[j] + " ");
 * flag = true;
 * break;
 * }
 * }
 * if (flag == false) {
 * System.out.println("0");
 * }
 * }
 * }
 * }
 */