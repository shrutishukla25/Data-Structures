import java.util.HashMap;

public class SW6 {
    // Length of Longest substring with k unique characters
    // variable size sliding window used
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;// Condition is there can be 3 unique characters
        int i = 0, j = 0;
        int longlen = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() == 0) {
            longlen = 0;
        }
        while (j < s.length()) {
            char a = s.charAt(j);
            map.put(a, map.getOrDefault(a, 0) + 1);

            if (map.size() > k) {
                while (map.size() > k && i < s.length()) {
                    char b = s.charAt(i);
                    map.put(b, map.get(b) - 1);
                    if (map.get(b) == 0) {
                        map.remove(b);
                    }
                    i++;
                }
            }
            if (map.size() == k) {
                // Its necessary to check this condition here
                longlen = Math.max(longlen, j - i + 1);
            }
            j++;
        }
        if (k > map.size()) {
            longlen = s.length();
            // THIS CONDITION WILL WORK WHEN OUR STRING IS
            // LIKE="uvtptxgtckttipjpnewpc";or"aaaaaaaa"
            // WHEN there is not enough unique charcters than length of that substring is
            // returned.
        }
        System.out.println("length = " + longlen);
    }
}
/*
 * //BRUTE FORCE
 * // Java program to find the longest substring
 * // with k unique characters in a given string
 * import java.util.*;
 * 
 * public class p1 {
 * 
 * // Function to calculate length of
 * // longest substring with k characters
 * static void longestKSubstr(String s, int k) {
 * 
 * int n = s.length();
 * int answer = -1;
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j <= n; j++) {
 * HashSet<Character> distinct = new HashSet<Character>();
 * for (int x = i; x < j; x++) {
 * distinct.add(s.charAt(x));
 * }
 * if (distinct.size() == k) {
 * answer = Math.max(answer, j - i);
 * }
 * }
 * }
 * 
 * System.out.println(answer);
 * }
 * 
 * public static void main(String[] args) {
 * String s = "aaaaaaaa";
 * int k = 3;
 * 
 * // Function Call
 * longestKSubstr(s, k);
 * }
 * }
 * 
 */