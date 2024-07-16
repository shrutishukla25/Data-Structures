package Arrays.Medium;

import java.util.Scanner;

public class inputmatrixarrayusingsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int columns = 4;
        int[][] a = new int[rows][columns];
        System.out.println("Enter your array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < rows; i++) {
            // for rows
            for (int j = 0; j < columns; j++) {
                // for columns
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
