public class Book {
    private String title;
    private String author;
    private String publisher;
    private int isbn;
    private boolean isAvailable;
    private int[][] location;

    Book(String title, String author, String publisher, int isbn, boolean isAvailable, int[][] location){
     this.title = title;
     this.author = author;
     this.publisher = publisher;
     this.isbn = isbn;
     this.isAvailable =isAvailable;
     this.location = location;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public int[][] getLocation(){
        return this.location;
    }
    public int getIsbn(){
        return this.isbn;
    }
    public boolean getIsAvailable(){
        return this.isAvailable;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setLocation(int[][] location){
        this.location = location;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


    public String toString(){
        return ("Title: " + title +"\nAuthor: " + author + "\nPublisher: " + publisher + "\nISBN: " + isbn + "\nIs Available: " + isAvailable + "\nLocation: " + location);
    }
    public boolean borrow(Book book){
        if (book.isAvailable){
            return true;
        }else {
            return false;
        }
    }
}
