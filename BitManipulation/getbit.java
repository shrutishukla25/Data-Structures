package BitManipulation;

public class getbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is one");
        }
    }
}
