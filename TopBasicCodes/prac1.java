package TopBasicCodes;

public class prac1 {
    /*
     * public static int main(String[] args) {
     * System.out.println("1");
     * return 0;
     * }
     */// NOT ALLOWED IN JAVA AS WELL
       // MAIN METHOD DONOT RETURN ANYTHING ELSE THAN VOID
    public static void main(String[] args) {
        int a = 9;
        a = a / 2;// IT WILL RETURN 4 AND NOT 4.5
        // cause a is integer not float
        System.out.println(a);

    }
}
