public class Lung extends Organ {
    private int capacity;

    public Lung(String name, String function, int capacity) {
      super(name, function);
      this.capacity = capacity;
    }

    public int getCapacity() {
      return this.capacity;
    }

    public void breathe() {
      System.out.println(
          "Taking a deep breath with lung capacity: " + capacity + " ml");
    }
  }
