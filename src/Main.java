import classes.Book;
import classes.ClassEx3;
import classes.Student;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student("권수현", 2401, 2);
//        student.introduce();

//        Book book = new Book("흰", "한강", 15000);
//        book.info();

        ClassEx3 r1 = new ClassEx3("인셉션", "인생은 무한루프");
        ClassEx3 r2 = new ClassEx3("어바웃 타임", "인생 시간 영화");

        ClassEx3[] r = new ClassEx3[2];
        r[0] = r1;
        r[1] = r2;

        for (ClassEx3 c : r) {
            System.out.println("영화제목: " + c.getTitle() + ", 리뷰: " + c.getReview());
        }
    }
}