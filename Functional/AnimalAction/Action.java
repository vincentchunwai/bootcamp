package AnimalAction;

public enum Action {
  
  MEOW{
    @Override
    public Pet getPet(){
      return new Cat();
    }
  },
  WOOF{
    @Override
    public Pet getPet(){
      return new Dog();
    }

  },
  ;
  public abstract Pet getPet();

public static void main(String[] args) {
  Action action = Action.MEOW;
  Pet cat = action.getPet();

  System.out.println(cat);
}
}