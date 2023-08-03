package book;

import java.util.List;
import java.util.ArrayList;

public class Library{
  private String name;
  private List<Book> books;

  public Library(String name) {
    this.name = name;
    this.books = new ArrayList<>();
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(Book book) {
    books.remove(book);
  }

  public List<Book> getAllBooks() {
    return books;
  }
  


  public void newArrival(){
    
  }

  public void printBook(){
    for (int i = 0; i <this.books.size(); i++){
      System.out.println("Books no." + i + " = " + books.get(i));
    }
  }

  public static void main(String[] args) {
    Library library = new Library("central library");
  }
}
