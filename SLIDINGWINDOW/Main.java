import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Sort array of 0's ,1's and 2's
        List<Integer> l = new ArrayList<>();
        int arr[] = { 0, 1, 2, 2, 2, 1, 2, 0, 0 };
        for (int a : arr) {
            l.add(a);
        }
        int mid = 0, low = 0, high = arr.length - 1;
        while (mid <= high) {
            if (l.get(mid) == 0) {
                Collections.swap(l, mid, low);
                mid++;
                low++;
            }
            if (l.get(mid) == 1) {
                mid++;
            }
            if (l.get(mid) == 2) {
                Collections.swap(l, mid, high);
                high--;
            }
        }
        System.out.print(l);
    }
}
