package classes;

public class Student1 {
    private String name;
    private int age;
    private int grade;

    public Student1(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public int getGrade() { return this.grade; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(int grade) { this.grade = grade; }

    public void showData() {
        System.out.println("이름: " + this.name + ", 나이: " + this.age + ", 성적: " + this.grade);
    }
}
