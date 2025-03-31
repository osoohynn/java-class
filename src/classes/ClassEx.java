package classes;

class Student2 {
    String name;
    int age;
    int grade;
}

public class ClassEx {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.name = "김하나";
        s1.age = 10;
        s1.grade = 20;

        s2.name = "이지호";
        s2.age = 20;
        s2.grade = 95;

        Student2[] s = new Student2[2];
        s[0] = s1;
        s[1] = s2;

        for (Student2 student : s) {
            System.out.println("제 이름은 " + student.name + "이고 나이는 " + student.age + "살이고 성적은 " + student.grade + "입니다.");
        }
    }
}