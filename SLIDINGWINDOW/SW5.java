public class SW5 {
    // Find length of Largest Subarray of sum K
    // USe of variable size sliding window
    public static void main(String args[]) {
        // this solution will work only if array contains positive numbers and zeroes
        // this is Optimised approach with time complexity=O(N) and space
        // complexity=O(1).
        int arr[] = { 1, 3, 2, 5 };
        int i = 0, j = 0;
        int k = 5, sum = 0;
        int maxsize = Integer.MIN_VALUE;
        // Here length of largest subarray of sum=3,is going to be 3=>{1,1,1};
        while (j < arr.length) {
            sum += arr[j];
            if (sum == k) {
                maxsize = Math.max(maxsize, j - i + 1);
            }
            if (sum > k) {
                while (sum > k && i < arr.length) {
                    sum -= arr[i];
                    i++;
                }

                if (sum == k) {
                    maxsize = Math.max(maxsize, j - i + 1);
                }
                // in this array only this condition will provide correct length=2, so this if
                // condtn is important

            }
            j++;
        }
        System.out.print("Length = " + maxsize);
    }
}
/*
 * // This is an efficient approach with
 * // Time Complexity: O(N), where N is the length of the given array.
 * // Auxiliary Space: O(N), for storing the maxLength in the HashMap.
 * // this solution will work in all cases negative numbers, positive numbers
 * and
 * // zeroes
 * 
 * public static void main(String[] args) {
 * int arr[] = { 10, 5, 2, 7, 1, 9 } };
 * int k = 15;
 * int sum = 0;
 * int maxlen = 0;
 * HashMap<Integer, Integer> map = new HashMap<>();
 * for (int i = 0; i < arr.length; i++) {
 * sum += arr[i];
 * if (sum == k) {
 * maxlen = i + 1;
 * }
 * if (!map.containsKey(sum)) {
 * map.put(sum, i);
 * }
 * if (map.containsKey(sum - k)) {
 * if (maxlen < i - map.get(sum - k)) {
 * maxlen = i - map.get(sum - k);
 * }
 * }
 * }
 * System.out.println(maxlen);
 * }
 * }
 */

/*
 * Time Complexity: O(N^2), for calculating the sum of all subarrays.
 * Auxiliary Space: O(1), as constant extra space is required.
 * //BRUTE FORCE
 * 
 * public static void main(String[] args) {
 * int arr[] = { -5, 8, -14, 2, 4, 12 };
 * int k = -5;// This represents conditon or sum that we want in subarray total
 * sum should be
 * // -5
 * int sum = 0;
 * int maxlen = Integer.MIN_VALUE;
 * // BRUTE FORCE
 * for (int i = 0; i < arr.length; i++) {
 * for (int j = i; j < arr.length; j++) {
 * sum += arr[j];
 * if (sum == k) {
 * maxlen = Math.max(maxlen, j - i + 1);
 * }
 * }
 * }
 * System.out.println("Length = " + maxlen);
 * }
 */
