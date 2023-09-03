public class FormatExample {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14159;
        String stringValue = "Hello, world!";
        
        String formattedString = 
        String.format("Integer: %d, Double: %.2f, String: %s", intValue, doubleValue, stringValue);
        
        System.out.println(formattedString);
    }
}

