package TopBasicCodes;

import java.util.*;

// TIME COMPLEXITY O(n*logn) for sorting
// TWO STRINGS ARE SAID TO BE ANAGRAMS IF THEY CONTAIN SAME CHARACTER BUT IN
// DIFFERENT ORDER
/*
 * public class IfAnagram {
 * public static boolean areAnagrams(char c1[], char c2[]) {
 * if (c1.length != c2.length) {
 * return false;
 * }
 * for (int i = 0; i < c1.length; i++) {
 * if (c1[i] != c2[i]) {
 * return false;
 * }
 * }
 * return true;
 * }
 * 
 * public static void main(String[] args) {
 * String s1 = "Shruti";
 * String s2 = "ruShti";
 * char c1[] = s1.toCharArray();
 * char c2[] = s2.toCharArray();
 * Arrays.sort(c1);
 * Arrays.sort(c2);
 * System.out.println("Strings are Anagram " + areAnagrams(c1, c2));
 * // System.out.println(Arrays.equals(c1, c2));
 * 
 * }
 * }
 */
//TIME COMPLEXITY=O(N)(CHECK)
//Space COmplexity=O(alphabetsize)
public class IfAnagram {
    public static boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        for (char a : s1.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (char b : s2.toCharArray()) {
            if (map.containsKey(b)) {
                map.put(b, map.get(b) - 1);
            } else {
                return false;
            }
        }
        for (int v : map.values()) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s1 = "aabc";
        String s2 = "abacc";
        System.out.println(isAnagram(s1, s2));

    }
}