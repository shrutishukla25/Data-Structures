package Patterns;
/*
 1      1
 12    21
 123  321
 12344321
 */

public class pt10 {
    public static void main(String args[]) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    /*
     * //Another way of writing
     * public class Main
     * {
     * public static void main(String[] args) {
     * int n=4;
     * for (int i = 1; i <= n; i++) {
     * for (int j = 1; j <= i; j++) {
     * System.out.print(j);
     * }
     * for(int j=0;j<2*(n-i);j++){
     * System.out.print(" ");
     * }
     * 
     * for (int j = i; j > 0; j--) {
     * System.out.print(j);
     * }
     * System.out.println();
     * }
     * }
     * }
     */
    /*
     * //or we can write like
     * public class Main
     * {
     * public static void main(String[] args) {
     * int n=4;
     * for (int i = 1; i <= n; i++) {
     * for (int j = 1; j <= i; j++) {
     * System.out.print(j);
     * }
     * for(int j=n;j>i;j--){
     * System.out.print(" ");
     * }
     * for(int j=n;j>i;j--){
     * System.out.print(" ");
     * }
     * for (int j = i; j > 0; j--) {
     * System.out.print(j);
     * }
     * System.out.println();
     * }
     * }
     * }
     */
}
