public abstract class Building { // abstract class or class 

  public void print(){
    System.out.println("I am Building");
  }

  //Override by House's print method
  public void print2(){
    this.print();
  }

  

  
}
