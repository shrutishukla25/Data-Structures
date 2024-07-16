
class Student1 {
    String name;
    int age;

    void info() {
        System.out.println("Name is " + this.name + " Age is " + this.age);
    }

    Student1(String Fname, int currage) {
        this.name = Fname;
        this.age = currage;
    }
}

public class constructor1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Shruti", 34);
        // Student()1 is parameterised constructor

        s1.info();
    }
}
