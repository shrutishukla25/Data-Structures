package TopBasicCodes;
//DONE IN LEETCODE

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    /*
     * public static void main(String[] args) {
     * String s = "AABCE";
     * for (int i = 0; i < s.length(); i++) {
     * boolean unique = true;
     * for (int j = 0; j < s.length(); j++) {
     * if (i != j && s.charAt(i) == s.charAt(j)) {
     * unique = false;
     * break;
     * }
     * }
     * if (unique) {
     * System.out.println("FIRST NON REPEATING CHARACTER IS " + s.charAt(i));
     * break;
     * }
     * }
     * }
     */
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "ssshhruuuti";
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First non repeatong character is " + e.getKey());
                break;
            }
        }
    }
}
