public interface Player {
  
  int calculateScore();

  public static void fillThePocket(Pocket pocket){
   
    while(!pocket.isFull()){
      // Random a ball with random color

      pocket.add(Ball.random());
    }
  }
}
