import java.util.HashMap;

public class SW7 {
    // Length of longest substring with no repeating(all unique) characters
    // So in previous ques6 k unique characters were required in a window of any
    // size
    // And in this question all unique characters are required in a window(which
    // means number of unique characters should be equal to windowsize)
    public static void main(String args[]) {
        String s = "abcabcbb";
        int i = 0, j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = Integer.MIN_VALUE;
        if (s.length() == 0) {
            maxlen = 0;
        }

        while (j < s.length()) {
            char a = s.charAt(j);
            map.put(a, map.getOrDefault(a, 0) + 1);
            if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1 && i < s.length()) {
                    char b = s.charAt(i);
                    map.put(b, map.get(b) - 1);
                    if (map.get(b) == 0) {
                        map.remove(b);
                    }
                    i++;
                }
            }
            if (map.size() == j - i + 1) {
                maxlen = Math.max(maxlen, j - i + 1);
            }
            j++;
        }
        System.out.println("Length of longest substring with no repeating(all unique) characters = " + maxlen);
    }
}
