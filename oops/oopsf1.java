
//There cannot be two public classes in a single Java program. 
//Additionally, the name of the public class should be the same as the name of the Java file.
/*
 * There are no restrictions on the number of classes that can be present in one Java program. 
 * But each Java program should have only one class declared with public access specifier.
 *  There cannot be two public classes in a single Java program
 */

public class oopsf1 {
    // This is our public class with name same as file name.
    /*
     * public is a key word in Java. By making any variable, methods or class as
     * public ( by prefixing it ),
     * you make that thing available/accessible to others programs/softwares ,
     * outside the Java source code in which it lies/belongs.
     */
    public static void main(String[] args) {
        System.out.println("Write");
    }
}

/*
 * public class Main {
 * // if we describe another public file then it will give error;
 * // -->> The public type Main must be defined in its own file
 * }
 */