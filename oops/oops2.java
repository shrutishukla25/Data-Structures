
class Pen {
    /*
     * The final keyword is a non-access modifier used for classes, attributes and
     * methods, which makes them non-changeable (impossible to inherit or override)
     */
    // This class is blueprint of object pen {means it will define properties and
    // methods of pen}
    String color;// blue,black
    String type; // ball,gel

    void write() {
        System.out.println("writing");
    }
    // Each object has some properties and methods.
    // This properties and method are called data(String,int) and
    // members(methods,functions) of class.
}

public class oops2 {
    public static void main(String[] args) {
        // Creating object of class pen
        Pen p1 = new Pen();
        p1.color = "blue";// Properties are acccessed like this
        p1.type = "ballpoint";
        p1.write();// non static method calling
        // Pen.write();{if method we are calling is static then this is how it is
        // called}
    }
}
