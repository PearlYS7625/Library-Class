public class main {
    public static void main(String[] args) {
        int[][] location = new int[1][2];
        Book[][] libraryTemp = new Book[2][2];

        Book book1 = new Book("Catcher in the Rye", "Man", "Marine biology", 12345, false, location);
        Library library1 = new Library(libraryTemp);
        library1.addBook(book1, 1, 1, library1);
        library1.findBookByTitle("Cather in the Rye", library1);
        library1.listBooks(library1);
    }
}
