package BitManipulation;

public class setbit {
    // convert any bit to 1 (0->1... 1->1)
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        System.out.println(bitmask | n);
    }
}
