package extendes;

public class ExtendsEx1 {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album =  new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");
        book.print();
        album.print();
        movie.print();
        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}

class Item {
    public String name;
    public int price;

    public void print() {
        System.out.println("이름:" + this.name + "가격:" + this.price);
    }

    public int getPrice() { return price; }
}

class Book extends Item {
    public String author;
    public String isbn;
    public Book(String name, int price, String author, String isbn) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + this.author + "isbn:" + this.isbn);
    }
}

class Album extends Item {
    public String artist;
    public Album(String name, int price, String artist) {
        this.name = name;
        this.price = price;
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트" + this.artist);
    }
}

class Movie extends Item {
    public String director;
    public String actor;
    public Movie(String name, int price, String director, String actor) {
        this.name = name;
        this.price = price;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독:" + this.director + "배우:" + this.actor);
    }
}