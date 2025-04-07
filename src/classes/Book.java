package classes;

public class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void info() {
        System.out.println("도서명:" + this.title + ", 작가:" + this.author + ", 가격:" + this.price);
    }
}
