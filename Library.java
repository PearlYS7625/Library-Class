public class Library {
    private String bookName;
    private Book[][] library;

    Library(Book[][] library){
        this.library = library;
    }
    public String getBookName(){
        return this.bookName = bookName;
    }

    public Book[][] getLibrary(){
        return this.library = library;
    }

    public void setLibrary(Book[][] library){
        this.library = library;
    }

    public void setName(String bookName){
        this.bookName = bookName;
    }

    public void addBook(Book book, int section, int shelf, Library library){
        library.getLibrary()[section][shelf] = book;
    }

    public void listBooks(Library library){
        Book[][] temp = library.getLibrary();
        for (int row = 0; row < temp.length-1; row++) {
            for (int col = 0; col < temp[row].length; col++) {
                System.out.println(temp[row][col].toString());
                }
            }
        }


    public Book findBookByTitle(String bookName, Library library){
        Book[][] temp = library.getLibrary();
        Book book1;
        for (int row = 0; row < temp.length-1; row++){
            for (int col = 0; col < temp[row].length; col++){
                if(bookName.equals(temp[row][col].getTitle())){
                    System.out.println("Your book is in section: " + row + "Shelf: " + col);
                    book1 = temp[row][col];

                    }else{
                    System.out.println("Your book does not exist in this library");
                    book1 = null;
                }
            }
        }
        return book1;
    }

}
