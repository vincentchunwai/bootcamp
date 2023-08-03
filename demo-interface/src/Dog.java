public class Dog extends GameMember implements Move{

  //int score = 0;
  String name;

  @Override
  public void bigJump(){
  }
  
  @Override
  public void jump(){
    super.addScore(3);
  }

  @Override
  public void left(){
  }

  @Override
  public void right(){

  }

  @Override
  public void up(){
   System.out.println("Dog Moving Up!");
    super.addScore(2);
  }

  @Override
  public void down(){

  }
  
}
