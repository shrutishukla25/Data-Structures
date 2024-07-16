package BitManipulation;

import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;// 0101 pos1 is 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the updated number that you want ");
        int update = sc.nextInt();
        int bitmask = 1 << pos;
        if (update == 1) {
            // ie if we wanna update 0->1 ;
            System.out.println(bitmask | n);
        } else {
            // ie if we wanna update 1->0
            int pos2 = 2; // 0101 pos2 is 1
            bitmask = 1 << pos2;

            int notbitmask = ~(bitmask);
            System.out.println(notbitmask & n);
        }
        sc.close();
    }
}
