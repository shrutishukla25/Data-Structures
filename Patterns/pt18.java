package Patterns;
/*
D 
D C 
D C B 
D C B A 
 */

public class pt18 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            char c = (char) (int) ('A' + n - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
        }
    }
}
/*
 * 
 * public class Main{
 * public static void main(String args[]){
 * for(int i=0;i<4;i++){
 * for(char ch='D';ch>=(char)(int)('D'-i);ch--){
 * System.out.print(ch+" ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */