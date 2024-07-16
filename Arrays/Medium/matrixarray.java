package Arrays.Medium;

public class matrixarray {
    public static void main(String[] args) {

        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };// thid reperesents that there are two rows and three columns;
        for (int i = 0; i < 2; i++) {
            // for rows
            for (int j = 0; j < 3; j++) {
                // for columns
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
