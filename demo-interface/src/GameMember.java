public abstract class GameMember {

  int score;

  public int getScore(){
    return this.score;
  }

  public void setScore(int score){
    this.score = score;
  }

  public void addScore(int score){
    this.score += score;
  }

  public void print(){
    System.out.println("GameMember is Jumping");;
  }

  public abstract void up();
  

  public abstract void down();

  public abstract void left();

  public abstract void right();
  
  public static void upOnce(GameMember... members){ // multiple args
    for (GameMember member : members){
      member.up();
    }
  }
  public static void upOnce(Move[] members){ // multiple args
    for (Move member : members){
      member.jump();
    }
  }
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    GameMember.upOnce(dog, cat);
    System.out.println(dog.getScore()); //2
    System.out.println(cat.getScore()); //1

    //GameMember.upOnce(new Dog(), new Cat());
    GameMember.upOnce(new Move[] {dog, cat});
    System.out.println(dog.getScore());// 5 (2+3)
    System.out.println(cat.getScore());// 5 (1+4)
    dog.print();
    cat.print();
    String str = Move.concat("hello", "world");
   
    Cow cow = new Cow();
    cow.print();
    
  }
}
