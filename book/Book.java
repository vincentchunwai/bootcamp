package book;

import java.util.Objects;

public abstract class Book {
  private int publicationYear;
  private String author;
  private String title;
  
  public Book(){
    
  }

  public Book(int publicationYear, String author, String title){
    this.publicationYear = publicationYear;
    this.author = author;
    this.title = title;
  }

  public void setPublicationYear(int year){
    this.publicationYear = year;
  }

  public void setAuthor(String author){
    this.author = author;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public int getPublicationYear(){
    return this.publicationYear;
  }

  public String getAuthor(){
    return this.author;
  }

  public String getTitle(){
    return this.title;
  }

  public abstract String getGenre();

  public abstract String getSummary();


  @Override
  public int hashCode(){
    return Objects.hash(publicationYear, author, title);
  }

  @Override
  public String toString(){
    return "[publicatoin Year = " + publicationYear + " author = " + author + " title = " + title + "]";
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Book))
    return false;
    Book book = (Book)o;
    return (Objects.equals(this.publicationYear, book.publicationYear) 
    && Objects.equals(this.author, book.author) && Objects.equals(this.title, book.title));
  }


}
