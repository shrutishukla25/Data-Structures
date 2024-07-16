// Hierarchical Inheritance
//When two or more classes inherits a single class, it is known as hierarchical inheritance
class AnotherShape {
    void shape() {
        System.out.println("IS shape");

    }
}

class triangle extends AnotherShape {
    void tri() {
        System.out.println("IS triangle");

    }
}

class circle extends AnotherShape {
    void cir() {
        System.out.println("IS circle");

    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        circle c = new circle();
        c.shape();
        c.cir();
        // c.tri();//CT ERROR
    }
}
