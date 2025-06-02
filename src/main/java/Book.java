public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title1, String author1, String ISBN1){
        this.title = title1;
        this.author = author1;
        this.ISBN = ISBN1;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getISBN(){
        return this.ISBN;
    }
}
