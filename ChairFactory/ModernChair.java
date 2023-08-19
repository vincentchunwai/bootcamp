package ChairFactory;

public class ModernChair extends ChairBluePrint implements Chair {
  
  public ModernChair(int numOfLegs){
    super(numOfLegs);
  }

  @Override
  public void sitOn(){
    System.out.println("you are siting on " + getClass());
  }

  @Override
  public boolean hasLegs(){
    if (this.numOfLegs > 1)
    return true;

    return false;
  } 

  @Override
  public ModernChair createChair(){
    return new ModernChair(numOfLegs);
  } 

  public static void main(String[] args) {
    ModernChair chair = ModernChair.createChair();
  }
}
