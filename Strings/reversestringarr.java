package Strings;

// REVERSE STRING WHEN GIVEN IN FORM OF ARRAY
public class reversestringarr {
    public static void main(String[] args) {
        char s[] = { 's', 'h', 'r', 'u', 't', 'i' };
        int front = 0;
        int back = s.length - 1;
        while (front < back) {
            char temp = s[front];
            s[front] = s[back];
            s[back] = temp;
            front++;
            back--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        // reverse normal String
        String k = "shruti";
        String rev = "";
        for (int i = k.length() - 1; i >= 0; i--) {
            rev += k.charAt(i);

        }
        System.out.print(rev + " ");
    }
}
