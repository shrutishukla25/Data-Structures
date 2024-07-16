package Patterns;

/*
   A   
  ABA  
 ABCBA 
ABCDCBA
 */
public class pt16 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            char c = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(c);
                if (j < breakpoint) {
                    c++;
                } else {
                    c--;
                }
            }
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
