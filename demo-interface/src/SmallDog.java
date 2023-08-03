public class SmallDog extends Dog{

  @Override
  public void jump(){//this is contract from class Dog;
    super.addScore(5);

  }
  public static void main(String[] args) {
    SmallDog smallDog = new SmallDog();
    smallDog.jump();
    System.out.println(smallDog.getScore());// 5
    smallDog.up();
    System.out.println(smallDog.getScore());
  }
  
}
