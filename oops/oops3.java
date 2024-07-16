
// By convention in java Class Name starts with Capital letter
// and method name starts with small letter
class Pen1 {
    // Pen class is already define in previous class so this class name should be
    // something else or our objects will
    // acceess Pen class of previous file
    String color;
    String type;

    void coloris() {
        System.out.println(this.color);
        // this keyword here will define that p object is calling it and will print
        // color of p
    }

    void write() {
        System.out.println(this.type + " is in use ");
    }

}

public class oops3 {
    public static void main(String args[]) {
        Pen1 p = new Pen1();
        // Pen1() here is a constructor
        // Constructors are used to construct (make) objects
        // Properties of constructors
        /*
         * 1- Constructor name should be same as class name
         * 2- Constructors are functions but constructors does not have return type
         * there job is to construct objects
         * 3-for one object constructor can be called only one time
         */
        // As soon as we put new keyword here a space will be allocated inside a heap
        // memory and our object will store there
        p.color = "Yellow";
        p.type = "ball";

        Pen1 p1 = new Pen1();
        p1.color = "Blue";
        p1.type = "Gel";

        p.coloris();
        p.write();
        p1.coloris();
        p1.write();
    }
}
