package TopBasicCodes;

public class ReplaceSubstringinAString {
    public static void main(String[] args) {
        String s1 = "I am a Star Star";
        String old = "Star";
        String news = "Moon";
        System.out.println(s1.replace(old, news));
        // replaceAll method can also be used here
    }
}
