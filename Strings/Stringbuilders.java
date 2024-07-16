package Strings;

public class Stringbuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Coco");
        // String sb= Coco with type string builder
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        System.out.println(sb.insert(0, 'i'));
        System.out.println(sb.delete(3, 4));
        sb.append("l");
        sb.append("l");
        System.out.println(sb);
    }
}
