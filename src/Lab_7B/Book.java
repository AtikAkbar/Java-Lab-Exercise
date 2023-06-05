package Lab_7B;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private double price;

    public Book() {
        this.isbn = 0;
        this.title = null;
        this.author = null;
        this.price = 0.0;
    }
    public Book(int isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Isbn: " + this.isbn + "\nTitle:  " + this.title  + "\nAuthor: " + this.author + "\nPrice: " + this.price;
    }
}
