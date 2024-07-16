import java.util.HashMap;

public class SW8 {
    /*
     * Same as Pick toys...Fruit into Baskets
     * You are visiting a farm that has a single row of fruit trees arranged from
     * left to right. The trees are represented by an integer array fruits where
     * fruits[i] is the type of fruit the ith tree produces.
     * 
     * You want to collect as much fruit as possible. However, the owner has some
     * strict rules that you must follow:
     * 
     * You only have two baskets, and each basket can only hold a single type of
     * fruit. There is no limit on the amount of fruit each basket can hold.
     * Starting from any tree of your choice, you must pick exactly one fruit from
     * every tree (including the start tree) while moving to the right. The picked
     * fruits must fit in one of your baskets.
     * Once you reach a tree with fruit that cannot fit in your baskets, you must
     * stop.
     * Given the integer array fruits, return the maximum number of fruits you can
     * pick.s
     */
    public static void main(String[] args) {
        // 1)int k=2(cause each basket can only hold a single type of fruit.)
        /*
         * 2)you must pick exactly one fruit from every tree (including the start tree)
         * while moving to the right (means we have to pick distinct(unique) characters
         * )
         */
        // 3)You want to collect as much fruit as possible (means maximum)
        // So here we have to length of longest subarray with k unique chars where k=2;

        int fruits[] = { 1, 2, 3, 2, 2 };
        int k = 2;// Condition is there can be 3 unique characters
        int i = 0, j = 0;
        int longlen = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        if (fruits.length == 0) {
            longlen = 0;
        }
        while (j < fruits.length) {
            int a = fruits[j];
            map.put(a, map.getOrDefault(a, 0) + 1);

            if (map.size() > k) {
                while (map.size() > k && i < fruits.length) {
                    int b = fruits[i];
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
            longlen = fruits.length;
        }
        System.out.println("length = " + longlen);
    }
}
