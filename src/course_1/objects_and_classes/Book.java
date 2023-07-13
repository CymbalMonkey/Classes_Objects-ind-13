package course_1.objects_and_classes;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Книга: " + name + ", автор: " + author + ", год публикации: " + pubYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPubYear() == book.getPubYear() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getPubYear());
    }
}
