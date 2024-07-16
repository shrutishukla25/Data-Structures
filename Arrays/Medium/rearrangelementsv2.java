package Arrays.Medium;

import java.util.ArrayList;

//import java.util.ArrayList;

/*There is an array ‘A’ of size ‘N’ with unequal number of positive and negative elements.

Without altering the relative order of positive and negative numbers, you must return an array of alternative positive and negative values. 
Start the array with a positive number. */
//TC=O(2N) SC=O(N)
public class rearrangelementsv2 {
    public static void main(String[] args) {
        int arr[] = { -1, -2, 3, -4, -3, 1 };
        // Output=3,-1,1,-2,-4,-3
        int modified[] = new int[arr.length];
        ArrayList<Integer> positive = new ArrayList<>();// stores n/2
        ArrayList<Integer> negative = new ArrayList<>();// stored n/2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        if (positive.size() > negative.size()) {
            for (int i = 0; i < negative.size(); i++) {
                modified[2 * i] = positive.get(i);
                modified[2 * i + 1] = negative.get(i);
            }
            int index = negative.size() * 2;
            for (int i = negative.size(); i < positive.size(); i++) {
                modified[index] = positive.get(i);
                index++;
            }

        } else {
            for (int i = 0; i < positive.size(); i++) {
                modified[2 * i] = positive.get(i);
                modified[2 * i + 1] = negative.get(i);
            }
            int index = positive.size() * 2;
            for (int i = positive.size(); i < negative.size(); i++) {
                modified[index] = negative.get(i);
                index++;
            }
        }
        System.out.print("Modified array is ");
        for (int i = 0; i < modified.length; i++) {
            System.out.print(modified[i] + " ");
        }

    }
}
