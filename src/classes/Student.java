package classes;

public class Student {
    String name;
    int studentId;
    int grade;

    public Student(String name, int studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("저는 " + grade + "학년 " + studentId + " " + name + "입니다.");
    }
}
