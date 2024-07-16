package Patterns;

/*
E 
D E 
C D E 
B C D E 
A B C D E 
 */
public class pt17 {
    public static void main(String[] args) {
        // char ch = 'E';
        for (int i = 0; i < 5; i++) {
            for (char ch = (char) (int) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }
}
