package course_1.objects_and_classes;

public class Book {
    private final String name;
    private final Author author;
    private int pubYear;

    public Book(String name, Author author, int pubYear) {
        this.author = author;
        this.name = name;
        this.pubYear = pubYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPubYear() {
        return this.pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }
}
