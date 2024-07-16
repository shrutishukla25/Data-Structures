package Patterns;

/*
* * * * *  
* * * * 
* * * 
* * 
* 
 */
//TC=O(n^2)
//SC=O(1)
public class pt4 {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
