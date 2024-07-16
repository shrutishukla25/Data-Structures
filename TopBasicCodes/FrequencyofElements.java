package TopBasicCodes;

import java.util.*;

//CALCULATE FREQUENCY OF CHARACTERS IN A STRING
public class FrequencyofElements {
    /*
     * public static void main(String[] args) {
     * String s = "ssshhruuuti";
     * int n = s.length();
     * int temp[] = new int[n];
     * Arrays.fill(temp, -1);
     * for (int i = 0; i < n; i++) {
     * int count = 1;
     * for (int j = i + 1; j < n; j++) {
     * if (s.charAt(i) == s.charAt(j)) {
     * count++;
     * temp[j] = 0;
     * }
     * }
     * if (temp[i] != 0) {
     * temp[i] = count;
     * }
     * }
     * for (int i = 0; i < n; i++) {
     * if (temp[i] != 0) {
     * System.out.println(s.charAt(i) + " OCCURS " + temp[i] + " TIMES");
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
            System.out.println(e.getKey() + " OCCURS " + e.getValue() + "TIMES");
        }
    }
}
