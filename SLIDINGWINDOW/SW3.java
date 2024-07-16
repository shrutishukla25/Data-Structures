import java.util.HashMap;

public class SW3 {
    // Count Occurences of anagram in a string
    public static void main(String args[]) {
        String text = "aabaabaa";
        String word = "aaba";
        int k = word.length();
        HashMap<Character, Integer> wmap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        int i = 0, j = 0;
        int anagramcount = 0;
        for (char c : word.toCharArray()) {
            wmap.put(c, wmap.getOrDefault(c, 0) + 1);
        }
        while (j < text.length()) {
            tmap.put(text.charAt(j), tmap.getOrDefault(text.charAt(j), 0) + 1);
            if (j - i + 1 == k) {
                if (wmap.equals(tmap)) {
                    anagramcount++;
                }
                tmap.put(text.charAt(i), tmap.getOrDefault(text.charAt(i), 0) - 1);
                if (tmap.get(text.charAt(i)) == 0) {
                    tmap.remove(text.charAt(i));
                    // tmap should only contain 4 characters for comparison with wmap so we have to
                    // remove extra character
                }
                i++;
            }
            j++;
        }
        System.out.println(anagramcount);
    }
}
/*
 * import java.util.*;
 * 
 * //Time Complexity: O(l1logl1 + l2logl2)
 * //Auxiliary space: O(l1 + l2).
 * 
 * public class bruteforce {
 * public static boolean areanagram(String word, String s) {
 * char c1[] = word.toCharArray();
 * char c2[] = s.toCharArray();
 * Arrays.sort(c1);
 * Arrays.sort(c2);
 * if (Arrays.equals(c1, c2)) {
 * return true;
 * }
 * return false;
 * }
 * 
 * public static void main(String args[]) {
 * String text = "aabaabaa";
 * String word = "aaba";
 * String s = "";
 * int anagramcount = 0;
 * int k = word.length();
 * for (int i = 0; i <= text.length() - k; i++) {
 * s = text.substring(i, i + k);
 * if (areanagram(word, s)) {
 * anagramcount++;
 * }
 * 
 * }
 * System.out.println(anagramcount);
 * }
 * }
 */