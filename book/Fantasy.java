package book;

public class Fantasy extends Book  implements LibraryItem{
  private boolean available;

  public Fantasy(int publicationYear, String author, String title) {
    super(publicationYear, author, title);
    this.available = true;
  }
  public boolean getAvailable(){
    return this.available;
  }

  public void setAvailable(boolean available){
    this.available = available;
  }

  public String getGenre() {
    return "Fantasy";
  }

  public String getSummary() {
    return "This book is about" + this.getTitle() + "written by "
        + this.getAuthor();
  }

  @Override
  public void borrowBook(){
    if (available){
     super.removeBook(this);
     available = false;
    }
    else 
      System.out.println("The book " + this.getTitle() + " is currently not available for borrowing.");
  }
  
  @Override
  public void returnBook(){
    if (!available){
      super.addBook(this);
      available = true;
    }

    
  }
  @Override
    public String toString() {
        return "Fiction Book: " + getTitle() + " by " + getAuthor() + ", published in " + getPublicationYear();
    }



}
