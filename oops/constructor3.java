
/*
A copy constructor in a Java class is a constructor that creates
 an object using another object of the same Java class.
 That's helpful when we want to copy a complex object that has several fields,
  or when we want to make a deep copy of an existing object */
class Studentx {
    String name;
    int age;

    void info() {
        System.out.println("Name is " + this.name + " Age is " + this.age);
    }

    Studentx(Studentx s1) {
        // This is a copy constructor
        this.name = s1.name;
        this.age = s1.age;
    }

    Studentx() {

    }
}

public class constructor3 {
    public static void main(String[] args) {
        Studentx s = new Studentx();
        s.name = "shruti";
        s.age = 24;
        s.info();
        // first we created a non parameterised constructor s
        // And then we copied all info of s to s1
        // Now we want to copy all this Information of s in another object s1
        // Studentx
        Studentx s1 = new Studentx(s);
        s1.info();
        /*
         * Destructors in Java also known as finalizers are non-deterministic.
         * The allocation and release of memory are implicitly handled by the garbage
         * collector in Java
         */

    }
}
