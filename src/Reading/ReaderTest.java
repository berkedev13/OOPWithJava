package Reading;

public class ReaderTest {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Book book1 = new Book();
        Author author1 = new Author();
        reader.setName("Berke");
        reader.setAge(22);
        reader.setSex('M');
        reader.read(book1);
        author1.setName("Ahmet Arslan");
        author1.setBooks(book1);
        book1.setAuthor(author1);
        book1.setCurrentPage(28);
        book1.setPage(240);
        book1.setType("Philosophy");
        book1.setHardCover(false);
        book1.setTitle("Felsefeye Giriş");

        System.out.println(reader.getName() + " is reading " + reader.readBooks[0].author.name + "'s " + reader.readBooks[0].title + " book.");

        System.out.println("*********");

        Book book2 = new Book();
        book2.setTitle("İlkçağ Felsefe Tarihi");
        book2.setType("Philosophy");
        book2.setHardCover(true);
        book2.setPage(624);
        book2.setCurrentPage(0);
        book2.setAuthor(author1);

        reader.read(book2);

        System.out.println(reader.getName() + "'nin okuduğu kitap sayısı: " + reader.numberOfBooksRead() +"\nBu kitaplar:");

        for (int i = 0; i < reader.numberOfBooksRead(); i++) {
            System.out.println(reader.readBooks[i].getTitle());
        }
    }
}
