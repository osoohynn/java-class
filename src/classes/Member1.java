package classes;

public class Member1 {
    private String name;
    private int age;
    private int grade;

    public Member1(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void print() {
        System.out.print("이름: " + this.name);
        System.out.print(" 나이: " + this.age);
        System.out.println(" 성적: " + this.grade);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }


    public static void main(String[] args) {
        Member1[] members = new Member1[] {
                new Member1("user1", 15, 90),
                new Member1("user2", 16, 80)
        };

        for (Member1 member : members) {
            member.print();
        }
    }
}