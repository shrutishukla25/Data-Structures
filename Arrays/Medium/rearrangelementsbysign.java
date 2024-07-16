package Arrays.Medium;

/*There is an array ‘A’ of size ‘N’ with equal number of positive and negative elements.

Without altering the relative order of positive and negative numbers, you must return an array of alternative positive and negative values. */
//import java.util.ArrayList;

public class rearrangelementsbysign {
    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };
        int modified[] = new int[nums.length];
        modified = (posneg(nums));
        for (int i = 0; i < modified.length; i++) {
            System.out.print(modified[i] + " ");
        }
    }

    /*
     * Every consecutive pair of integers have opposite signs.
     * For all integers with the same sign, the order in which they were present in
     * nums is preserved.
     * The rearranged array begins with a positive integer.
     * Return the modified array after rearranging the elements to satisfy the
     * aforementioned conditions.
     * Example 1:
     * Input: nums = [3,1,-2,-5,2,-4]
     * Output: [3,-2,1,-5,2,-4]
     * Explanation:
     * The positive integers in nums are [3,1,2]. The negative integers are
     * [-2,-5,-4].
     * The only possible way to rearrange them such that they satisfy all conditions
     * is [3,-2,1,-5,2,-4].
     * Other ways such as [1,-2,2,-5,3,-4](not following 2nd condtn),
     * [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are
     * incorrect
     */
    // Brute force Solution
    // Time Complexity=O(N+N/2);approx O(2N)
    // Space COmplexity=O(2N) (check); {arraylist and modified array}
    /*
     * static int[] posneg(int nums[]) {
     * ArrayList<Integer> positive = new ArrayList<>();// stores n/2
     * ArrayList<Integer> negative = new ArrayList<>();// stored n/2
     * int mod[] = new int[nums.length];
     * for (int i = 0; i < nums.length; i++) {
     * if (nums[i] > 0) {
     * positive.add(nums[i]);
     * } else {
     * negative.add(nums[i]);
     * }
     * }
     * for (int i = 0; i < nums.length / 2; i++) {
     * mod[2 * i] = positive.get(i);
     * mod[2 * i + 1] = negative.get(i);
     * }
     * return mod;
     * }
     */
    // Better Approach
    // TC=O(N), SC=O(N)
    // 3, 1, -2, -5, 2, -4
    static int[] posneg(int nums[]) {
        int posindex = 0, negindx = 1;
        int n = nums.length;
        int modified[] = new int[nums.length];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                modified[posindex] = nums[i];
                posindex += 2;
            } else {
                modified[negindx] = nums[i];
                negindx += 2;
            }
        }
        return modified;
    }
}
