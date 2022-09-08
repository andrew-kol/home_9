import java.util.Objects;

public class Book {
private final String name;
private final Author author;

private Integer publicationYear;

    public Book(String name, Author author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public int hashCode () {

        return Objects.hash (name, author, publicationYear);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass() ) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);


    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
