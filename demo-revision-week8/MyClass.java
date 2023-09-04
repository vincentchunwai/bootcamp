class MyClass {
    private int value;

    // Parameterized constructor
    public MyClass(int value) {
        this.value = value;
    }

    // Default constructor that calls the parameterized constructor
    public MyClass() {
        this(0); // Calls the parameterized constructor with a default value of 0
    }

    public int getValue() {
        return value;
    }
    public static void main(String[] args) {
      //        new MyClass();
      MyClass myClass = new MyClass();
      System.out.println(myClass.getValue());
    }
}
