package Patterns;
/*
 * Time Complexity
O(NxN)

There are two nested loops and both are running exactly N times, so time complexity would be the order of NxN.

Hence the time complexity is O(NxN). 

Space Complexity
O(1). 

Since we are using constant extra space.

Hence the space complexity is O(1).
 */

public class pt1 {
    // ****
    // ****
    // ****
    // ****

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
