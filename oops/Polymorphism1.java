
/*
 * Polymorphism is considered one of the important features of Object-Oriented
 * Programming.
 * Polymorphism allows us to perform a single action in different ways.
 * In other words, polymorphism allows you to define one interface(method)and
 * have
 * multiple implementations
 */

// 1-Function overloading(Method Overloading)(COmpile time polymorphism)(static polymorphism)
/*
 * When there are multiple functions with the same name but different parameters
 * then these functions are said to be overloaded.
 * Functions can be overloaded by changes in the number of
 * arguments(parameters) 
 */

public class Polymorphism1 {
    static void printname(String name) {
        System.out.println(name);
    }

    // Same name different parameters and functionalities
    // Compile time polymorphism Means it will detect problems while compiling.
    // Hence it is preffered over run
    // time compilation

    static void printname(int age) {
        System.out.println(age);
    }

    static void printname() {
        System.out.println("yes");
    }

    // Here return type is changed still it is important to change parameter or add
    // additional parameter
    /*
     * In order to overload a method in Java, multiple methods with the same name
     * but distinct argument lists must be created.
     * Either the parameter lists should contain a distinct number of parameters or
     * a variety of parameters.
     * The method that is called is chosen without regard to the return type.
     */
    static int printname(int age, String name) {
        return age;

    }

    static void printname(int age, String name, int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        String name = "Shruti";
        int age = 21;
        int a = 1;
        printname();
        printname(age);
        printname(name);
        printname(age, name, a);
        System.out.println(printname(age, name));
    }
}