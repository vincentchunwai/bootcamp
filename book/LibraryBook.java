package book;

public abstract class LibraryBook extends Book {
  private String borrowDate = "";
  private String returnDate = "";

  public LibraryBook(){

  }
  public LibraryBook (String borrowDate, String returnDate, int publicationYear, String author, String title){
    super(publicationYear,author, title);
  }

  public void setBorrowDate(String borrowDate){
    this.borrowDate = borrowDate;
  }

  public void setReturnDate(String returnDate){
    this.returnDate = returnDate;
  }

  public String getBorrowDate(){
    return this.borrowDate;
  }

  public String getReturnDate(){
    return this.returnDate;
  }

  
  public abstract String getGenre();
  

  public abstract String getSummary();
  

}
