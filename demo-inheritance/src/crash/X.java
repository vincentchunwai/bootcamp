
public class X extends Y{
  
  private String name; // hiding

  public X(String name){
    super("John");
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public String getParentName(){
    return super.getName();
  }

  public static void staticMethod(){
    System.out.println("I am X");
  }

  public static void main(String[] args){
   /*  X x = new X("Peter");
    System.out.println(x.getName());
    System.out.println(x.getParentName());
    System.out.println(((Y) x).getName()); */
    
    Y y = new X("Tommy");
     System.out.println(y.getName());
    X yy = (X)y;
    yy.getName();
     System.out.println(yy.getParentName());
     System.out.println(y.getName());
    /* y.staticMethod(); // I am Y, Hiding
    // You should understand the syntax below
    Y.staticMethod(); // I am Y
    X.staticMethod(); // I am X */
  }
}
