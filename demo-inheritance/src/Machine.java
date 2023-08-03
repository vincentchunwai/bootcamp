public class Machine {
  
  private double weight;


  public Machine(){

  }
  
  public Machine(double weight){
    this.weight = weight;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public double getWeight(){
    return this.weight;
  }

  public void start(){
    System.out.println("Machine starting ...");
  }

  public void stop(){
    System.out.println("Machine stops ...");
  }

  public static final String staticMethod(String x, String y){
    return x + y;
  }

  public static Machine produce(int code){
    switch(code){
      case 1:
      return new Machine();
      case 2:
      return new Laptop();
      /* case 3:
      return new Television(); */
    }
    return new Machine();
  }

  public static void stop(int code){
    Machine machine1 = Machine.produce(code);
    machine1.stop(); //different child class , different execution
  }

  public static void main(String[] args) {
    Machine machine1 = Machine.produce(1); // Machine
    machine1.stop();
    Machine machine2 = Machine.produce(2); // laptop
    machine2.stop();
    int pocketMoney = 1000;
    boolean stopCondition = pocketMoney < 0;
    int code = 1;

    if (stopCondition){
      Machine.stop(code);
    }
  }

}
