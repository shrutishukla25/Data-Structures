package Patterns;
/*
A 
B B 
C C C 
D D D D 
E E E E E 
 */

public class pt15 {
    public static void main(String[] args) {
        char c = 'A';
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            c++;
            System.out.println();
        }
    }
}
