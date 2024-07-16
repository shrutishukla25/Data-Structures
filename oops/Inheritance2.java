
// multilevel inheritance
/*When there is a chain of inheritance, it is known as multilevel inheritance.
The inheritance in which a class can be derived from another derived class  */
class Animal {
    String name;

    void any() {
        System.out.println("Is Animal");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("is barking");
    }
}

class Babydog extends Dog {
    void weep() {
        System.out.println("is weeping");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {

        Babydog b = new Babydog();
        b.name = "boggo";
        System.out.println(b.name);
        b.any();
        b.bark();
        b.weep();
    }
}
