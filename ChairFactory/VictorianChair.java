package ChairFactory;

public class VictorianChair extends ChairBluePrint implements Chair{
  
  public VictorianChair(int numOfLegs){
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
  public VictorianChair createChair(){
    return new VictorianChair(numOfLegs);
  }
}
