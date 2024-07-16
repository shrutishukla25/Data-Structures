package Arrays.Medium;

import java.util.*;
/* Brute Force= Step 1: Find all possible permutations of elements present and store them.{Using recusrion}

Step 2: Search input from all possible permutations

Step 3: Print the next permutation present right after it.
TC=O(N!*N)
*/

// time Complexity=O(3N)
//Space Complexity=O(1)// List already given we havent created it for storing extra space
/*public class NextPermutation {
    public static void main(String[] args) {

        List<Integer> A = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
        int index = -1;
        int n = A.size();
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.sort(A);
        }

        for (int i = n - 1; i >= index; i--) {
            if (A.get(i) > A.get(index)) {
                Collections.swap(A, index, i);
                break;
            }
        }
        List<Integer> shortlist = A.subList(index + 1, n);
        Collections.sort(shortlist);
        System.out.println(A);
    }
}*/
// this code can also be wriitten as
//time Complexity=O(3N)
//Space Complexity=O(1)
public class NextPermutation {
    static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int index = -1;
        int n = A.size();
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(A);
            return A;
            // Reverse method used here
        }

        for (int i = n - 1; i >= index; i--) {
            if (A.get(i) > A.get(index)) {
                int temp = A.get(index);
                A.set(index, A.get(i));
                A.set(i, temp);

                // Used instead of Collections.swap
                break;
            }
        }
        List<Integer> shortlist = A.subList(index + 1, n);
        Collections.sort(shortlist);
        return A;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
        List<Integer> ans = nextGreaterPermutation(A);
        System.out.println(ans);
    }
}
// Using array
/*
 * public static void main(String args[]) {
 * int nums[]={2, 1, 5, 4, 3, 0, 0 };
 * int index=-1;
 * int n=nums.length;
 * // Finding the breakpoint
 * for(int i=n-2;i>=0;i--){
 * if(nums[i]<nums[i+1]){
 * index=i;
 * break;
 * }
 * }
 * if(index==-1){
 * Arrays.sort(nums);
 * }
 * else{
 * for(int i=n-1;i>=index;i--){
 * if(nums[i]>nums[index]){
 * int temp=nums[index];
 * nums[index]=nums[i];
 * nums[i]=temp;
 * break;
 * }
 * }
 * Arrays.sort(nums,index+1,n);// n here is non inclusive
 * }
 * 
 * 
 * for(int i=0;i<n;i++){
 * System.out.print(nums[i]+" ");
 * }
 * 
 * }
 */