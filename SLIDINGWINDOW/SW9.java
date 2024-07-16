import java.util.HashMap;

public class SW9 {
    static String returnmin(String s, String t) {
        // Minimum Window Substring
        // (return length of smallest substring in a give string)
        int i = 0, j = 0, start = 0;
        int count = t.length();
        int minlen = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        while (j < s.length()) {
            char A = s.charAt(j);
            if (map.containsKey(A)) {
                if (map.get(A) > 0) {
                    count--;
                }
                map.put(A, map.get(A) - 1);
            } else {
                map.put(A, map.getOrDefault(A, 0) - 1);
            }
            if (count == 0) {
                while (count == 0 && i < s.length()) {
                    if (minlen > j - i + 1) {
                        minlen = j - i + 1;
                        start = i;
                        // Here start will be assigned only when any other substring with length less
                        // than minlen appears ,,,, even if any other substring with same length as
                        // minlen occurs start=i, value wouldnt change for that other substring with
                        // same length(for eg. s=cabwefgewcwaefgcf, t=cae There are two substring here
                        // cwae and aefg with same length so it should necessrily return cwae )
                        // Writing minlen like this is compulsory
                    }
                    char B = s.charAt(i);
                    map.put(B, map.get(B) + 1);
                    if (map.get(B) > 0) {
                        count++;
                    }
                    i++;
                }
            }
            j++;
        }
        return minlen == Integer.MAX_VALUE ? "no string found" : s.substring(start, start + minlen);
        // Here it will return s.substring(9,13)
        // which will print BANC from 9to12 i.e. one index before 13

    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(returnmin(s, t));
    }
}
