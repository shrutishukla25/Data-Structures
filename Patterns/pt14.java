package Patterns;
/*
A B C D E 
A B C D 
A B C 
A B 
A 
 */

public class pt14 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (char c = 'A'; c <= 'A' + i - 1; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
/*
 * 
 * public class Main
 * {
 * public static void main(String[] args) {
 * for(char c='E';c>='A';c--){
 * for(char m='A';m<=c;m++){
 * System.out.print(m+" ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */
