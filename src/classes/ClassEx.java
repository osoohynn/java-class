package classes;

class Student2 {
    private String name;
    private int age;
    private int grade;

    public Student2(String name, int age, int grade) {
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

    public void show() {
        System.out.println("제 이름은 " + this.name + "이고 나이는 " + this.age + "살이고 성적은 " + this.grade + "점 입니다.");
    }
}

public class ClassEx {
    public static void main(String[] args) {
        Student2[] s = new Student2[2];
        s[0] = new Student2("김하나", 18, 20);
        s[1] = new Student2("이지호", 18, 90);

        for (Student2 student : s) {
            student.show();
        }
    }
}