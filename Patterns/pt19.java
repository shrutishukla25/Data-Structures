package Patterns;

/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */
public class pt19 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            k += 2;
            System.out.println();
        }
        int inis = 8;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            inis -= 2;
            System.out.println();
        }
    }
}
/*
 * for(int i=0;i<5;i++){
 * for(int j=5;j>i;j--){
 * System.out.print("*");
 * }
 * for(int j=0;j<i;j++){
 * System.out.print(" ");
 * }
 * for(int j=0;j<i;j++){
 * System.out.print(" ");
 * }
 * for(int j=5;j>i;j--){
 * System.out.print("*");
 * }
 * 
 * System.out.println();
 * }
 * for(int i=0;i<5;i++){
 * for(int j=0;j<=i;j++){
 * System.out.print("*");
 * }
 * for(int j=5;j>i+1;j--){
 * System.out.print(" ");
 * }
 * for(int j=5;j>i+1;j--){
 * System.out.print(" ");
 * }
 * for(int j=0;j<=i;j++){
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 */