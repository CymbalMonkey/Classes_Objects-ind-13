package course_1.objects_and_classes;

public class Book {
    private String name;
    private Author author;
    private int pubYear;

    public Book(String name, Author author, int pubYear) {
        this.author = author;
        this.name = name;
        this.pubYear = pubYear;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return author.getFirstName() + " " + author.getLastName();
    }

    public int getPubYear() {
        return this.pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }
}
