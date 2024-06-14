package Reading;

public class Author {
    String name;
    Book[] books = new Book[100];
    int i = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBooks(Book book) {
        books[i] = book;
        i++;

    }

    public Book[] getBooks() {
        return books;
    }
}
