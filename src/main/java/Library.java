import java.util.ArrayList;
public class Library {
    
    ArrayList<Book> books;

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(String ISBN){
        for(int i = 0; i<this.books.size(); i++){
            if ((books.get(i).getISBN() == ISBN)){
                books.remove(i);
                i = this.books.size();
            }
        }
    }

    public Book[] searchBook(String title){
        ArrayList<Book> store = new ArrayList<Book>();
        for(int i = 0; i<this.books.size(); i++){
            if ((books.get(i).getTitle() == title)){
                store.add(books.get(i));
            }}
            Book[] arr = new Book[store.size()];
            return store.toArray(arr);
    }

    public Book[] displayBooks(){
        Book[] arr = new Book[this.books.size()];
        return this.books.toArray(arr);
    }
}
