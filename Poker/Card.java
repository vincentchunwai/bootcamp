package bootcamp.Poker;

public class Card{
  private Suit suit;
  private Rank rank;

  private Card(Rank rank, Suit suit){
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  public Suit suit(){
    return this.suit;
  }
  public static Card of(Rank rank, Suit suit){
    return new Card(rank, suit);
  }

  public static int compare(Card card1, Card card2){
    if (card1.equals(card2))
    return 0;
  }


  
  
}
