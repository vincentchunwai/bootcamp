import java.util.Random;
public class Person implements Player {

  private Pocket[] pockets;

  public Person(){
    pockets = new Pocket[2];
    pockets[0] = new Pocket();
    pockets[1] = new Pocket();
  }

  @Override
  public int calculateScore(){
    return this.getLeftPocket().TotalScore() + this.getRightPocket().TotalScore();
  }


  public Pocket getLeftPocket(){
    return this.pockets[0];
  }

  public Pocket getRightPocket(){
    return this.pockets[1];
  }



  public static void main(String[] args) {
    Person p1 = new Person();
    Player.fillThePocket(p1.getLeftPocket());
    Player.fillThePocket(p1.getRightPocket());
    System.out.println(p1.getLeftPocket().getSize());
    System.out.println(p1.getRightPocket().getSize());
    System.out.println();

    System.out.println("p1 Total Score: " + p1.calculateScore());
    System.out.println("p1 Left Pocket Ball Details: " +
    p1.getLeftPocket().toString());
    System.out.println("p right Pocket Ball Details: " +
    p1.getRightPocket().toString());

    Person p2 = new Person();
    Player.fillThePocket(p2.getLeftPocket());
    Player.fillThePocket(p2.getRightPocket());
    System.out.println(p2.calculateScore());
    
    

  }

}
