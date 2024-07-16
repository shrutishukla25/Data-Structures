package Arrays.Medium;

//import java.util.*;

// Majority element is element that occurs more than n/2 times.
public class Majorityelement {
    public static void main(String[] args) {
        /*
         * // Brute force
         * // Time Complexity=O(N^2);
         * // Space=O(1);
         * int arr[]={2,2, 3, 3, 1, 2, 2 };
         * int count=0;
         * for(int i=0;i<arr.length;i++){
         * count=1;
         * for(int j=i+1;j<arr.length;j++){
         * if(arr[i]==arr[j]){
         * count++;
         * }
         * }
         * if(count>arr.length/2){
         * System.out.print("Yes element present and it is "+arr[i]+" ");
         * break;
         * }
         * }
         * if(count<arr.length/2){
         * System.out.print("Element not found");
         * }
         * 
         * 
         * // Better USing Hashing
         * // time complexity=O(N*logN)+O(N);(check)
         * /*
         * We are using a map data structure. Insertion in the map takes logN time. And
         * we are doing it for N elements. So, it results in the first term O(N*logN).
         * The second O(N) is for checking which element occurs more than floor(N/2)
         * times
         */
        // Space Complexity=O(N);
        // we are using additonal space complexity here so we need to optimise it more
        /*
         * int arr[] = { 2, 2, 3, 3, 1, 2, 2 };
         * int n = arr.length;
         * int s = n / 2;
         * Map<Integer, Integer> mp = new HashMap<>();
         * for (int a : arr) {
         * mp.put(a, mp.getOrDefault(a, 0) + 1);
         * }
         * for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
         * if (e.getValue() > s) {
         * System.out.print("Majority element is " + e.getKey());
         * break;
         * }
         * }
         */

        // optimised approach (moore's voting algorithm)
        // tc=O(N) sc=O(1)
        int arr[] = { 2, 2, 3, 3, 1, 2, 2 };
        int n = arr.length;
        int el = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                el = arr[i];
                count = 1;

            } else if (arr[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        // Given:You may assume that the majority element always exists in the array.
        // so we can directly print el=nums[i];
        System.out.print("Majority element is " + el);
        /*
         * if it was not given that majority element is always present then we wiil have
         * to check if majority element if present or not
         * int count1=0;
         * for(int i=0;i<n;i++){
         * if(arr[i]==el){
         * count1++;
         * }
         * }
         * if(count1>n/2){
         * System.out.print("Majority element present is "+el);
         * }else{
         * System.out.print("Majority element is not present  ");
         * }
         * This loop will then make tc=O(2N)
         */

    }
}
