package Strings;

public class reversestring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shruti");
        int front = 0;
        int back = sb.length() - 1;
        while (front < back) {
            char frontchar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontchar);
            front++;
            back--;
        }
        System.out.println(sb);
    }
}
