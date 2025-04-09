package classes;

class Construct {
    String name;
    int age;
    int grade;

    public Construct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Construct() {
        this("", 0, 0);
    }

    public Construct(String name) {
        this(name, 0, 0);
    }

    public void print() {
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("성적: " + this.grade);
    }
}

public class ClassEx8 {
    public static void main(String[] args) {
        Construct c1 = new Construct("권수현", 18, 1000);
        Construct c2 = new Construct();
        Construct c3 = new Construct("권수현");

        c1.print();
        c2.print();
        c3.print();
    }
}