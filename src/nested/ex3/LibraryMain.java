package nested.ex3;

class Library {
    int size;
    Book[] books;
    static int count;

    public Library(int size) {
        this.size = size;
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        if (size > count) {
            Book book = new Book(title, author);
            books[count++] = book;
            System.out.println(count + "번째 책을 저장하였습니다.");
        } else {
            System.out.println("사이즈를 초과하였습니다.");
        }
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println("제목:" + book.title + ", 저자:" + book.author);
        }
    }

    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("책1", "저자1");
        library.addBook("책2", "저자2");
        library.addBook("책3", "저자3");
        library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        library.addBook("OneMoreThing", "잡스");
        library.showBooks();
    }
}
