package Patterns;

/*
A
A B 
A B C 
A B C D 
A B C D E 
 */
public class pt13 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (char c = 'A'; c <= 'A' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
