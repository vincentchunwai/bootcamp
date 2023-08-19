class Outer {
    private int outerValue = 10;
    private static int staticOuterValue = 20;

    class Inner {
        public void printOuterValue() {
            System.out.println("Inner class accessing outerValue: " + outerValue);
        }
    }

    static class Nested {
        public void printStaticOuterValue() {
            System.out.println("Nested class accessing staticOuterValue: " + staticOuterValue);
        }
    }
}




