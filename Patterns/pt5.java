package Patterns;
/*
    *      
   ***     
  *****    
 *******   
********* 
 */

//Tc=O(n^2);

public class pt5 {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 5; j > i + 1; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

}
