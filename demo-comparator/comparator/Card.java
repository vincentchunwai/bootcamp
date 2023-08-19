package comparator;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Card extends Paper{
  int number;

  public Card(int number, int size){
    super(size);
    this.number = number;
  }

  @Override
  public String toString(){
    return "Card " + this.number + ", size : " + super.size;  
  }

  public static void main(String[] args) {
    Card card = new Card(1, 19);
    List<Card> cards = Arrays.asList(new Card(2, 26), new Card(3, 24), card);
    Collections.sort(cards, new SortByNumber());
    System.out.println(cards);

    List<? super Number> numbers = new ArrayList<>();
    List<? extends Number> numbers2 = new ArrayList<>();

    //List<Number> numbers = new ArrayList<Integer>(); -> cannot conduct Polymorphism inside <>
    Number number = new Integer(10); //Polymorphism

    
    numbers.add(2.0);
    numbers.add(30);
    numbers.add(2000000000);
    

    System.out.println(numbers);
  }
}
