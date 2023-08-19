public class Main {
    public static void main(String[] args) {
        // Using the non-static (inner) nested class
        Outer outerInstance = new Outer();
        Outer.Inner innerInstance = outerInstance.new Inner();
        innerInstance.printOuterValue();

        // Using the static nested class
        Outer.Nested nestedInstance = new Outer.Nested();
        nestedInstance.printStaticOuterValue();
    }
}