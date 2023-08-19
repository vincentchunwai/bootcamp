package person;

import java.util.List;

public interface Swimmable {
  void swim();

  //public static <T extends Swimmable> void start(List<T> humans){
  public static void start(List<? extends Swimmable> humans){
    for (Swimmable human : humans){
      human.swim();
    }
  }
}
