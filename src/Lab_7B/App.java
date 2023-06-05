public class App {
    public static void main(String[] args) {
        EBook eBook = new EBook("www.ebook.com",2.5);
        eBook.setIsbn(123456);
        eBook.setPrice(12.50);
        eBook.setTitle("An Ebook");
        eBook.setAuthor("Ebook Writer");

        System.out.println(eBook.toString());
        System.out.println();

        PaperBook paperBook = new PaperBook(43009, "A Paper Book", "Paper Book Writer", 11.56, 0.3, true);

        System.out.println(paperBook.toString());
        
    }
}
