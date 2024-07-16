package TopBasicCodes;

import java.util.HashMap;

public class AnagramDifference {
    public static int getMinimumAnagramDifference(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (char a : str1.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (char b : str2.toCharArray()) {
            if (map.containsKey(b)) {
                map.put(b, map.get(b) - 1);
                if (map.get(b) == 0) {
                    map.remove(b);
                }
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "aabc";
        String s2 = "abacc";
        System.out.println(getMinimumAnagramDifference(s1, s2));
    }
}
