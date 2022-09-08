public class Main {
    public static void main (String[] args){

        var author =  new Author("Artur", "Family");
        var author1 =  new Author("Artur1", "Family2");
        var author2 = new Author("Artur2", "Family2");
        var book1 = new Book("Book1", author, 1930);
        var book2 = new Book("Book2", author1, 200);
        var book3 = new Book("Book3", author2, 543);

        System.out.println(author);
        System.out.println(book1);
    }
}
