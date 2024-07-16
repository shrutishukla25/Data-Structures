
// It is the mechanism in Java by which one class is allowed to inherit the

// features(properties and methods) of another class. In Java, Inheritance means
// creating new classes based on existing ones.
/*
 * Code Reusability: The code written in the Superclass is common to all
 * subclasses. Child classes can directly use the parent class code.
 * Method Overriding: Method Overriding is achievable only through Inheritance.
 * It is one of the ways by which Java achieves Run Time Polymorphism.
 * Abstraction: The concept of abstract where we do not have to provide all
 * details is achieved through inheritance. Abstraction only shows the
 * functionality to the user.
 */
// Single Level Inheritance
class Shape {
    String color;
}

class Triangle extends Shape {
    // triangle class here inherits the properties and methods of class Shape;
    void print() {
        System.out.println("Color is " + this.color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.color = "red";
        t.print();
    }
}
