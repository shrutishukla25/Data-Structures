package Patterns;

public class pt20 {
    public static void main(String[] args) {
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
        int k = 2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("*");
            }
            k += 2;
            System.out.println();
        }
    }
}
