package BitManipulation;

public class clearbit {
    public static void main(String args[]) {
        // clear bit= convert any bit to 0 (1->0... 0->0)
        int n = 5;// 0101
        int pos = 2;
        int bitmask = 1 << pos;
        int notbitmask = ~(bitmask);
        System.out.println(notbitmask & n);
    }
}
