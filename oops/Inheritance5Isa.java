
//Is a Relationship(Inheritance)
//Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
class SolarSystem {
}

class Earth extends SolarSystem {
}

class Mars extends SolarSystem {
}

public class Inheritance5Isa extends Earth {
    public static void main(String args[]) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
        Inheritance5Isa i = new Inheritance5Isa();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
        System.out.println(i instanceof SolarSystem);
    }
}
