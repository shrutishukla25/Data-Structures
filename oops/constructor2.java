
class Student {
    String name;
    int age;

    void info() {
        System.out.println("Name is " + this.name + " Age is " + this.age);
    }

    Student() {
        // Our function will work fine without creating this non parameterised
        // constructor.
        // cause when we dont create a constructor , java itself creates one
        System.out.println("Is Present");
    }
}

public class constructor2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student() is non parameterised constructor
        s1.name = "Shruti";
        s1.age = 22;
        s1.info();
    }
}
