import java.util.Optional;

public class OptionalExamples {
    private Optional<String> optionalValue;

    public OptionalExamples() {
        optionalValue = Optional.empty(); // Initialize as empty
    }

    public void setValue(String value) {
        optionalValue = Optional.ofNullable(value);
    }

    public Optional<String> getValue() {
        return optionalValue;
    }

    public static void main(String[] args) {
        OptionalExamples example = new OptionalExamples();
        System.out.println("Initial value: " + example.getValue());

        example.setValue("Hello, Optional!");
        System.out.println("Updated value: " + example.getValue());

        example.setValue(null); // Setting to null
        if ()
        System.out.println("Value after setting to null: " + example.getValue());
    }
}
