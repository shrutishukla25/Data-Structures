package Patterns;

public class pt07 {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (4 * 2) - ((2 * i) + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
