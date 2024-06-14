package Reading;

public class Reader {
    String name;
    int age;
    char sex;
    Book[] readBooks = new Book[100];
    int i = 0;
    public void read(Book book){
        readBooks[i] = book;
        i++;
    }

    public int numberOfBooksRead() {
        return i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }
}
