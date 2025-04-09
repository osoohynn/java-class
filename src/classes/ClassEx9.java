package classes;

class Book1 {
    private String title;
    private String author;
    private int pages;

    public Book1(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book1(String title, String author) {
        this(title, author, 0);
    }

    public Book1() {
        this("", "", 0);
    }

    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + pages);
    }
}

public class ClassEx9 {
    public static void main(String[] args) {
        Book1 book1 = new Book1();
        book1.displayInfo();
        Book1 book2 = new Book1("Hello Java", "Seo");
        book2.displayInfo();
        Book1 book3 = new Book1("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();
    }
}
